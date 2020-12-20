package com.epam.scala.streams.emloyee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int salary;

    Employee(int salary){
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
