package com.example.deviceconfig.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "device_ip")
    private String deviceIp;

    @Column(name = "device_details")
    private String deviceDetails;

    @Column(name = "config_changed")
    private Boolean configChanged;

    public Device() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getDeviceDetails() {
        return deviceDetails;
    }

    public void setDeviceDetails(String deviceDetails) {
        this.deviceDetails = deviceDetails;
    }

    public Boolean getConfigChanged() {
        return configChanged;
    }

    public void setConfigChanged(Boolean configChanged) {
        this.configChanged = configChanged;
    }
}