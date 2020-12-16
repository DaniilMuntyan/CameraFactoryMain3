package com.example.demo.requests.calibration;

import com.example.demo.entities.camera.Camera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class CalibrateCameraDTO {
    private UUID calibratorId;
    private Camera camera;
}
