package com.university.units;

public class Rectorate extends Unit{
    private Rector rector;

    public Rectorate(Integer employees, String rectorName){
        super(employees);
        rector = new Rector(rectorName);
    }

    public Rector getRector() {
        return rector;
    }

    private static class Rector{
       String rectorName;
       Rector(String rectorName){
           this.rectorName = rectorName;
       }
    }

    @Override
    public void show(){
        System.out.println("University Library: " + employees() + " employees\n" );
    }


}
