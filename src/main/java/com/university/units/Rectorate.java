package com.university.units;

public class Rectorate extends Unit{
    private Rector rector;

    public Rectorate(Integer employees, String rectorName){
        super(employees);
        rector = new Rector(rectorName);
    }

    private Rector getRector() {
        return rector;
    }

     static class Rector{
       String rectorName;
       Rector(String rectorName){
           this.rectorName = rectorName;
       }
    }

    @Override
    public void show(){
        System.out.println("University Rectorate: " + this.employees() + " employees" );
        System.out.println("Rector name: " + this.getRector().rectorName);
    }


}
