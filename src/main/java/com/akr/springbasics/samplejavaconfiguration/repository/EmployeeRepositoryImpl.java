package com.akr.springbasics.samplejavaconfiguration.repository;

import com.akr.springbasics.samplejavaconfiguration.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
    List<Employee> employees = new ArrayList<>();

    @Autowired
    LocalDateTime defaultTime;

    public EmployeeRepositoryImpl() {
        System.out.println("EmployeeRepositoryImpl: in no args contructor ");
        this.employees = new ArrayList<>();
    }

    @PostConstruct
    public void printAfterConstruct() {
        System.out.println("EmployeeRepositoryImpl: after construct " + defaultTime);
    }

    @PreDestroy
    public void printStrBeforeDestroy() {
        System.out.println("EmployeeRepositoryImpl: before destroy");
    }

    public List<Employee> findAll() {
        Employee e1 = new Employee("Ssanjay", "S");
        Employee e2 = new Employee("Dhananjay", "K");
        employees.add(e1);
        employees.add(e2);
        return employees;
    }
}
