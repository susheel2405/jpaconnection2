package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.noeteric.jpa.jpademo.jpaconnection2.springioc")
@Configuration
public class SpringCoreConfiguration {
    @Bean(name = "externalJavaService")
    public ExternalJavaService externalJavaService(){
        ExternalJavaService externalJavaService = new ExternalJavaService();
        return externalJavaService ;
    }

    @Bean
    public TCPConnectionService tcpConnectionService(){
        return new TCPConnectionService();
    }

    @Bean
    public ConnectionService mysqlConnectionService(TCPConnectionService tCPConnectionService){

        return new MysqlConnectionService(tCPConnectionService );
    }

    @Bean
    public ConnectionService oracleConnectionService(TCPConnectionService tCPConnectionService){

        return new OracleConnectionService(tCPConnectionService );
    }
}
