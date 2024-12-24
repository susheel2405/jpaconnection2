package com.noeteric.jpa.jpademo.jpaconnection2.springioc;

public class TCPConnectionService {
    public TCPConnectionService(){
        System.out.println("   TCP ====== ");
    }

    public void connect(){
        System.out.println(" Connected mysql db");
    }
}
