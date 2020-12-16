package com.example.demo.controllers.rest.assembling;

import com.example.demo.controllers.EndPoints;
import com.example.demo.controllers.GlobalVariables;
import com.example.demo.requests.assembling.AssembleBackDTO;
import com.example.demo.requests.assembling.AssembleBodyDTO;
import com.example.demo.requests.assembling.AssembleCameraDTO;
import com.example.demo.requests.assembling.AssembleLensDTO;
import com.example.demo.entities.camera.*;
import com.example.demo.entities.employees.Collector;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public final class AssembleController {

    public CameraBack assembleCameraBack(Collector collector, Dimensions dimensions,
                                         Integer resolution, Integer colorDepth) {
        AssembleBackDTO cameraBackDTO = new AssembleBackDTO(collector.getId(), dimensions, resolution, colorDepth);

        HttpEntity<AssembleBackDTO> assembleBack = new HttpEntity<>(cameraBackDTO);

        ResponseEntity<CameraBack> assembleBackResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLE_CAMERA_BACK, assembleBack, CameraBack.class);

        return assembleBackResponseEntity.getBody();
    }

    public CameraBody assembleCameraBody(Collector collector, Dimensions dimensions, String color) {
        AssembleBodyDTO cameraBodyDTO = new AssembleBodyDTO(collector.getId(), dimensions, color);

        HttpEntity<AssembleBodyDTO> assembleBody = new HttpEntity<>(cameraBodyDTO);

        ResponseEntity<CameraBody> cameraBodyResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLE_CAMERA_BODY, assembleBody, CameraBody.class);

        return cameraBodyResponseEntity.getBody();
    }

    public CameraLens assembleCameraLens(Collector collector, Integer focalLength, LensType lensType) {
        AssembleLensDTO cameraLensDTO = new AssembleLensDTO(collector.getId(), focalLength, lensType);

        HttpEntity<AssembleLensDTO> assembleLens = new HttpEntity<>(cameraLensDTO);

        ResponseEntity<CameraLens> cameraLensResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLE_CAMERA_LENS, assembleLens, CameraLens.class);

        return cameraLensResponseEntity.getBody();
    }

    public Camera assembleCamera(Collector collector, CameraBack cameraBack,
                                 CameraBody cameraBody, CameraLens cameraLens) {
        AssembleCameraDTO cameraDTO = new AssembleCameraDTO(collector.getId(), cameraBack.getId(),
                cameraBody.getId(), cameraLens.getId());

        HttpEntity<AssembleCameraDTO> assembleCamera = new HttpEntity<>(cameraDTO);

        ResponseEntity<Camera> cameraResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.ASSEMBLE_CAMERA, assembleCamera, Camera.class);

        return cameraResponseEntity.getBody();
    }
}
