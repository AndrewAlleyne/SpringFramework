package com.springdemo.springframework.setterInjection;

public class OuterClass {
    private InnerClass innerClass;

    public OuterClass() {
        System.out.println("Inside on outer class.");
    }

    //setter method to inject dependency.
    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    //getter method to return injected dependency
    public InnerClass getInnerClass() {
        return innerClass;
    }

    //using inner class.
    public void speakInnerClass(){
        innerClass.speak();
    }
}
