package com.hdfc.client.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    private long employeeId;
    private String employeeName;
    private Date dateOfBirth;

}
