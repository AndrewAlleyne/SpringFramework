package com.springdemo.springframework.inheritance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrameworkApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Call server methods.
        Server s = (Server) context.getBean("server");
        System.out.println("First name: " + s.getFirstName() + ". Last name: " + s.getLastName() + ". My last job: " + s.getLastJob());

        //Call client methods. Should inherit properties from superclass.
        Client client = (Client) context.getBean("client");
        System.out.println("First name: " + client.getFirstName() + ". Last name: " + client.getLastName() + ". Last parent job: " + client.getLastJob());
    }
}
