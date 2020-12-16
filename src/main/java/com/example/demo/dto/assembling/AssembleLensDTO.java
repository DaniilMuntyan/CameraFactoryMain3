package com.example.demo.dto.assembling;

import com.example.demo.entities.camera.LensType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class AssembleLensDTO {
    private UUID collectorId;
    private Integer focalLength;
    private LensType lensType;
}
