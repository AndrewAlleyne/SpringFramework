package com.springdemo.springframework.springCollections;

import java.util.List;

public class Manager {
    /*Manager has a list of employees.*/
    List<Employees> employeesList;

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }



}
