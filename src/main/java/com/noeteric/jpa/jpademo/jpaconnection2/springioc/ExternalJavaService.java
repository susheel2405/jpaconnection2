package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ExternalJavaService {


    @Qualifier("oracleConnectionService")
    @Autowired
    ConnectionService connectionService;

    public void external(){
        connectionService.getConnection("abc","abc","abc");
    }

}
