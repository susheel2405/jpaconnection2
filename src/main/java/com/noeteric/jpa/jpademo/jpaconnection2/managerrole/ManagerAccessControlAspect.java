package com.noeteric.jpa.jpademo.jpaconnection2.managerrole;

import com.noeteric.jpa.jpademo.jpaconnection2.springbeallifecycle.AppConfig;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


import org.aspectj.lang.annotation.Before;

@Aspect
@Component
public class ManagerAccessControlAspect {
    @Before("execution(* LockerService.accessLocker(..)) && args(customerName)")
    public void checkAccess(String customerName) {
        String userRole = getUserRole(); // Simulate fetching the user role
        if (!"Manager".equals(userRole)) {
            throw new SecurityException("Access Denied: Only Managers can manage locker access.");
        }

        Customer customer = getCustomerByName(customerName);
        if (customer == null || !customer.hasLockerAccess()) {
            System.out.println("Access Denied: Customer " + customerName + " does not have locker access.");
            System.out.println("Manager access required to access the locker.");
            throw new SecurityException("Access Denied: Manager action required.");
        }

        System.out.println("Access granted to customer: " + customerName);
    }

    private String getUserRole() {
        // Simulating user role retrieval, hardcoded for demonstration.
        return "Manager"; // Change this to "Employee" or other roles to test.
    }

    private Customer getCustomerByName(String name) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        LockerService lockerService = context.getBean(LockerService.class);
        return lockerService.getCustomers().stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
