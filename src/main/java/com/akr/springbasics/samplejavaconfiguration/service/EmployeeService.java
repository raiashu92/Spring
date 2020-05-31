package com.akr.springbasics.samplejavaconfiguration.service;

import com.akr.springbasics.samplejavaconfiguration.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
}
