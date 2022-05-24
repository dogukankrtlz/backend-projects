package com.pluralsight.fastpassui;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FastPassToll {

    private String fastPassId;
    private String stationId;
    private Float amountPaid;


}
