package com.epam.scala.streams.emloyee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public Map<Seniority,Long> groupBySeniority(List<Employee> employees){
         return employees.stream()
                .collect(Collectors.groupingBy(employee -> Seniority.findBySalary(employee.getSalary()), Collectors.counting()));
    }
}
