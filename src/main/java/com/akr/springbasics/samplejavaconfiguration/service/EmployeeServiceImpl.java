package com.akr.springbasics.samplejavaconfiguration.service;

import com.akr.springbasics.samplejavaconfiguration.model.Employee;
import com.akr.springbasics.samplejavaconfiguration.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
    2 setups:
        - plain Java,
        - Spring with java based configuration, using annotations
 */

//stereotype annotations help in autowiring beans and avoid manual injection
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    //EmployeeRepository repository = new EmployeeRepositoryImpl();
    EmployeeRepository repository;

    public EmployeeServiceImpl() {
        System.out.println("EmployeeServiceImpl: no args constructor");
    }

    //for constructor injection
    public EmployeeServiceImpl(EmployeeRepository repository) {
        System.out.println("EmployeeServiceImpl: in param constructor");
        this.repository = repository;
    }

    @Autowired
    public void setRepository(EmployeeRepository repository) {
        System.out.println("EmployeeServiceImpl: in setter");
        this.repository = repository;
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }
}
