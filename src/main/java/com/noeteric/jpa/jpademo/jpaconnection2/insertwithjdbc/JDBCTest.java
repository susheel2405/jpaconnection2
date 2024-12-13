package com.noeteric.jpa.jpademo.jpaconnection2.insertwithjdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCTest {
    public static void main(String[] args) {
        List<Project>projectList = new ArrayList<>();
        Project avoota = new Project();
        avoota.setPname("avoota");
        avoota.setStartdate(new Date());
        avoota.setEnddate(new Date());

        Project neo = new Project();
        neo.setPname("neo");
        neo.setStartdate(new Date());
        neo.setEnddate(new Date());


        Employee ravi = new Employee();
        ravi.setDept("CSE");
        ravi.setName("Ravi");
        ravi.setSalary(50000);
        ravi.setState("TG");
        avoota.getEmployeeList().add(ravi);


        Employee karthavya = new Employee();
        karthavya.setDept("CSE");
        karthavya.setName("karthavya");
        karthavya.setSalary(60000);
        karthavya.setState("TG");
        avoota.getEmployeeList().add(karthavya);


        Employee nagesh = new Employee();
        nagesh.setDept("CSE");
        nagesh.setName("Nagesh");
        nagesh.setSalary(70000);
        nagesh.setState("TG");
        avoota.getEmployeeList().add(nagesh);


        Employee rakesh = new Employee();
        rakesh.setDept("CSE");
        rakesh.setName("Rakesh");
        rakesh.setSalary(80000);
        rakesh.setState("TG");
        neo.getEmployeeList().add(rakesh);



        Employee ganesh = new Employee();
        ganesh.setDept("CSE");
        ganesh.setName("Ganesh");
        ganesh.setSalary(90000);
        ganesh.setState("TG");
        neo.getEmployeeList().add(ganesh);



        Employee sukumar = new Employee();
        sukumar.setDept("CSE");
        sukumar.setName("Sukumar");
        sukumar.setSalary(100000);
        sukumar.setState("TG");
        neo.getEmployeeList().add(sukumar);




        projectList.add(avoota);
        projectList.add(neo);


        JDBCParentChildInsertService jdbcParentChildInsertService = new JDBCParentChildInsertService();
        jdbcParentChildInsertService.saveProjectEmp(projectList);





    }
}
