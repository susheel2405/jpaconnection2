package com.noeteric.jpa.jpademo.jpaconnection2.jpaonetomanyinserts;

public class Employee {
    public Employee(){

    }
    private int id;

    private String name;

    private String dept;

    private double salary;

    private Project project;

    private Employee employee;

    private Employee manager;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager(){
        return manager;
    }
    public void setManager(Employee manager){
        this.manager = manager;
    }

    public int getmid(){
        return mid;
    }
    public void setMid(int mid){
        this.mid = mid;
    }
    private int mid;

    private int pid;

    public int getPid(){
        return pid;
    }
    public void setPid(int pid){
        this.pid = pid;
    }
    public AadharDetails getaadharDetails(){
        return aadharDetails;
    }
    private AadharDetails aadharDetails;

    public void setAadharDetails(AadharDetails aadharDetails){
        this.aadharDetails = aadharDetails;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                ", employee=" + employee +
                '}';
    }
}
