package com.example.demo.rabbitmq.listeners;

import com.example.demo.Main;
import com.example.demo.controllers.rest.models.MachineController;
import com.example.demo.dto.emplyee.EmployeeDTO;
import com.example.demo.dto.machine_dto.MachineDTO;
import com.example.demo.entities.camera.Camera;
import com.example.demo.entities.employees.Collector;
import com.example.demo.entities.employees.Manager;
import com.example.demo.entities.employees.Technician;
import com.example.demo.entities.machines.Packer;
import com.example.demo.rabbitmq.AssembleState;
import com.example.demo.rabbitmq.config.MessagingConfig;
import com.example.demo.requests.final_stage.FinalCheckDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

@Component
@Slf4j
public class FinalListeners {
    private final RabbitTemplate template;

    @Autowired
    public FinalListeners(RabbitTemplate template) {
        this.template = template;
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_MANAGER_QUEUE)
    public void responseManager(Manager manager) {
        System.out.println("[RabbitMQ] CREATED " + manager.toString());
        AssembleState.state = 7;
        AssembleState.manager = manager;

        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_ALL_MANAGERS_ROUTING,
                "Get managers");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_ALL_MANAGERS_QUEUE)
    public void responseAllManagers(List<Manager> linked_hashmap)  {
        if (AssembleState.state == 7) {
            ObjectMapper mapper = new ObjectMapper();
            List<Manager> managers = mapper.convertValue(linked_hashmap, new TypeReference<List<Manager>>() { });
            System.out.println("[RabbitMQ] ALL MANAGERS " + managers.toString());

            ArrayList<String> employee = (ArrayList<String>) AssembleState.inputDataHandler
                    .getNameSurnamePhone(AssembleState.inputDataHandler.getDataForTesting());
            EmployeeDTO employeeDTO = new EmployeeDTO(employee.get(0), employee.get(1), employee.get(2));
            template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_TECHNICIAN_ROUTING, employeeDTO);
        }
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_TECHNICIAN_QUEUE)
    public void responseTechnician(Technician technician) {
        System.out.println("[RabbitMQ] CREATED " + technician.toString());
        AssembleState.state = 8;
        AssembleState.technician = technician;
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_TECHNICIANS_ROUTING, "Get technicians");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_ALL_TECHNICIANS_QUEUE)
    public void responseAllTechnicians(List<Technician> linked_hashmap) {
        ObjectMapper mapper = new ObjectMapper();
        List<Technician> technicians = mapper.convertValue(linked_hashmap, new TypeReference<List<Technician>>() { });
        System.out.println("[RabbitMQ] ALL TECHNICIANS " + technicians.toString());

        if (AssembleState.state == 8) {
            MachineDTO machineDTO = new MachineDTO(AssembleState.inputDataHandler.getRandomRobot());
            template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_PACKER_ROUTING, machineDTO);
        }
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_PACKER_QUEUE)
    public void responsePacker(Packer packer) {
        System.out.println("[RabbitMQ] CREATED " + packer.toString());
        AssembleState.state = 9;
        AssembleState.packer = packer;
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.GET_PACKERS_ROUTING, "Get packers");
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_ALL_PACKERS_QUEUE)
    public void responseAllPackers(List<Packer> linked_hashmap) {
        ObjectMapper mapper = new ObjectMapper();
        List<Packer> packers = mapper.convertValue(linked_hashmap, new TypeReference<List<Packer>>() { });
        System.out.println("[RabbitMQ] ALL PACKERS " + packers.toString());
        if(AssembleState.state == 9) {
            FinalCheckDTO finalCheckDTO = new FinalCheckDTO(AssembleState.technician.getId(), AssembleState.packer.getId(),
                    AssembleState.manager.getId(), AssembleState.newCamera);
            template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.FINAL_STAGE_ROUTING, finalCheckDTO);
        }
    }

    @RabbitListener(queues = MessagingConfig.RESPONSE_FINAL_STAGE_QUEUE)
    public void responseFinalStage(Camera camera) {
        System.out.println("[RabbitMQ] FINAL STAGE " + camera.toString());
        AssembleState.newCamera = camera;
        System.out.println(Main.splitter);
    }

}
