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
@RequestMapping("/api/employee/client")
public class EmployeeRestController {

    @Autowired
    private RestTemplate template;

    String baseUrl = "https://localhost:8080/employee";

    @GetMapping("/{employeeID}")
    public EmployeeVO getEmployeeById(@PathVariable int employeeID) throws Exception {
        EmployeeVO employeeVo = template.getForObject(baseUrl + "/getById/" + employeeID, EmployeeVO.class);
        if (employeeVo == null) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeID);
        }
        employeeVo.setDateOfBirth(EmployeeVO.decryptDOB(employeeVo.getDateOfBirth()));
        return employeeVo;
    }
}
