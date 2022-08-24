package com.springdemo.springframework.nestedBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("nestedBean.xml");

        Phone  phone = (Phone) context.getBean("userPhone"); // can use alias to customize beans defines somewhere else.
        System.out.println("Carrier: " + phone.carrier.getName());
        System.out.println("Model: " + phone.model.getName());
    }
}
