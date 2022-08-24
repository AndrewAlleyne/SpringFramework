package com.springdemo.springframework.autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");

        Video video = (Video) context.getBean("Video");
        System.out.println(video);

         context.getBean("UploadOn");

    }
}
