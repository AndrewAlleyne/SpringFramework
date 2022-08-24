package com.springdemo.springframework.autowire;

public class Video {
   private VideoId videoId;
   private ViewPort viewPort;
   private ConnectionSpeed connectionSpeed;

//Some extra line


    public VideoId getVideoId() {
        return videoId;
    }

    public void setVideoId(VideoId videoId) {
        this.videoId = videoId;
    }

    public ViewPort getViewPort() {
        return viewPort;
    }

    public void setViewPort(ViewPort viewPort) {
        this.viewPort = viewPort;
    }

    public ConnectionSpeed getConnectionSpeed() {
        return connectionSpeed;
    }

    public void setConnectionSpeed(ConnectionSpeed connectionSpeed) {
        this.connectionSpeed = connectionSpeed;
    }

    @Override
    public String toString() {
        return "Video{Id:" + getVideoId().getVideoIdentifier() + ", Speed:" + getConnectionSpeed().getSpeed() + ", ViewPort: " + getViewPort().getViewPortStat() +"}";
     }
}
