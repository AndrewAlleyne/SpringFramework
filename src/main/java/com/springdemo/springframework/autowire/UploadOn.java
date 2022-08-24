package com.springdemo.springframework.autowire;

public class UploadOn {
    public UploadOn(Date date,VideoId videoId) {
        System.out.println("Date is " + date.currentDate());
        System.out.println("Video Id " + videoId.getVideoIdentifier());
    }
}
