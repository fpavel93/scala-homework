package com.epam.scala.streams.emloyee;

import java.util.List;

public class JavaMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                Employee.builder().salary(8).build(),
                Employee.builder().salary(9).build(),
                Employee.builder().salary(12).build(),
                Employee.builder().salary(14).build(),
                Employee.builder().salary(28).build(),
                Employee.builder().salary(38).build(),
                Employee.builder().salary(39).build()
        );

        EmployeeService employeeService = new EmployeeService();

        System.out.println(employeeService.groupBySeniority(employees));
    }
}
