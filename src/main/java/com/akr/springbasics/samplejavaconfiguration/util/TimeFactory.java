package com.akr.springbasics.samplejavaconfiguration.util;

import org.springframework.beans.factory.FactoryBean;

import java.time.LocalDateTime;

public class TimeFactory implements FactoryBean<LocalDateTime> {

    private LocalDateTime dateTime = LocalDateTime.now();

    @Override
    public LocalDateTime getObject() throws Exception {
        System.out.println("LocalDateTime: time is: " + dateTime);
        return dateTime;
    }

    @Override
    public Class<?> getObjectType() {
        return LocalDateTime.class;
    }

    public void addDays(long days) {
        dateTime = dateTime.plusDays(days);
        System.out.println("LocalDateTime: adjusted time is: " + dateTime);
    }
}
