package com.simple.hr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000);
//        HourlyEmployee emp2 = new HourlyEmployee("Jane White", 35);
//
//        System.out.println(emp1.calculatePay());
//        System.out.println(emp2.calculatePay());

        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000);

        String fileName = "Paystubs.txt";

        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        SalariedEmployee.printStub(fileName,employees);

    }
}