package test.java;

import com.university.NoUnitUniversityException;
import com.university.units.Department;
import com.university.units.Faculty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FacultyTest {

    private Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());

    @Before
    public void init(){
        facultyTest.addDepartment(new Department(60, "Department1"));
        facultyTest.addDepartment(new Department(60, "Department2"));
    }

    @Test
    public void employeesTest(){
        int expected = 240;
        Assert.assertEquals(expected, facultyTest.employees());
    }

    @Test
    public void addDepartmentTest(){
        facultyTest.addDepartment(new Department(60, "Department3"));
        Assert.assertEquals(3, facultyTest.getDepartmentUnits().size());
    }

    @Test
    public void removeUnitsTest1(){
        facultyTest.removeUnits();
        Assert.assertEquals(facultyTest.employees(), facultyTest.getOnlyFacultyEmployees());
        Assert.assertEquals(0, facultyTest.getDepartmentUnits().size());
    }


    @Test
    public void equalsTest(){
        Faculty facultyCopy = new Faculty(facultyTest);
        Assert.assertNotEquals(facultyCopy, facultyTest);
    }

    @Test
    public void equalListTest(){
        Faculty facultyCopy = new Faculty(facultyTest);
        Assert.assertSame(facultyCopy.getDepartmentUnits(), facultyTest.getDepartmentUnits());
    }

    @Test
    public void checkDepartmentListTest(){
        facultyTest.removeUnits();
        try {
            facultyTest.checkDepartmentUnits();
        } catch (NoUnitUniversityException e) {
            Assert.assertEquals(e.getMessage(), "Faculty Test has no departments");
        }
    }



}
