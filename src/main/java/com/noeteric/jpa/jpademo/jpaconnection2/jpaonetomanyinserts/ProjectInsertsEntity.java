//package com.noeteric.jpa.jpademo.jpaconnection2.jpaonetomanyinserts;
//
//
//import com.noeteric.jpa.jpademo.jpaconnection2.jpaprep.EmployeeEntity;
//import jakarta.persistence.*;
//import lombok.Data;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "project_latest_jpa",schema = "sys")
//@Data
//public class ProjectInsertsEntity {
//
//    @Id
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "pname")
//    private String name;
//
//    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<com.noeteric.jpa.jpademo.jpaconnection2.jpaprep.EmployeeEntity> employees;
//
//    @Column(name = "startdate")
//    private Date startDate;
//
//    @Column(name = "enddate")
//    private Date endDate;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<com.noeteric.jpa.jpademo.jpaconnection2.jpaprep.EmployeeEntity> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<EmployeeEntity> employees) {
//        this.employees = employees;
//    }
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(Date startDate) {
//        this.startDate = startDate;
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(Date endDate) {
//        this.endDate = endDate;
//    }
//
//
//    @Override
//    public String toString() {
//        return "ProjectEntity{" +
//                "employees=" + employees +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", startDate=" + startDate +
//                ", endDate=" + endDate +
//                '}';
//    }
//
//
//}
