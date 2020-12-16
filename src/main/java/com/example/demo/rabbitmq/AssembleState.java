package com.example.demo.rabbitmq;

import com.example.demo.InputDataHandler;
import com.example.demo.dto.assembling.AssembleCameraDTO;
import com.example.demo.entities.camera.Camera;
import com.example.demo.entities.employees.Manager;
import com.example.demo.entities.employees.Technician;
import com.example.demo.entities.machines.Packer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@NoArgsConstructor
public final class AssembleState {
    public static int state = 0;
    public static AssembleCameraDTO assembleCameraDTO;
    public static Camera newCamera;
    public static Technician technician;
    public static Manager manager;
    public static Packer packer;
    public static Random rand = new Random();
    public static InputDataHandler inputDataHandler = new InputDataHandler();
}
