package com.akr.springbasics.samplejavaconfiguration;

import com.akr.springbasics.samplejavaconfiguration.repository.EmployeeRepository;
import com.akr.springbasics.samplejavaconfiguration.repository.EmployeeRepositoryImpl;
import com.akr.springbasics.samplejavaconfiguration.service.EmployeeService;
import com.akr.springbasics.samplejavaconfiguration.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.akr.springbasics.samplejavaconfiguration"})
public class AppConfig {

    /*
    *****
    Instead of wiring manually and creating beans here, we can use auto wiring.

    Add @ComponentScan and use stereotype annotations where valid.
    *****
     */

    /*

    @Bean(name = "employeeRepo")
    public EmployeeRepository getEmployeeRepo() {
        return new EmployeeRepositoryImpl();
    }

    //setter injection
    @Bean(name = "employeeService")
    public EmployeeService getEmployeeService() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        //Constructor injection:
        //    EmployeeServiceImpl employeeService = new EmployeeServiceImpl(getEmployeeRepo());

        employeeService.setRepository(getEmployeeRepo());
        return employeeService;
    }

    */
}
