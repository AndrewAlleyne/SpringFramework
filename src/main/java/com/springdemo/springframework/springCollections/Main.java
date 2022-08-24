package com.springdemo.springframework.springCollections;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("springCollection.xml");

        Manager manager = (Manager) context.getBean("Manager");

        List<Employees> employeesList = manager.employeesList;

        employeesList.stream().forEach(System.out::println);
    }
}
