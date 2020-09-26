package com.university.units;

import com.university.UniversityUnit;

import java.util.Collection;
import java.util.Iterator;

public class Faculty extends Unit{
     private String facultyName;
     private int onlyFacultyEmployees;
     private Collection<Department> departmentUnits;
     public Faculty(Integer employees, String facultyName, Collection<Department> departmentUnits){
         super(employees);
         onlyFacultyEmployees = employees;
         this.facultyName = facultyName;
         this.departmentUnits = departmentUnits;
    }



    @Override
    public void show(){
        System.out.println(facultyName + ": " + this.employees() + " employees\n" );
        System.out.println(facultyName + " departments:\n");
        Iterator<Department> it = departmentUnits.iterator();
        while(it.hasNext()){
            System.out.println("--------- ");
            it.next().show();
        }
        System.out.println();
    }


    public String getFacultyName() {
        return facultyName;
    }

    public Collection<Department> getDepartmentUnits() {
        return departmentUnits;
    }

    @Override
    public int employees() {
        int totalEmployees = this.getOnlyFacultyEmployees();
        Iterator<Department> it = departmentUnits.iterator();
        while(it.hasNext()){
            totalEmployees += it.next().employees();
        }
        return totalEmployees;
    }

    public int getOnlyFacultyEmployees() {
        return onlyFacultyEmployees;
    }
}
