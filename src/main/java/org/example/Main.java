package org.example;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EmployeeManagerImpl employeeManager = new EmployeeManagerImpl();
        Date d = new Date();
        d.setYear(1995);
        Employee employee = new Employee();
        employee.setHireYear(d);
        employee.setName("Tugba Altun");
        employee.setSalary(BigDecimal.valueOf(15500));
        employee.setWorkHours(45);
        employeeManager.toString(employee);
    }
}