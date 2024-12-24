package com.noeteric.jpa.jpademo.jpaconnection2.conditionalbean;

public class SoapWebServiceImpl implements IntegrationWebService {

    public SoapWebServiceImpl(){
        System.out.println("SoapWebServiceImpl Constructor");
    }
    @Override
    public void sendData(){
        System.out.println(" SoapWebService sendingData");
    }
}
