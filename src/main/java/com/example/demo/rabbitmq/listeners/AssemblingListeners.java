package com.example.demo.rabbitmq.listeners;

import com.example.demo.dto.assembling.AssembleBackDTO;
import com.example.demo.dto.assembling.AssembleBodyDTO;
import com.example.demo.dto.assembling.AssembleCameraDTO;
import com.example.demo.dto.assembling.AssembleLensDTO;
import com.example.demo.dto.emplyee.EmployeeDTO;
import com.example.demo.dto.machine_dto.MachineDTO;
import com.example.demo.entities.camera.*;
import com.example.demo.entities.employees.Collector;
import com.example.demo.rabbitmq.AssembleState;
import com.example.demo.rabbitmq.config.MessagingConfig;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import kpi.trspo.restapp.AssembleCamera;
import kpi.trspo.restapp.AssembleLens;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Slf4j
public class AssemblingListeners {

    private final RabbitTemplate template;

    @Autowired
    public AssemblingListeners(RabbitTemplate template) {
        this.template = template;
        AssembleState.assembleCameraDTO = new AssembleCameraDTO();
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_COLLECTOR_QUEUE)
    public void responseCollector(Collector collector) {
        System.out.println("[RabbitMQ] CREATED " + collector.toString());
        AssembleState.state = 1;
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_COLLECTORS_ROUTING,
                "Get collectors");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_BACK_QUEUE)
    public void responseBack(CameraBack cameraBack) {
        System.out.println("[RabbitMQ] ASSEMBLED " + cameraBack.toString());
        AssembleState.state = 2;
        AssembleState.assembleCameraDTO.setCameraBackId(cameraBack.getId());
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_COLLECTORS_ROUTING, "Get collectors");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_BODY_QUEUE)
    public void responseBody(CameraBody cameraBody) {
        System.out.println("[RabbitMQ] ASSEMBLED " + cameraBody.toString());
        AssembleState.state = 3;
        AssembleState.assembleCameraDTO.setCameraBodyId(cameraBody.getId());
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_COLLECTORS_ROUTING, "Get collectors");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_LENS_QUEUE)
    public void responseLens(CameraLens cameraLens) {
        System.out.println("[RabbitMQ] ASSEMBLED " + cameraLens.toString());
        AssembleState.state = 4;
        AssembleState.assembleCameraDTO.setCameraLensId(cameraLens.getId());
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_COLLECTORS_ROUTING, "Get collectors");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_CAMERA_QUEUE)
    public void responseCamera(Camera camera) {
        AssembleState.newCamera = camera;
        System.out.println("[RabbitMQ] ASSEMBLED " + camera.toString());

        String randomName = AssembleState.inputDataHandler.getRandomRobot();
        MachineDTO machineDTO = new MachineDTO(randomName);
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_CALIBRATOR_ROUTING, machineDTO);
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_ALL_COLLECTORS_QUEUE)
    public void getAllCollectors(List<Collector> linked_hashmap) {
        ObjectMapper mapper = new ObjectMapper();
        List<Collector> my_collectors = mapper.convertValue(linked_hashmap, new TypeReference<List<Collector>>() { });
        System.out.println("[RabbitMQ] ALL COLLECTORS " + my_collectors.toString());

        Collector randomCollector = my_collectors.get(new Random().nextInt(my_collectors.size()));
        Dimensions randomDimensions = AssembleState.inputDataHandler.getRandomDimensions();
        Integer randomResolution = 20 + AssembleState.rand.nextInt(100);
        Integer randomColorDepth = 10 + AssembleState.rand.nextInt(100);
        String randomColor = AssembleState.inputDataHandler.getRandomColor();
        Integer randomFocalLength = 10 + AssembleState.rand.nextInt(100);
        LensType randomLensType = AssembleState.inputDataHandler.getRandomLens();

        switch (AssembleState.state) {
            case 1:
                AssembleBackDTO assembleBackDTO = new AssembleBackDTO(randomCollector.getId(), randomDimensions,
                        randomResolution, randomColorDepth);
                template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_BACK_ROUTING, assembleBackDTO);
                break;
            case 2:
                AssembleBodyDTO assembleBodyDTO = new AssembleBodyDTO(randomCollector.getId(), randomDimensions,
                        randomColor);
                template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_BODY_ROUTING, assembleBodyDTO);
                break;
            case 3:
                AssembleLensDTO assembleLensDTO = new AssembleLensDTO(randomCollector.getId(), randomFocalLength,
                        randomLensType);
                template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_LENS_ROUTING, assembleLensDTO);
                break;
            case 4:
                AssembleState.assembleCameraDTO.setCollectorId(randomCollector.getId());
                template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_CAMERA_ROUTING,
                        AssembleState.assembleCameraDTO);
                AssembleState.state = 0;
                break;
            default:
                break;
        }
    }
}
