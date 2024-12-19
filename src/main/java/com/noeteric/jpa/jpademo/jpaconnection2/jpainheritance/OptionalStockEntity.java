package com.noeteric.jpa.jpademo.jpaconnection2.jpainheritance;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "optional_stock", schema = "sys")
public class OptionalStockEntity extends StockEntity {


    private double strikePrice;

    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }
}
