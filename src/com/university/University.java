package com.university;

import com.university.units.PropertyType;
import com.university.units.Showable;
import com.university.units.Unit;

import java.util.Collection;
import java.util.Iterator;

public class University implements Showable {
    private String name;
    private int totalEmployees;

    private PropertyType propertyType;
    private Collection<Showable> universityUnits;


    University(Collection<Showable> universityUnits, String name, PropertyType propertyType){
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

    public Collection<Showable> getUniversityUnits() {
        return universityUnits;
    }


    void addUniversityUnit(UniversityUnit universityUnit){
        totalEmployees += universityUnit.employees();
        this.universityUnits.add((Showable) universityUnit);
    }

    @Override
    public void show(){
        System.out.println("This is \"" + name + "\"");
        if (propertyType.isKnown()) {
            System.out.println("Property type: " + propertyType);
        }
        System.out.println("There are " + totalEmployees + " employees in \"" + name + "\"");
        System.out.println("\nUniversities structural units:\n");
        Iterator<Showable> it = universityUnits.iterator();
        while(it.hasNext()){
            it.next().show();
            System.out.println();
        }
        System.out.println();
    }
}
