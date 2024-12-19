package com.noeteric.jpa.jpademo.jpaconnection2.jpainheritance;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restricted_stocks", schema = "sys")
public class RestrictedStockEntity extends StockEntity{
    private int lockInPeriod;  //

    public int getLockInPeriod() {
        return lockInPeriod;
    }

    public void setLockInPeriod(int lockInPeriod) {
        this.lockInPeriod = lockInPeriod;
    }
}
