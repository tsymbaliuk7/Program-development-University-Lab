package test.java;

import com.university.Bank;
import com.university.units.CountingHouse;
import com.university.units.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountingHouseTest {


    @Test
    public void countSalaryTest(){
        CountingHouse countingHouse = new CountingHouse(1, new Bank("test"));
        Library libraryTest = new Library(123, 1000);
        double avgSalary = 10000;
        Assert.assertEquals(1230000, countingHouse.countUnitSalary(libraryTest, avgSalary), 0.0);
        Assert.assertEquals(10000, countingHouse.countUnitSalary(countingHouse, avgSalary), 0.0);
    }

}
