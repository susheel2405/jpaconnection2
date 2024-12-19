package com.noeteric.jpa.jpademo.jpaconnection2.jpainheritance;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "futurestocks", schema = "sys")
public class FutureStockEntity extends StockEntity {

    private Date deliveryDate;

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
