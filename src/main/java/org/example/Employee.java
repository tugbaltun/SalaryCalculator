package org.example;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Employee {
    private String name;
    private BigDecimal salary;
    private double workHours;
    private Date hireYear;

    public Employee(){}

    public Employee(String name, BigDecimal salary, double workHours, Date hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
}
