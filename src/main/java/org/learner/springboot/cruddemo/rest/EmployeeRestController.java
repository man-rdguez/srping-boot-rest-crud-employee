package org.learner.springboot.cruddemo.rest;

import org.learner.springboot.cruddemo.dao.EmployeeDAO;
import org.learner.springboot.cruddemo.entity.Employee;
import org.learner.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    // quick and dirty: inject employee DAO (use constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping( "/employees" )
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

}
