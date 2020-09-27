package com.university;

import com.university.units.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        University university = new University(new ArrayList<>(), "Kyiv Polytechnic Institute", PropertyType.STATE);
        university.addUniversityUnit(new Rectorate(201, "Mykhailo Zghurovsky"));
        university.addUniversityUnit(new Library(123));
        university.addUniversityUnit(new CountingHouse(50));

        Faculty tef = new Faculty(100, "Heat Power Engineer", new ArrayList<>());
        tef.addDepartment(new Department(45, "APEPS DEPARTMENT OF IGOR SIKORSKY KPI"));
        tef.addDepartment(new Department(37, "ATEP DEPARTMENT OF IGOR SIKORSKY KPI"));
        university.addUniversityUnit(tef);

        university.show();
    }
}
