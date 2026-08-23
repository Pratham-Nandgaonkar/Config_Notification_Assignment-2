# API Documentation

## Endpoints

### 1. Get Device Configuration Notifications

Retrieves a list of all devices that have had their configuration changed.

**URL:** `/deviceConfigNotification`

**Method:** `GET`

**Success Response:**

- **Code:** 200 OK
- **Content:** An array of `DeviceNotification` objects.

**Sample Response:**

```json
[
  {
    "deviceId": 1,
    "deviceIp": "192.168.1.10",
    "deviceDetails": "Core Router A",
    "message": "Configuration changed for device 192.168.1.10"
  },
  {
    "deviceId": 2,
    "deviceIp": "10.0.0.5",
    "deviceDetails": "Edge Switch B",
    "message": "Configuration changed for device 10.0.0.5"
  }
]
```

## Data Transfer Objects (DTOs)

### `DeviceNotification`
| Field | Type | Description |
|-------|------|-------------|
| `deviceId` | Long | The unique identifier of the device. |
| `deviceIp` | String | The IP address of the device. |
| `deviceDetails` | String | Additional details or description of the device. |
| `message` | String | Automated message describing the notification. |
