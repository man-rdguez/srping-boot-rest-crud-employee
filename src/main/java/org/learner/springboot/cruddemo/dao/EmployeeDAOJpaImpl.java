package org.learner.springboot.cruddemo.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.learner.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define field for EntityManager
    private final EntityManager entityManager;

    // setup constructor injection
    @Autowired
    public EmployeeDAOJpaImpl( EntityManager entityManager ) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        // Create a query
        TypedQuery<Employee> typedQuery = entityManager.createQuery( "FROM Employee", Employee.class );

        // Execute query and get the result list
        List<Employee> employees = typedQuery.getResultList();

        // Return the results
        return employees;
    }
}
