package com.university.units;

import com.university.UniversityUnit;

import java.util.Collection;
import java.util.Iterator;

public class Faculty extends Unit{
     private String facultyName;
     private Collection<Department> departmentUnits;
     public Faculty(Integer employees, String facultyName, Collection<Department> departmentUnits){
         super(employees);
         this.facultyName = facultyName;
         this.departmentUnits = departmentUnits;
    }



    @Override
    public void show(){
        System.out.println(facultyName + ": " + getTotalEmployees() + " employees\n" );
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

    private Integer getTotalEmployees() {
        int totalEmployees = this.employees();
        Iterator<Department> it = departmentUnits.iterator();
        while(it.hasNext()){
            totalEmployees += it.next().employees();
        }
        return totalEmployees;
    }
}
