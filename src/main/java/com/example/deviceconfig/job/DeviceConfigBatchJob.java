package com.example.deviceconfig.job;

import com.example.deviceconfig.entity.Device;
import com.example.deviceconfig.repository.DeviceRepository;
import com.example.deviceconfig.service.DeviceNotificationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class DeviceConfigBatchJob {

    private final DeviceRepository deviceRepository;
    private final DeviceNotificationService notificationService;

    public DeviceConfigBatchJob(
            DeviceRepository deviceRepository,
            DeviceNotificationService notificationService) {

        this.deviceRepository = deviceRepository;
        this.notificationService = notificationService;
    }

    @Scheduled(fixedRate = 10000)
    @Transactional
    public void processChangedDevices() {

        List<Device> changedDevices =
                deviceRepository.findByConfigChangedTrue();

        for (Device device : changedDevices) {

            // 1. Send/create notification
            notificationService.createNotification(device);

            // 2. Mark notification as processed
            //device.setConfigChanged(false);

            // 3. Persist the change
            //deviceRepository.save(device);
        }
    }
}