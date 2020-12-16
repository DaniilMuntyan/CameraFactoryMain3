package com.example.demo.dto;

import com.example.demo.entities.camera.Camera;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class FinalCheckDTO {
    private UUID technicianId;
    private UUID packerId;
    private UUID managerId;
    private Camera camera;
}
