package com.university.units;

import com.university.Showable;
import com.university.UniversityUnit;

public class Unit extends UniversityUnit implements Showable {
    protected int employeesNum;

    Unit(Integer employeesNum){
        this.employeesNum = employeesNum;
    }

    public void setEmployeesNum(int employeesNum) {
        this.employeesNum = employeesNum;
    }

    @Override
    public int employees(){
        return employeesNum;
    }

    @Override
    public void show() {}

}
