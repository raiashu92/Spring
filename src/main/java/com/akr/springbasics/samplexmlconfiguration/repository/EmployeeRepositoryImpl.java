package com.akr.springbasics.samplexmlconfiguration.repository;

import com.akr.springbasics.samplexmlconfiguration.model.Employee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    List<Employee> employees;

    public EmployeeRepositoryImpl() {
        System.out.println("EmployeeRepositoryImpl: Inside no param constructor");
        employees = new ArrayList<>();
        Employee employee1 = new Employee(1, "Tendulkar", "Sachin");
        Employee employee2 = new Employee(2, "Dravid", "Rahul");
        employees.add(employee1);employees.add(employee2);
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }
}
