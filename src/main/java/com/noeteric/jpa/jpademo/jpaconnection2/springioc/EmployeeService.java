package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    PayService payService;

    public EmployeeService(){
        System.out.println(" from constructor  ===== ");
    }

    public void project(){
        payService.pay();
    }

}
