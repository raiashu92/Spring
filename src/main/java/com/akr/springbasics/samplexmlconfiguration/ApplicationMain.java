package com.akr.springbasics.samplexmlconfiguration;

import com.akr.springbasics.samplexmlconfiguration.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = appContext.getBean("employeeService", EmployeeService.class);
        System.out.println("current employees are: " + employeeService.findAll());
    }
}
