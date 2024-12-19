package com.noeteric.jpa.jpademo.jpaconnection2.jpaonetomanyinserts;

import jakarta.persistence.*;

import java.awt.dnd.DropTargetEvent;
import java.util.Date;

@Entity
public class AadharEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String aadharNumber;
    private Date issueDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}