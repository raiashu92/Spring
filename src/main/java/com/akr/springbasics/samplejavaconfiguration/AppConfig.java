package com.akr.springbasics.samplejavaconfiguration;

import com.akr.springbasics.samplejavaconfiguration.util.CalendarFactory;
import com.akr.springbasics.samplejavaconfiguration.util.TimeFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Calendar;

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

    @Bean (name = "timeFactory")
    public TimeFactory getTimeFactory() {
        TimeFactory timeFactory = new TimeFactory();
        System.out.println("AppConfig: bean timeFactory");
        return timeFactory;
    }

    //point to ponder - why is time not shifted by 4 days?
    @Bean (name = "adjustedTime")
    public LocalDateTime getAdjTime() throws Exception {
        TimeFactory timeFactory = getTimeFactory();
        timeFactory.addDays(4);
        LocalDateTime ldt = timeFactory.getObject();
        System.out.println("AppConfig: bean adjustedTime - " + ldt);
        return ldt;
    }

    @Bean (name = "defaultTime")
    public LocalDateTime getTime() throws Exception {
        LocalDateTime ldt2 = getTimeFactory().getObject();
        System.out.println("AppConfig: bean defaultTime - " + ldt2);
        return ldt2;
    }

    @Bean (name = "calFactory")
    public CalendarFactory calendarFactory() {
        CalendarFactory calfactory = new CalendarFactory();

        return calfactory;
    }

    @Bean (name = "defaultCalendar")
    public Calendar defCal() throws Exception {
        Calendar calendar = calendarFactory().getObject();
        System.out.println("AppConfig: defaultCalendar - " + calendar.getTime());
        return calendar;
    }

    @Bean (name = "adjCalendar")
    public Calendar adjCal() throws Exception {
        CalendarFactory calFact = calendarFactory();
        calFact.addDays(4);
        Calendar calendar = calFact.getObject();
        System.out.println("AppConfig: adjCalendar - " + calendar.getTime());
        return calendar;
    }

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
