package com.example.deviceconfig.controller;

import com.example.deviceconfig.dto.DeviceNotification;
import com.example.deviceconfig.service.DeviceNotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeviceNotificationController {

    private final DeviceNotificationService notificationService;

    public DeviceNotificationController(
            DeviceNotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/deviceConfigNotification")
    public List<DeviceNotification> deviceConfigNotification() {
        return notificationService.getNotifications();
    }
}