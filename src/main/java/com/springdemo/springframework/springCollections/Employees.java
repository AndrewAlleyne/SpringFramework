package com.springdemo.springframework.springCollections;

public class Employees
{
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employees(){ }

    public String toString(){
        return "Employee{FirstName: " + getFirstName() + ". LastName: " + getLastName() +"}";
    }
}
