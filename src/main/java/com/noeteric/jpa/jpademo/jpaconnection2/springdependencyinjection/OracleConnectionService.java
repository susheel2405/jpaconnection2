package com.noeteric.jpa.jpademo.jpaconnection2.springdependencyinjection;

public class OracleConnectionService implements ConnectionService{

    @Override
    public void connect(String dbName, String username, String password) {
        System.out.println("Connecting to Oracle database: " + dbName);
    }

}

