package com.university.units;

import com.university.UniversityUnit;

import java.util.Collection;

public class Department extends Unit{

     private  String departmentName;

     public Department(Integer employees, String facultyName){
         super(employees);
         this.departmentName = facultyName;
    }

    @Override
    public void show(){
        System.out.println(departmentName + ":  " + employees() + " employees\n" );

    }


    public String getDepartmentName() {
        return departmentName;
    }
}
