package com.noeteric.jpa.jpademo.jpaconnection2.springdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
public class PayService {
    private final EmployeeService employeeService;

    @Autowired
    public PayService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public void payService(){
        System.out.println("Payservice");
        employeeService.employeeService();

    }

}

