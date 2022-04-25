package com.cloud.customerservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDetails {
    private String customerId;
    private String carType;
    private String licensePlate;
}
