package com.example.deviceconfig.service;

import com.example.deviceconfig.dto.DeviceNotification;
import com.example.deviceconfig.entity.Device;
import com.example.deviceconfig.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceNotificationService {

    private final DeviceRepository deviceRepository;

    public DeviceNotificationService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<DeviceNotification> getNotifications() {

        List<Device> changedDevices =
                deviceRepository.findByConfigChangedTrue();

        return changedDevices.stream()
                .map(this::createNotification)
                .toList();
    }

    public void triggerNotifications() {

        List<DeviceNotification> notifications = getNotifications();

        for (DeviceNotification notification : notifications) {

            System.out.println(
                    "DEVICE CONFIGURATION NOTIFICATION: "
                            + notification
            );
        }
    }

    public DeviceNotification createNotification(Device device) {

        return new DeviceNotification(
                device.getId(),
                device.getDeviceIp(),
                device.getDeviceDetails(),
                "Configuration changed for device "
                        + device.getDeviceIp()
        );
    }
}