package com.university;

import com.university.units.Unit;

import java.util.Collection;
import java.util.Iterator;

public class University {
    private String name;
    private int totalEmployees;

    public enum PropertyType {
        PRIVATE, STATE
    }

    private PropertyType propertyType;
    private Collection<UniversityUnit> universityUnits;


    public University(Collection<UniversityUnit> universityUnits, String name, PropertyType propertyType){
        this.universityUnits = universityUnits;
        this.name = name;
        this.propertyType = propertyType;
    }

    public String getName() {
        return name;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public Collection<UniversityUnit> getUniversityUnits() {
        return universityUnits;
    }


    public void addUniversityUnit(UniversityUnit universityUnit){
        totalEmployees += universityUnit.employees();
        this.universityUnits.add(universityUnit);
    }

    void show(){
        System.out.println("This is \"" + name + "\"");
        System.out.println("There are " + totalEmployees + " employees in \"" + name + "\"");
        System.out.println("\nUniversities structural units:\n");

    }
}
