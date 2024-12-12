package com.noeteric.jpa.jpademo.jpaconnection2.jpademo2;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "employee", schema = "sys")
@Data
public class Employee {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "dept")
    private String dept;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "mid")
    private int mid;

    @Column(name = "pid")
    private int pid;

    @ManyToOne
    @JoinColumn(name = "pid",referencedColumnName = "id",insertable = false,updatable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "mid",referencedColumnName = "id",insertable = false,updatable = false)
    private Employee manager;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employeeList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                ", manager=" + manager +
                ", employeeList=" + employeeList +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
