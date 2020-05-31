package com.akr.springbasics.samplejavaconfiguration;

import com.akr.springbasics.samplejavaconfiguration.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main (String args[]) {
        //EmployeeService employeeService = new EmployeeServiceImpl();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();

        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        System.out.println("current employees are: " + employeeService.findAll());
    }
}
