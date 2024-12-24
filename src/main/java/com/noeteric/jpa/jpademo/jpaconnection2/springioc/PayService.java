package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {


    ExternalJavaService externalJavaService;

    public PayService(@Autowired ExternalJavaService externalJavaService){
        this.externalJavaService= externalJavaService;
    }

    public void pay(){
        externalJavaService.external();
    }
}
