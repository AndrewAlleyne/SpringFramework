package com.springdemo.springframework.autowire;

import java.time.LocalDate;
import java.time.ZoneId;

public class Date {
    public String currentDate(){
        return LocalDate.now(ZoneId.of("UTC")).toString();
    }
}
