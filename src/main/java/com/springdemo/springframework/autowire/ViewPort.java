package com.springdemo.springframework.autowire;

public class ViewPort {
    private String viewPortStat;


    public ViewPort() {
        System.out.println("Spring called me! " +getClass().getName());
    }

    public String getViewPortStat() {
        return viewPortStat;
    }

    public void setViewPortStat(String viewPortStat) {
        this.viewPortStat = viewPortStat;
    }
}
