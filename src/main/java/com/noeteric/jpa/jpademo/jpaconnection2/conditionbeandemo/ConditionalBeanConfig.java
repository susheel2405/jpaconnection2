package com.noeteric.jpa.jpademo.jpaconnection2.conditionbeandemo;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalBeanConfig {
    @Bean
    @ConditionalOnProperty(name = "feature.enabled", havingValue = "true", matchIfMissing = false)

    private MMyService mMyService(){
        return mMyService();
    }

}
