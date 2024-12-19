package com.noeteric.jpa.jpademo.jpaconnection2.jpainheritance;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "stocks", schema = "sys")
public abstract class StockEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private double price;

private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
