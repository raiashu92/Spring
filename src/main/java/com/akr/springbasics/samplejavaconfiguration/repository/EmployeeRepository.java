package com.akr.springbasics.samplejavaconfiguration.repository;

import com.akr.springbasics.samplejavaconfiguration.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> findAll();
}

