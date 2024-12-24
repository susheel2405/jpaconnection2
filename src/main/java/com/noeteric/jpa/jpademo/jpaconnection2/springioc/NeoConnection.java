package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

public class NeoConnection {


    private String dataBase;

    public NeoConnection(String dbName){
        this.dataBase = dbName;
    }

}
