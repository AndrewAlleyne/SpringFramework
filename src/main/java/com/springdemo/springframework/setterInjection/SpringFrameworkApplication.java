package com.springdemo.springframework.setterInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.springdemo.springframework.inheritance.SpringFrameworkApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("setterInjection.xml");

        OuterClass outerClass = (OuterClass) context.getBean("OuterClass");
        //Spring calls setters and getter automatically so that you don't have to!
        outerClass.speakInnerClass();
    }
}