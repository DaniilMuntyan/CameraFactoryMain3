package com.example.demo.converters;

import com.example.demo.entities.camera.CameraBack;
import kpi.trspo.restapp.CameraBackGrpc;
import kpi.trspo.restapp.Dimensions;
import kpi.trspo.restapp.MyUuid;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class CameraBackConverter {
    public static CameraBack convert(CameraBackGrpc calibratorGrpc) {
        return new CameraBack(calibratorGrpc);
    }

    public static CameraBackGrpc convert(CameraBack cameraBack) {
        MyUuid id = MyUuid.newBuilder().setValue(cameraBack.getId().toString()).build();
        com.example.demo.entities.camera.Dimensions dimensions = cameraBack.getDimensions();
        return CameraBackGrpc
                .newBuilder()
                .setBackId(id)
                .setDimensions(Dimensions.newBuilder()
                        .setLength(dimensions.getLength())
                        .setDepth(dimensions.getDepth())
                        .setWidth(dimensions.getWidth()))
                .setColorDepth((cameraBack.getColorDepth() != null) ? cameraBack.getColorDepth(): 0)
                .setMatrixCheck((cameraBack.getMatrixCheck() != null) ? cameraBack.getMatrixCheck(): false)
                .setResolution((cameraBack.getResolution() != null) ? cameraBack.getResolution(): 0)
                .build();
    }
}
