package org.learner.springboot.cruddemo.dao;

import org.learner.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
