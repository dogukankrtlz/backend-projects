package com.cloud.customerservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetails {
    private String contactId;
    private String contactName;
    private String postalCode;
}
