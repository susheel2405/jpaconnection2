package com.noeteric.jpa.jpademo.jpaconnection2.managerrole;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public LockerService lockerService() {
        return new LockerService();
    }

    @Bean
    public ManagerAccessControlAspect accessControlAspect() {
        return new ManagerAccessControlAspect();
    }
}
