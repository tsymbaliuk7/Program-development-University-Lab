package com.university.units;

import com.university.UniversityUnit;

public class Unit extends UniversityUnit {
    private int employeesNum;

    Unit(Integer employeesNum){
        this.employeesNum = employeesNum;
    }

    @Override

    public int employees(){
        return employeesNum;
    }

    @Override
    public void show() {}

}
