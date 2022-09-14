package com.simple.hr;

import java.util.ArrayList;

public class Department {

    private String name;
    private ArrayList<Employee> employeeList;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
}
