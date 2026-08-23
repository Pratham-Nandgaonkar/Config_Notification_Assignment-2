package com.example.deviceconfig.dto;

public record DeviceNotification(
        Long deviceId,
        String deviceIp,
        String deviceDetails,
        String message
) {
}