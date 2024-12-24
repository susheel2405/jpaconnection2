package com.noeteric.jpa.jpademo.jpaconnection2.conditionalbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocTest {
    public static void main(String[] args) {
        System.setProperty("webservicetype","soap");

        ApplicationContext context = new AnnotationConfigApplicationContext(ConditionalBeanConfiguration.class);

        WebServiceClientService webServiceClientService = context.getBean("webServiceClientService", WebServiceClientService.class);

        webServiceClientService.callRemoteMethod();
    }
}
