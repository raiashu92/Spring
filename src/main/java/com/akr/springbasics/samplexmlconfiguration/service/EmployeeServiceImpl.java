package com.akr.springbasics.samplexmlconfiguration.service;

import com.akr.springbasics.samplexmlconfiguration.model.Employee;
import com.akr.springbasics.samplexmlconfiguration.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("inside EmployeeServiceImpl's setter injection");
        this.employeeRepository = employeeRepository;
    }
}
