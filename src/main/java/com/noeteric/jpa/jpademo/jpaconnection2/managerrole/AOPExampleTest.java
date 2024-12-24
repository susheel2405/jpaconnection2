package com.noeteric.jpa.jpademo.jpaconnection2.managerrole;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPExampleTest {
    public static void main(String[] args) {
        // Create application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the LockerService bean
        LockerService lockerService = context.getBean(LockerService.class);

        // Display all customers and their access rights
        System.out.println("List of customers and locker access:");
        for (Customer customer : lockerService.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + ", Locker Access: " + customer.hasLockerAccess());
        }

        // Access the locker
        try {
            lockerService.accessLocker("Susheel"); // Change the name to test different customers
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

        // Attempting access for a customer without access
        try {
            lockerService.accessLocker("Ravi"); // Testing for a customer without access
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

        // Close the context
        context.close();
    }
}
