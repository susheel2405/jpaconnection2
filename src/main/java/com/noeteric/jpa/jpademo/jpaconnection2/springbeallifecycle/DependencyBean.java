package com.noeteric.jpa.jpademo.jpaconnection2.springbeallifecycle;
import org.springframework.stereotype.Component;

@Component
public class DependencyBean {

    public void execute() {
        System.out.println("DependencyBean: Executing a dependent task.");
    }
}
