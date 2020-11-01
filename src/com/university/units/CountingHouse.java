package com.university.units;

import com.university.Bank;

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


    public Bank getBank() {
        return bank;
    }
}
