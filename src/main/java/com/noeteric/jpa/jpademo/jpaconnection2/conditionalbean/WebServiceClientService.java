package com.noeteric.jpa.jpademo.jpaconnection2.conditionalbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceClientService {

    public WebServiceClientService(){
        System.out.println("from WebServiceClientService constructor");
    }
    @Autowired
    IntegrationWebService integrationWebService;
    public void callRemoteMethod(){
        integrationWebService.sendData();


    }
}
