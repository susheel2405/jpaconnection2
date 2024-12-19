//package com.noeteric.jpa.jpademo.jpaconnection2.jpaonetomanyinserts;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EmployeeService {
//
//    public void saveJpa(Project project){
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jpademo");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();
//
//        ProjectInsertsEntity projectEntity = new ProjectInsertsEntity();
//
//        projectEntity.setName(project.getPname());
//        projectEntity.setStartDate(project.getStartdate());
//        projectEntity.setEndDate(project.getEnddate());
//        List<EmployeeInsertsEntity> employeeEntityList = new ArrayList<>();
//
//        for (int i = 0;i<project.getEmployee().size();i++){
//            Employee employee = project.getEmployee().get(i);
//            EmployeeInsertsEntity employeeEntity = new EmployeeInsertsEntity();
//            employee.setName(employee.getName());
//            employee.setDept(employee.getDept());
//            employee.setSalary(employee.getSalary());
//            employee.setProject(project);
//            employeeEntityList.add(employeeEntity);
//
//
//            AadharEntity aadharDetails = new AadharEntity();
//            aadharDetails.setAadharNumber(employee.getaadharDetails().getAadharNumber());
//            aadharDetails.setIssueDate(employee.getaadharDetails().getIssueDate());
//            employee.setAadharDetails(employee.getaadharDetails());
//
//
//        }
//    }
//}
