package com.noeteric.jpa.jpademo.jpaconnection2.springdependencyinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        EmployeeService service = context.getBean(EmployeeService.class);
        service.employeeService();
    }

}

