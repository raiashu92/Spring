package com.akr.springbasics.samplexmlconfiguration.service;

import com.akr.springbasics.samplexmlconfiguration.model.Employee;
import com.akr.springbasics.samplexmlconfiguration.repository.EmployeeRepository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl() {
        System.out.println("EmployeeServiceImpl: inside default constructor");
    }

    public EmployeeServiceImpl(PrintSomething printIt) {
        System.out.print("EmployeeServiceImpl: inside param constructor - ");
        printIt.printString();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("inside EmployeeServiceImpl's setter injection");
        this.employeeRepository = employeeRepository;
    }

}
