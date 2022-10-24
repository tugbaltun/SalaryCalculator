package org.example;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        d.setYear(1985);
        EmployeeManagerImpl employeeManager = new EmployeeManagerImpl();
        Employee employee = new Employee();
        employee.setHireYear(d);
        employee.setName("Kemal");
        employee.setSalary(BigDecimal.valueOf(2000));
        employee.setWorkHours(45);
        employeeManager.toString(employee);
    }
}