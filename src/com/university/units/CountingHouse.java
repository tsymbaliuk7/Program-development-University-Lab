package com.university.units;

public class CountingHouse extends Unit{

     public CountingHouse(Integer employees){
        super(employees);
    }

    @Override
    public void show(){
        System.out.println("University Counting House: " + employees() + " employees" );
    }


}
