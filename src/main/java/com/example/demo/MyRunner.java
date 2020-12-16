package com.example.demo;

import com.example.demo.dto.emplyee.EmployeeDTO;
import com.example.demo.dto.machine_dto.MachineDTO;
import com.example.demo.entities.employees.Employee;
import com.example.demo.rabbitmq.AssembleState;
import com.example.demo.rabbitmq.config.MessagingConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(Main.splitter);
        product_lifecycle();
    }

    private void product_lifecycle() {
        InputDataHandler inputDataHandler = new InputDataHandler();
        ArrayList<String> employee = (ArrayList<String>) inputDataHandler
                .getNameSurnamePhone(inputDataHandler.getDataForTesting());
        EmployeeDTO collectorDTO = new EmployeeDTO(employee.get(0), employee.get(1), employee.get(2));
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_COLLECTOR_ROUTING, collectorDTO);

        /*ArrayList<String> employee = (ArrayList<String>) AssembleState.inputDataHandler
                .getNameSurnamePhone(AssembleState.inputDataHandler.getDataForTesting());
        EmployeeDTO employeeDTO = new EmployeeDTO(employee.get(0), employee.get(1), employee.get(2));
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_MANAGER_ROUTING,
                employeeDTO);*/

        /*MachineDTO machineDTO = new MachineDTO(AssembleState.inputDataHandler.getRandomRobot());
        System.out.println("SEND CREATE PACKER. " + machineDTO);
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_PACKER_ROUTING, machineDTO);*/

        /*String randomName = AssembleState.inputDataHandler.getRandomRobot();
        MachineDTO machineDTO = new MachineDTO(randomName);
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.CREATE_CALIBRATOR_ROUTING, machineDTO);*/
    }
}
