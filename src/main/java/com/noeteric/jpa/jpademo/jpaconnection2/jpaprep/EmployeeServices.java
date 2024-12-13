package com.noeteric.jpa.jpademo.jpaconnection2.jpaprep;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeServices {
    public List<ProjectEntity> nplusone() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select distinct(p) FROM ProjectEntity p inner join p.employees e ", ProjectEntity.class);

        List<ProjectEntity> projectEntities = query.getResultList();

        entityManager.getTransaction().commit();
        return projectEntities;
    }
}
