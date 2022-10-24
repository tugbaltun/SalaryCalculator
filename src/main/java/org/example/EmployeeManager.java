package org.example;

import java.math.BigDecimal;
import java.util.Date;

public  interface EmployeeManager {
    BigDecimal tax(BigDecimal salary);
    BigDecimal bonus(double workHours);
    BigDecimal raiseSalary(Date hireYear, BigDecimal salary);
    void toString(Employee employee);
}
