package com.example.demo.converters;

import com.example.demo.entities.camera.Camera;
import kpi.trspo.restapp.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class CameraConverter {
    public static Camera convert(CameraGrpc cameraGrpc) {
        return new Camera(cameraGrpc);
    }

    public static CameraGrpc convert(Camera camera) {
        MyUuid id = MyUuid.newBuilder().setValue(camera.getCamera_id().toString()).build();
        CameraBackGrpc cameraBackGrpc = CameraBackConverter.convert(camera.getCameraBack());
        CameraBodyGrpc cameraBodyGrpc = CameraBodyConverter.convert(camera.getCameraBody());
        CameraLensGrpc cameraLensGrpc = CameraLensConverter.convert(camera.getCameraLens());
        CameraGrpc cameraGrpc = CameraGrpc
                .newBuilder()
                .setCameraId(id)
                .setInnerInfo(camera.getInnerInfo())
                .setIsPacked(camera.getIsPacked())
                .setIsFirmware(camera.getIsFirmware())
                .setIsRejected(camera.getIsRejected())
                .setIsWipedClean(camera.getIsWipedClean())
                .setCameraBack(cameraBackGrpc)
                .setCameraBody(cameraBodyGrpc)
                .setCameraLens(cameraLensGrpc)
                .build();
        /*System.out.println("\n\n");
        System.out.println(camera);
        System.out.println("\n--------------");
        System.out.println(cameraGrpc.getAllFields());
        System.out.println("\n--------------");*/
        return cameraGrpc;
    }
}
