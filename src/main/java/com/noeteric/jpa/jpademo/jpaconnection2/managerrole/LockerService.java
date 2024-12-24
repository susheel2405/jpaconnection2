package com.noeteric.jpa.jpademo.jpaconnection2.managerrole;

import java.util.ArrayList;
import java.util.List;

public class LockerService {
    private List<Customer> customers;

    public LockerService() {
        this.customers = new ArrayList<>();
        // Initialize customers
        customers.add(new Customer("Susheel", true));
        customers.add(new Customer("Ravi", false));
        customers.add(new Customer("Chandrakala", true));
        customers.add(new Customer("Tirumala", true));
        customers.add(new Customer("Rahul", false));
        customers.add(new Customer("Rakesh", false));
        customers.add(new Customer("Ganesh", true));
        customers.add(new Customer("Naveen", false));
        customers.add(new Customer("Sukumar", true));
        customers.add(new Customer("Karthavya", false));

    }

    public void accessLocker(String customerName) {
        System.out.println(customerName + " is attempting to access the locker...");
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
