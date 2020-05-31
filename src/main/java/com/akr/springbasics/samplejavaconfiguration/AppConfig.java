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
    * Note:
        1) Manually create beans and invoke constructor or setter injection.
        2) Instead of wiring manually and creating beans here, we can use auto wiring.
        3) Add @ComponentScan and use stereotype annotations where valid to auto-wire.
        4) This class will not be required if using auto-wiring, the main class where application context is being
           called can be used for that purpose. Add @ComponentScan annotation to main class.
        5) If Java based configuration is used, create AnnotationConfigApplicationContext object.
           For XML based configuration, use ClassPathXmlApplicationContext object.
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
