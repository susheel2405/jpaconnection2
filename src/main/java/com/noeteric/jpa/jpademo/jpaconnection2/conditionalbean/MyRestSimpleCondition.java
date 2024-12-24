package com.noeteric.jpa.jpademo.jpaconnection2.conditionalbean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyRestSimpleCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){
        String type = System.getProperty("webservicetype");
        if (type.equals("rest")){
            return true;
        }
        return false;
    }


}
