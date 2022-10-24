package org.example;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeManagerImpl implements EmployeeManager {
    @Override
    public BigDecimal tax(BigDecimal salary) {
        BigDecimal percent = new BigDecimal("0.03");
        BigDecimal tax = new BigDecimal("0");
        if(salary.compareTo(BigDecimal.valueOf(1000))<0)
            return tax;
        tax = salary.multiply(percent);
        return tax;
    }

    @Override
    public BigDecimal bonus(double workHours) {
        BigDecimal bonus = new BigDecimal("0");
        if(workHours>40){
            bonus = BigDecimal.valueOf((workHours-40)*30);
        }
        return bonus;
    }

    @Override
    public BigDecimal raiseSalary(Date hireYear, BigDecimal salary) {
        int worked = 2021-(int)hireYear.getTime();
        BigDecimal raise;
        BigDecimal percent = new BigDecimal("0");
        if(worked<10){
            percent = BigDecimal.valueOf(0.05);
        }else if(worked<20){
            percent = BigDecimal.valueOf(0.1);
        }else{
            percent = BigDecimal.valueOf(0.15);
        }
        raise = salary.multiply(percent);
        return raise;
    }

    @Override
    public void toString(Employee employee) {
        System.out.println("Tax:"+tax(employee.getSalary()));
        System.out.println("Bonus:"+bonus(employee.getWorkHours()));
        System.out.println("Raise:"+raiseSalary(employee.getHireYear(), employee.getSalary()));
    }
}
