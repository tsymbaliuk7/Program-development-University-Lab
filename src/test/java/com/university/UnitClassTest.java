package com.university;

import com.university.Bank;
import com.university.units.CountingHouse;
import com.university.units.Library;
import org.junit.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


public class CountingHouseTest {


    @Test
    public void countUnitSalary_ExistingUnit_SalaryValueForUnit(){
        CountingHouse countingHouse = Mockito.mock(CountingHouse.class);
        Library libraryTest = new Library(123, 100000);
        double avgSalary = 10000;
        when(countingHouse.countUnitSalary(libraryTest.employees(), avgSalary)).
                thenReturn(libraryTest.employees() * avgSalary);
        Assert.assertEquals(1230000, libraryTest.countUnitSalary(countingHouse, avgSalary), 0.0);
        verify(countingHouse).countUnitSalary(libraryTest.employees(), avgSalary);
    }

}
