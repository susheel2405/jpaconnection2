package com.noeteric.jpa.jpademo.jpaconnection2.jpaprep;


import java.util.List;
public class EmployeeProjectTest {
    public static void main(String[] args) {
        EmployeeServices employeeService = new EmployeeServices();
        List<ProjectEntity> projectList =  employeeService.nplusone();
        for(int i =0 ; i<projectList.size(); i++ ) {
            System.out.println(" Project  " + projectList.get(i));
            projectList.get(i).getEmployees().forEach(emp -> {
                System.out.println("  emp " + emp);
            });

        }
        System.out.println(projectList);

//        EmployeeService employeeService1 = new EmployeeService();
//        List<EmployeeEntity> employeeEntities  = employeeService1.projectAlloctionEmployeesSelfJoin();
//        for(int i =0 ; i<employeeEntities.size(); i++ ) {
//            System.out.println(" Project  " + employeeEntities.get(i));
//            employeeEntities.get(i).getEmployeeList().forEach(emp -> {
//                System.out.println("  emp " + emp);
//            });
//
//        }
//        System.out.println(employeeEntities);

    }
}
