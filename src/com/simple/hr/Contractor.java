package com.simple.hr;

public class Contractor implements Payable{

    private int hourWorked;
    private double partsCost;

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String generatePayStub() { //invoice
        return null;
    }
}
