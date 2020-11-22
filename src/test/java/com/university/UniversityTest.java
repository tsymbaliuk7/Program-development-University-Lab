package test;

import com.university.Bank;
import com.university.NoUnitUniversityException;
import com.university.University;
import com.university.units.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UniversityTest {

    private Bank bank = new Bank("PrivateBank");
    private University universityTest = new University(new ArrayList<>(), "Kyiv Polytechnic Institute",
            PropertyType.STATE_UNIVERSITY, 57, bank);

    @Before
    public void init() {
        universityTest.addUniversityUnit(new Rectorate(201, "Mykhailo Zghurovsky"))
                .addUniversityUnit(new Library(123, 4444));
    }

    @Test
    public void employeesTest() {

        Assert.assertEquals(381, universityTest.getTotalEmployees());
    }

    @Test
    public void addUnitTest() {
        universityTest.addUniversityUnit(new Department(60, "Department3"));
        Assert.assertEquals(3, universityTest.getUniversityUnits().size());
    }

    @Test
    public void removeUnitsTest() {
        universityTest.removeUnits();
        Assert.assertEquals(universityTest.getTotalEmployees(), universityTest.getCountingHouse().employees());
        Assert.assertEquals(0, universityTest.getUniversityUnits().size());
    }


    @Test
    public void equalsTest() {
        University universityCopy = new University(universityTest);
        Assert.assertEquals(universityTest, universityCopy);
    }

    @Test
    public void equalListTest() {
        University universityCopy = new University(universityTest);
        Assert.assertSame(universityCopy.getUniversityUnits(), universityTest.getUniversityUnits());
    }

    @Test
    public void checkDepartmentListTest() {
        universityTest.removeUnits();
        try {
            universityTest.checkUnitList();
        } catch (NoUnitUniversityException e) {
            Assert.assertEquals(e.getMessage(), "\"Kyiv Polytechnic Institute\" has no units");
        }
    }
}