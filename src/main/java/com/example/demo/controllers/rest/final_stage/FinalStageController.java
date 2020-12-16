package com.example.demo.controllers.rest.final_stage;

import com.example.demo.controllers.EndPoints;
import com.example.demo.controllers.GlobalVariables;
import com.example.demo.requests.final_stage.FinalCheckDTO;
import com.example.demo.entities.camera.Camera;
import com.example.demo.entities.employees.Manager;
import com.example.demo.entities.employees.Technician;
import com.example.demo.entities.machines.Packer;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public final class FinalStageController {
    private Technician technician;
    private Manager manager;
    private Packer packer;

    public FinalStageController(Technician technician, Manager manager, Packer packer) {
        this.technician = technician;
        this.manager = manager;
        this.packer = packer;
    }

    public Camera finalStage(Camera camera) {
        FinalCheckDTO finalCheckDTO = new FinalCheckDTO(technician.getId(), packer.getId(), manager.getId(), camera);

        HttpEntity<FinalCheckDTO> finalCheckDTOHttpEntity = new HttpEntity<>(finalCheckDTO);

        ResponseEntity<Camera> cameraResponseEntity = GlobalVariables.restTemplate
                .postForEntity(EndPoints.FINAL_STAGE, finalCheckDTOHttpEntity, Camera.class);

        return cameraResponseEntity.getBody();
    }
}
