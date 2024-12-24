package com.noeteric.jpa.jpademo.jpaconnection2.springdependencyinjection;

import java.sql.Connection;
public interface ConnectionService {
    void connect(String dbName, String username, String password);

}

