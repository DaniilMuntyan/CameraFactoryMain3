package com.example.demo.controllers.rest.calibration;

import com.example.demo.controllers.EndPoints;
import com.example.demo.controllers.GlobalVariables;
import com.example.demo.requests.calibration.CalibrateCameraDTO;
import com.example.demo.entities.camera.Camera;
import com.example.demo.entities.machines.Calibrator;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public final class CalibrationController {
    private Calibrator calibrator;

    public CalibrationController(Calibrator calibrator) {
        this.calibrator = calibrator;
    }

    public Camera calibrateCamera(Camera camera) {
        CalibrateCameraDTO calibrateCameraDTO = new CalibrateCameraDTO(calibrator.getId(), camera);
        HttpEntity<CalibrateCameraDTO> calibrateCameraDTOHttpEntity = new HttpEntity<>(calibrateCameraDTO);
        ResponseEntity<Camera> calibrateCameraResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.CALIBRATE_CAMERA, calibrateCameraDTOHttpEntity, Camera.class);

        return calibrateCameraResponseEntity.getBody();
    }
}
