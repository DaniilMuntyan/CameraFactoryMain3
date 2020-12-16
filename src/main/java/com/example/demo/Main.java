package com.example.demo;

import com.example.demo.controllers.EndPoints;
import com.example.demo.controllers.GlobalVariables;
import com.example.demo.controllers.grpc.Channel;
import com.example.demo.entities.camera.Camera;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

public class Main {
    public static final String splitter = "-----------------------------------------------------------------------" +
            "------------------------------------------------------------------------------------------------------";

    private static void print() {
        System.out.println(splitter);
    }

    public void restGrpc() {
        GlobalVariables.headers.setContentType(MediaType.APPLICATION_JSON);

        ManagedChannel channel = ManagedChannelBuilder.forAddress(EndPoints.IP, EndPoints.GRPC_PORT)
                .usePlaintext()
                .build();
        Channel.channel = channel;

        ProductLifecycle productLifecycle = new ProductLifecycle(channel);
        print();

        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) { // REST
                // Assembling
                Camera newCamera = productLifecycle.assembling(false);
                print();

                // Calibrating
                Camera calibratedCamera = productLifecycle.calibrating(newCamera, false);
                print();

                // Final stage
                productLifecycle.finalStage(calibratedCamera, false);
                print();
            } else { // GRPC
                Camera newCamera = productLifecycle.assembling(true);
                print();

                Camera calibratedCamera = productLifecycle.calibrating(newCamera, true);
                print();

                productLifecycle.finalStage(calibratedCamera, true);
                print();
            }

        }
    }
}
