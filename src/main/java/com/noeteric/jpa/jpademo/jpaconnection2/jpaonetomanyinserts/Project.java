package com.noeteric.jpa.jpademo.jpaconnection2.jpaonetomanyinserts;

import java.util.Date;
import java.util.List;

public class Project {
    private  int id;

    private String pname;

    private Date startdate;

    private Date enddate;

    public Project(){

    }
    private List<Employee> employees;

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Override
    public String toString() {
        return "Project{" +
                "enddate=" + enddate +
                ", id=" + id +
                ", pname='" + pname + '\'' +
                ", startdate=" + startdate +
                '}';
    }
    public List<Employee> getEmployee(){
        return employees;
    }
    public void setEmployee(List<Employee>employee){
        this.employees = employees;
    }
}
