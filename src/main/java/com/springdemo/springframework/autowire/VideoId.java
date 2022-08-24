package com.springdemo.springframework.autowire;

public class VideoId {
    private String videoIdentifier;
    private String platformIdentifier;


    public VideoId() {
        System.out.println("Spring called me! " +getClass().getName());
    }

    public String getVideoIdentifier() {
        return videoIdentifier;
    }

    public void setVideoIdentifier(String videoIdentifier) {
        this.videoIdentifier = videoIdentifier;
    }

    public String getPlatformIdentifier() {
        return platformIdentifier;
    }

    public void setPlatformIdentifier(String platformIdentifier) {
        this.platformIdentifier = platformIdentifier;
    }
}
