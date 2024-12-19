package com.noeteric.jpa.jpademo.jpaconnection2.insertwithjdbc;

import java.sql.*;
import java.util.List;

public class JDBCParentChildInsertService {

    // creating a class
    public int getmaxProjectid(String query) {

        int max = 0;
        Connection con;

        PreparedStatement psmt;
        ResultSet resultSet;


        //adding try catch block if any exceptions occur
        try {

            //connecting to the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connecting to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "legion@2428");

            // giving prepared statement
            psmt = con.prepareStatement(query);

            // executing the query
            resultSet = psmt.executeQuery();

            // if the resultset is null
            if (resultSet != null && resultSet.next()) {
                max = resultSet.getInt(1) + 1;
            } else {
                max = 1;
            }


        } catch (Exception e) {

        }
        return max;

    }

    public void insertEmp(Employee employee) {
        Connection con;
        PreparedStatement pstmt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "legion@2428");
            pstmt = con.prepareStatement("insert into sys.employee_latest(eid,name,dept,state,salary,pid)" +
                    "values(?,?,?,?,?,?)");

            pstmt.setInt(1, employee.getId());
            pstmt.setString(2, employee.getName());
            pstmt.setString(3, employee.getDept());
            pstmt.setString(4, employee.getState());
            pstmt.setDouble(5, employee.getSalary());
            pstmt.setInt(6, employee.getPid());


            boolean status = pstmt.execute();
            if (status) {
                System.out.println("Insert is successful.............");
            } else {
                System.out.println("Insert failed.............");
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void inserProject(Project project) {
        Connection con;
        PreparedStatement pstmt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "legion@2428");
            pstmt = con.prepareStatement("insert into sys.project_latest(id,pname,startdate,enddate)" +
                    "values(?,?,?,??,?)");

            pstmt.setInt(1, project.getId());
            pstmt.setString(2, project.getPname());
            pstmt.setDate(3, new Date(project.getStartdate().getTime()));
            pstmt.setDate(4, new Date(project.getStartdate().getTime()));

            boolean status = pstmt.execute();
            if (status) {
                System.out.println("Insert Project is successful..........");
            } else {
                System.out.println("Insert Project is failed..........");
            }


        } catch (Exception e) {

        }
    }
    public void saveProjectEmp(List<Project> projects){

        // iterate the project
        for (int i = 0;i<projects.size();i++){
            Project project = projects.get(i);


            // get pid from i need to pass query
            int maxidofProjectId = getmaxProjectid("select max(id) from sys.project_latest");
            project.setId(maxidofProjectId);


            // insert project onto table
            inserProject(project);
            project.getEmployeeList().forEach(employee -> {

                // get max of employee
                int maxIdofEmpId = getmaxProjectid("select max(id) from sus.employee_latest");
                employee.setId(maxIdofEmpId);
                employee.setPid(project.getId());

                // insert employee
                insertEmp(employee);
            });

        }

    }
}