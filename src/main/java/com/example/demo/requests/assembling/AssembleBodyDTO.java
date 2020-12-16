package com.example.demo.requests.assembling;

import com.example.demo.entities.camera.Dimensions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class AssembleBodyDTO {
    private UUID collectorId;
    private Dimensions dimensions;
    private String color;
}
