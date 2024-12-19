package com.noeteric.jpa.jpademo.jpaconnection2.jpaonetomanyinserts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OneToManyTest {
    public static void main(String[] args) {
        List<Project>projectList = new ArrayList<>();

        Project avoota = new Project();
        avoota.setPname("avoota");
        avoota.setStartdate(new Date());
        avoota.setEnddate(new Date());

        Project plumsoft = new Project();
        plumsoft.setPname("plumsoft");
        plumsoft.setStartdate(new Date());
        plumsoft.setEnddate(new Date());

        projectList.add(avoota);
        projectList.add(plumsoft);

        Employee ravi = new Employee();
        ravi.setName("Ravi");
        ravi.setDept("CSE");
        ravi.setSalary(50000);
        avoota.getEmployee().add(ravi);

        Employee chandu  = new Employee();
        chandu.setName("Chandu");
        chandu.setDept("CSE");
        chandu.setSalary(60000);
        avoota.getEmployee().add(chandu);

        Employee tirumala = new Employee();
        tirumala.setName("Tirumula");
        tirumala.setDept("CSE");
        tirumala.setSalary(90000);
        avoota.getEmployee().add(tirumala);

        Employee rahul = new Employee();
        rahul.setName("Rahul");
        rahul.setDept("IT");
        rahul.setSalary(80000);
        plumsoft.getEmployee().add(rahul);

        Employee nagesh = new Employee();
        nagesh.setName("Nagesh");
        nagesh.setDept("IT");
        nagesh.setSalary(70000);
        plumsoft.getEmployee().add(nagesh);

        Employee karthavya = new Employee();
        karthavya.setName("Karthavya");
        karthavya.setDept("IT");
        karthavya.setSalary(75000);
        plumsoft.getEmployee().add(karthavya);
    }
}
