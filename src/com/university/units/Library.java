package com.university.units;

public class Library extends Unit{

     public Library(Integer employees){
        super(employees);
    }

    @Override
    public void show(){
        System.out.println("University Library: " + employees() + " employees\n" );
    }


}
