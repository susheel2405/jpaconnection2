package com.noeteric.jpa.jpademo.jpaconnection2.managerrole;

public class Customer {
    private String name;
    private boolean hasLockerAccess;

    public Customer(String name, boolean hasLockerAccess) {
        this.name = name;
        this.hasLockerAccess = hasLockerAccess;
    }

    public String getName() {
        return name;
    }

    public boolean hasLockerAccess() {
        return hasLockerAccess;
    }
}
