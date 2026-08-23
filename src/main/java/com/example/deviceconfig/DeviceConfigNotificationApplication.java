package com.example.deviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DeviceConfigNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeviceConfigNotificationApplication.class, args);
    }
}