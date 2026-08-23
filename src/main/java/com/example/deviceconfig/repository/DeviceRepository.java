package com.example.deviceconfig.repository;

import com.example.deviceconfig.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    List<Device> findByConfigChangedTrue();
}