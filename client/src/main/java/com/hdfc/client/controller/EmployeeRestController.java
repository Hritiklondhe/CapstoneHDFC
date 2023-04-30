package com.hdfc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hdfc.client.Vo.EmployeeVO;
import com.hdfc.client.exception.EmployeeNotFoundException;

@RestController
@RequestMapping("/api/client/employee")
public class EmployeeRestController {

    @Autowired
    private RestTemplate restTemplate;

    String baseUrl = "https://localhost:8080/api/v1/employee";

    @GetMapping("/{employeeId}")
    public EmployeeVO getEmployeeById(@PathVariable Long employeeId) throws Exception {
        EmployeeVO employeeVO = restTemplate.getForObject(baseUrl + "/" + employeeId, EmployeeVO.class);
        if (employeeVO == null) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeId);
        }
        employeeVO.setDateOfBirth(EmployeeVO.decryptDOB(employeeVO.getDateOfBirth()));
        return employeeVO;
    }
}