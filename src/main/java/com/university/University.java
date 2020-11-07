package com.university;

import com.university.units.CountingHouse;
import com.university.units.PropertyType;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class University implements Showable {
    private String name;
    private int totalEmployees;
    private PropertyType propertyType;
    private CountingHouse countingHouse;
    private Collection<Showable> universityUnits;


    public University(Collection<Showable> universityUnits, String name, PropertyType propertyType,
                      int countingHouseEmployees, Bank bank){
        this.universityUnits = universityUnits;
        this.name = name;
        this.propertyType = propertyType;
        this.countingHouse = new CountingHouse(countingHouseEmployees, bank);
        this.totalEmployees += countingHouseEmployees;
    }


    public University(University obj){
        this.name = obj.getName();
        this.propertyType = obj.getPropertyType();
        this.universityUnits = obj.getUniversityUnits();
        this.totalEmployees = obj.getTotalEmployees();
        this.countingHouse = obj.getCountingHouse();
    }

    public void checkUnitList() throws NoUnitUniversityException{
        if(universityUnits.size() == 0) {
            throw new NoUnitUniversityException("\""+ this.getName() + "\" has no units");
        }
    }

    public String getName() {
        return name;
    }


    public CountingHouse getCountingHouse() {
        return countingHouse;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public University addUniversityUnit(UniversityUnit universityUnit){
        totalEmployees += universityUnit.employees();
        this.universityUnits.add((Showable) universityUnit);
        return this;
    }

    @Override
    public void show() {
        System.out.println("This is \"" + name + "\"");
        if (propertyType.isKnown()) {
            System.out.println("Property type: " + propertyType);
        }
        System.out.println("There are " + totalEmployees + " employees in \"" + name + "\"");
        System.out.println("\nUniversities structural units:\n");
        Iterator<Showable> it = universityUnits.iterator();
        try {
            checkUnitList();
        }
        catch (NoUnitUniversityException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("University unit list check is over");
        }
        countingHouse.show();
        while(it.hasNext()){
            it.next().show();
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Using overrided equals()");
        if (o == this) return true;
        if (!(o instanceof University)) {
            return false;
        }
        University university = (University) o;
        return totalEmployees == university.totalEmployees &&
                Objects.equals(name, university.name) &&
                Objects.equals(propertyType, university.propertyType) &&
                Objects.equals(countingHouse, university.countingHouse) &&
                Objects.equals(universityUnits, university.universityUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalEmployees, propertyType, universityUnits, countingHouse);
    }


    public void removeUnits(){
        this.universityUnits.clear();
        this.totalEmployees = this.countingHouse.employees();
    }
}

