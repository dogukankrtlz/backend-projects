package com.dk.fastpassui;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FastPassCustomer {
    private String fastPassId;
    private String customerFullName;
    private String customerPhone;
    private Float currentBalance;
}
