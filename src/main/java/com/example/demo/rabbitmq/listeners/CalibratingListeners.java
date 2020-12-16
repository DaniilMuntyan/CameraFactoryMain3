package com.example.demo.rabbitmq.listeners;

import com.example.demo.dto.assembling.AssembleCameraDTO;
import com.example.demo.dto.emplyee.EmployeeDTO;
import com.example.demo.entities.camera.Camera;
import com.example.demo.entities.employees.Collector;
import com.example.demo.entities.employees.Employee;
import com.example.demo.entities.machines.Calibrator;
import com.example.demo.rabbitmq.AssembleState;
import com.example.demo.rabbitmq.config.MessagingConfig;
import com.example.demo.requests.calibration.CalibrateCameraDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class CalibratingListeners {
    private final RabbitTemplate template;

    @Autowired
    public CalibratingListeners(RabbitTemplate template) {
        this.template = template;
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_CALIBRATOR_QUEUE)
    public void responseCalibrator(Calibrator calibrator) {
        System.out.println("[RabbitMQ] CREATED " + calibrator.toString());
        AssembleState.state = 5;
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_ALL_CALIBRATORS_ROUTING,
                "Get calibrators");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_GET_ALL_CALIBRATORS_QUEUE)
    public void getAllCalibrators(List<Calibrator> linked_hashmap) {
        ObjectMapper mapper = new ObjectMapper();
        List<Calibrator> myCalibrators = mapper.convertValue(linked_hashmap, new TypeReference<List<Calibrator>>() { });
        System.out.println("[RabbitMQ] ALL CALIBRATORS " + myCalibrators.toString());
        Calibrator randomCalibrator = myCalibrators.get(new Random().nextInt(myCalibrators.size()));
        if (AssembleState.state == 5) {
            CalibrateCameraDTO calibrateCameraDTO = new CalibrateCameraDTO(randomCalibrator.getId(), AssembleState.newCamera);
            template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CALIBRATE_CAMERA_ROUTING, calibrateCameraDTO);
        }
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_CALIBRATE_CAMERA_QUEUE)
    public void responseCalibrate(Camera camera) {
        System.out.println("[RabbitMQ] CALIBRATED " + camera.toString());
        AssembleState.state = 6;
        AssembleState.newCamera = camera;

        ArrayList<String> employee = (ArrayList<String>) AssembleState.inputDataHandler
                .getNameSurnamePhone(AssembleState.inputDataHandler.getDataForTesting());
        EmployeeDTO employeeDTO = new EmployeeDTO(employee.get(0), employee.get(1), employee.get(2));
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_MANAGER_ROUTING,
                employeeDTO);
    }

}
