package com.example.demo.controllers.grpc;

import io.grpc.ManagedChannel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public final class Channel {
    public static ManagedChannel channel;
}
