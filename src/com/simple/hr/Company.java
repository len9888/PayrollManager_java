package com.simple.hr;

import java.util.List;

public class Company {

    private String name;
    private Address address;
    private List<Department> departments;

    public Company(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
