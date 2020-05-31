package com.akr.springbasics.samplexmlconfiguration.repository;

import com.akr.springbasics.samplexmlconfiguration.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> findAll();
}
