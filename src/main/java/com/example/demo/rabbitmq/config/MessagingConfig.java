package com.example.demo.rabbitmq.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagingConfig {

    public static final String CREATE_COLLECTOR_QUEUE = "create_collector_queue";
    public static final String CREATE_BACK_QUEUE = "create_back_queue";
    public static final String CREATE_BODY_QUEUE = "create_body_queue";
    public static final String CREATE_LENS_QUEUE = "create_lens_queue";
    public static final String CREATE_CAMERA_QUEUE = "create_camera_queue";
    public static final String GET_COLLECTORS_QUEUE = "get_collectors_queue";
    public static final String CREATE_CALIBRATOR_QUEUE = "create_calibrator_queue";
    public static final String GET_ALL_CALIBRATORS_QUEUE = "create_all_calibrators_queue";
    public static final String CALIBRATE_CAMERA_QUEUE = "calibrate_camera_queue";
    public static final String CREATE_MANAGER_QUEUE = "create_manager_queue";
    public static final String CREATE_TECHNICIAN_QUEUE = "create_technician_queue";
    public static final String CREATE_PACKER_QUEUE = "create_packer_queue";
    public static final String GET_ALL_MANAGERS_QUEUE = "get_all_managers_queue";
    public static final String GET_TECHNICIANS_QUEUE = "get_technicians_queue";
    public static final String GET_PACKERS_QUEUE = "get_packers_queue";
    public static final String FINAL_STAGE_QUEUE = "final_stage_queue";

    public static final String RESPONSE_COLLECTOR_QUEUE = "response_collector_queue";
    public static final String RESPONSE_BACK_QUEUE = "response_collector_queue";
    public static final String RESPONSE_BODY_QUEUE = "response_body_queue";
    public static final String RESPONSE_LENS_QUEUE = "response_lens_queue";
    public static final String RESPONSE_CAMERA_QUEUE = "response_camera_queue";
    public static final String RESPONSE_ALL_COLLECTORS_QUEUE = "response_all_collectors_queue";
    public static final String RESPONSE_CALIBRATOR_QUEUE = "response_calibrator_queue";
    public static final String RESPONSE_GET_ALL_CALIBRATORS_QUEUE = "response_get_all_calibrators_queue";
    public static final String RESPONSE_CALIBRATE_CAMERA_QUEUE = "response_calibrate_camera_queue";
    public static final String RESPONSE_MANAGER_QUEUE = "response_manager_queue";
    public static final String RESPONSE_TECHNICIAN_QUEUE = "response_technician_queue";
    public static final String RESPONSE_PACKER_QUEUE = "response_packer_queue";
    public static final String RESPONSE_ALL_MANAGERS_QUEUE = "response_all_managers_queue";
    public static final String RESPONSE_ALL_TECHNICIANS_QUEUE = "response_all_technicians_queue";
    public static final String RESPONSE_ALL_PACKERS_QUEUE = "response_all_packers_queue";
    public static final String RESPONSE_FINAL_STAGE_QUEUE = "response_final_stage_queue";

    public static final String EXCHANGE = "direct_exchange";

    public static final String CREATE_COLLECTOR_ROUTING = "create_collector_routing_key";
    public static final String CREATE_BACK_ROUTING = "create_back_routing_key";
    public static final String CREATE_BODY_ROUTING = "create_body_routing_key";
    public static final String CREATE_LENS_ROUTING = "create_lens_routing_key";
    public static final String CREATE_CAMERA_ROUTING = "create_camera_routing_key";
    public static final String GET_COLLECTORS_ROUTING = "get_collectors_routing_key";
    public static final String CREATE_CALIBRATOR_ROUTING = "create_calibrator_routing_key";
    public static final String GET_ALL_CALIBRATORS_ROUTING = "get_all_calibrators_routing_key";
    public static final String CALIBRATE_CAMERA_ROUTING = "calibrate_camera_routing";
    public static final String CREATE_MANAGER_ROUTING = "create_manager_routing_key";
    public static final String CREATE_TECHNICIAN_ROUTING = "create_technician_routing_key";
    public static final String CREATE_PACKER_ROUTING = "create_packer_routing_key";
    public static final String GET_ALL_MANAGERS_ROUTING = "get_all_managers_routing_key";
    public static final String GET_TECHNICIANS_ROUTING = "get_technicians_routing_key";
    public static final String GET_PACKERS_ROUTING = "get_packers_routing_key";
    public static final String FINAL_STAGE_ROUTING = "final_stage_routing_key";

    public static final String RESPONSE_BACK_ROUTING = "response_back_routing_key";
    public static final String RESPONSE_COLLECTOR_ROUTING = "response_collector_routing_key";
    public static final String RESPONSE_BODY_ROUTING = "response_body_routing_key";
    public static final String RESPONSE_LENS_ROUTING = "response_lens_routing_key";
    public static final String RESPONSE_CAMERA_ROUTING = "response_camera_routing_key";
    public static final String RESPONSE_ALL_COLLECTORS_ROUTING = "response_all_collectors_routing_key";
    public static final String RESPONSE_CALIBRATOR_ROUTING = "response_calibrator_routing_key";
    public static final String RESPONSE_GET_ALL_CALIBRATORS_ROUTING = "response_get_all_calibrators_routing_key";
    public static final String RESPONSE_CALIBRATE_CAMERA_ROUTING = "response_calibrate_camera_routing_key";
    public static final String RESPONSE_MANAGER_ROUTING = "response_manager_routing_key";
    public static final String RESPONSE_TECHNICIAN_ROUTING = "response_technician_routing_key";
    public static final String RESPONSE_PACKER_ROUTING = "response_packer_routing_key";
    public static final String RESPONSE_ALL_MANAGERS_ROUTING = "response_all_managers_routing_key";
    public static final String RESPONSE_ALL_TECHNICIANS_ROUTING = "response_all_technicians_routing_key";
    public static final String RESPONSE_ALL_PACKERS_ROUTING = "response_all_packers_routing_key";
    public static final String RESPONSE_FINAL_STAGE_ROUTING = "response_final_stage_routing_key";

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        System.out.println("host = " + connectionFactory.getHost() + " port = " + connectionFactory.getPort() +
                " username = " + connectionFactory.getUsername());
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }

}
