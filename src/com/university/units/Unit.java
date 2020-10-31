package com.university.units;

import com.university.Showable;
import com.university.UniversityUnit;

public class Unit extends UniversityUnit implements Showable {
    private int employeesNum;

    Unit(Integer employeesNum){
        this.employeesNum = employeesNum;
    }

    @Override

    protected int employees(){
        return employeesNum;
    }

    @Override
    public void show() {}

}
