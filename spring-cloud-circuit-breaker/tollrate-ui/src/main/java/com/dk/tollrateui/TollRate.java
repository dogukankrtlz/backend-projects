package com.dk.tollrateui;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TollRate {
    private Integer stationId;
    private Float currentRate;
    private String timestamp;
}
