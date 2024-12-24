package com.noeteric.jpa.jpademo.jpaconnection2.springdependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class SpringConfiguration {
    @Bean
    public ExternalEmployeeService externalEmployeeService(PayService payService){
        return new ExternalEmployeeService(payService);
    }

    @Bean
    public TCPConnection tcpConnection(){
        return new TCPConnection();
    }

    @Bean
    public  ConnectionService mysqlConnectionSerice(TCPConnection tcpConnection){
        return new MysqlConnectionService(tcpConnection);
    }

}

