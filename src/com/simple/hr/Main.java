package com.simple.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //department objects
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        //added department to a list
        List<Department> departmentss = new ArrayList<>();
        departmentss.add(dept1);
        departmentss.add(dept2);
        departmentss.add(dept3);

        //setting up address and company object
        Address address = new Address("5 Emerald Close", "Kinston", "Kington", "00000", "AU");
        Company company = new Company("ABC Company,", address);

        //new employee instance
        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000, dept2);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000, dept3);
        SalariedEmployee emp4 = new SalariedEmployee("Sarah Thomas", 50000, dept3);
        SalariedEmployee emp5 = new SalariedEmployee("Alex Eucker", 40000, dept2);
//        HourlyEmployee emp4 = new HourlyEmployee("Fei Ke", 200);

        //address of the text.txt
//        String SEfileName = "SalarieEmployeePaystubs.txt";
//        SalariedEmployee.printStub(SEfileName,employees);


        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};

        List<Employee> employeeList = Arrays.asList(employees);

        //group employees by department
        System.out.println("Employees grouped by Department: \n");
        Map<Department, List<Employee>> groupedByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach((departments, employeesInDepartment) -> {
            System.out.println(departments);
            employeesInDepartment.forEach(employee -> System.out.printf("  %s%n", employee));
        });


    }
}