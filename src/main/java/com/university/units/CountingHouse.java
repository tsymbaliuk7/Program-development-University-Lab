package com.university.units;

import com.university.Bank;
import com.university.UniversityUnit;

public class CountingHouse extends Unit{
    private Bank bank;

    public CountingHouse(Integer employees, Bank bank){
        super(employees);
        this.bank = bank;
    }

    @Override
    public void show(){
        System.out.println("University Counting House: " + employees() + " employees. It works with " + bank.getName());
    }


    public double countUnitSalary(UniversityUnit unit, double avgSalaryForUnit){
        System.out.println("Unit has " + unit.employees());
        System.out.println("Average salary for unit employer is: " + avgSalaryForUnit);
        return unit.employees() * avgSalaryForUnit;
    }

    public Bank getBank() {
        return bank;
    }
}
