package com.noeteric.jpa.jpademo.jpaconnection2.conditionalbean;

public class RestWebServiceImpl implements IntegrationWebService {

    public RestWebServiceImpl(){
        System.out.println("RestWebServiceImpl Constructor");
    }
    @Override
    public void sendData(){
        System.out.println(" RestWebService sendingData");
    }

}
