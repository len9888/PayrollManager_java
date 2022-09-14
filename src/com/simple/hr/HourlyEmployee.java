package com.simple.hr;

public class HourlyEmployee extends Employee{

    private int hoursWorked;


    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * getPayRate();
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}
