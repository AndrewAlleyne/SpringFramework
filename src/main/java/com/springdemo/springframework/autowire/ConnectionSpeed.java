package com.springdemo.springframework.autowire;

public class ConnectionSpeed {
    private String speed;


    public ConnectionSpeed() {
        System.out.println("Spring called me! " +getClass().getName());
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
