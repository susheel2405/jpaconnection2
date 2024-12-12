package com.noeteric.jpa.jpademo.jpaconnection2.jpademo2;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JPAService {

@PersistenceUnit(name = "jpademo")
    private static EntityManagerFactory entityManagerFactory;

public Map<Integer, List<Employee>> getAllocationEmployeeJpa(){
    entityManagerFactory = Persistence.createEntityManagerFactory("jpademo");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Map<Integer,List<Employee>> projectEmployeemap = new HashMap<>();
    try {

        entityManager.getTransaction().begin();
        String sql = "SELECT p.id as projectId1, e.id as employeeId1, e.name as employeeName " +
                "FROM Project p CROSS JOIN Employee e WHERE p.id = e.pid";

        Query query = entityManager.createQuery(sql);
        List<Object[]> resultlist = query.getResultList();
        for (Object[]result:resultlist){
            Integer projectid1 = (Integer) result[0];
            Integer employeeid1 = (Integer) result[1];
            String employeename = (String) result[2];

            if (!projectEmployeemap.containsKey(projectid1)){
                projectEmployeemap.put(projectid1, new ArrayList<>());
            }

            Employee employee = new Employee();
            employee.setId(employeeid1);
            employee.setName(employeename);
            projectEmployeemap.get(projectid1).add(employee);

        }
        entityManager.getTransaction().commit();
    }catch (Exception e){
        e.printStackTrace();
    }
    return projectEmployeemap;

}

}
