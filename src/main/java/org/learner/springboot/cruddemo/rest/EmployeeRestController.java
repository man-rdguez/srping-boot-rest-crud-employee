package org.learner.springboot.cruddemo.rest;

import org.learner.springboot.cruddemo.dao.EmployeeDAO;
import org.learner.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // quick and dirty: inject employee DAO (use constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO ) {
        this.employeeDAO = employeeDAO;
    }

    // expose "/employees" and return a list of employees
    @GetMapping( "/employees" )
    public List<Employee> getEmployees() {
        return employeeDAO.findAll();
    }

}
