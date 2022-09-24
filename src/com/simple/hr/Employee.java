package com.simple.hr;

public abstract class Employee implements Payable {

    private String name;
    private final int EMPLOYEE_ID;
    private Address address;
    protected Department department;
    private double payRate;
    public static double STARTING_PAY_RATE = 7.75;
    private static int nextID = 1000;

    public Employee(String name){
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double payRate){
        this.name = name;
        this.payRate = payRate;
        EMPLOYEE_ID = getNextID();
    }

    public String getName() {
        return name;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void getAddress(){
        this.address.getAddress();
    }

    public Department getDepartment() {
        return department;
    }

    public static int getNextID(){
        int id = nextID;
        nextID++;
        return id;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.getDepartment();
    }
}
