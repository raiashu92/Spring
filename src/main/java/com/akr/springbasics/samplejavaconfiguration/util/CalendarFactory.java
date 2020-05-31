package com.akr.springbasics.samplejavaconfiguration.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {
    private Calendar calendar = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        System.out.println("CalendarFactory: calendar is: " + calendar.getTime());
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays(int days) {
        calendar.add(Calendar.DAY_OF_YEAR, days);
        System.out.println("CalendarFactory: adjusted calendar is: " + calendar.getTime());
    }
}
