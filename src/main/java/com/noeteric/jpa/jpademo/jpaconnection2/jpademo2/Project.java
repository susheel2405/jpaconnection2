package com.noeteric.jpa.jpademo.jpaconnection2.jpademo2;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project", schema = "sys")
@Data

public class Project {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "pname")
    private String pname;

   @OneToMany(mappedBy = "project")
    private List<Employee> employees;


   @Column(name = "startdate",nullable = false)
    private Date startdate;


   private Project(){

   }

    @Override
    public String toString() {
        return "Project{" +
                "employees=" + employees +
                ", id=" + id +
                ", pname='" + pname + '\'' +
                ", startdate=" + startdate +
                '}';
    }

    @Column(name = "enddate", nullable = false)
    private Date enddate;
}
