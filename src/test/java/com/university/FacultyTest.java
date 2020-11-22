package com.university;

import com.university.NoUnitUniversityException;
import com.university.units.Department;
import com.university.units.Faculty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class FacultyTest {


    @Test
    public void Employees_ListOfDepartments_TotalEmployeesNumber(){
        Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());
        Department department = Mockito.mock(Department.class);
        facultyTest.addDepartment(department);
        when(department.employees()).thenReturn(60);
        int expected = 180;
        Assert.assertEquals(expected, facultyTest.employees());
        verify(department).employees();
    }

    @Test
    public void Employees_EmptyListOfDepartments_OnlyFacultyEmployeesNumber(){
        Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());
        int expected = 120;
        Assert.assertEquals(expected, facultyTest.employees());
    }

    @Test
    public void AddDepartment_EmptyListOfDepartments_OnlyFacultyEmployeesNumber(){
        Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());
        facultyTest.addDepartment(new Department(60, "Department1"));
        facultyTest.addDepartment(new Department(60, "Department2"));
        facultyTest.addDepartment(new Department(60, "Department3"));
        Assert.assertEquals(3, facultyTest.getDepartmentUnits().size());
    }

    @Test
    public void RemoveUnits_FacultyDepartmentsList_EmptyListOfDepartments(){
        Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());
        facultyTest.addDepartment(new Department(60, "Department1"));
        facultyTest.addDepartment(new Department(60, "Department2"));
        facultyTest.removeUnits();
        Assert.assertEquals(facultyTest.employees(), facultyTest.getOnlyFacultyEmployees());
        Assert.assertEquals(0, facultyTest.getDepartmentUnits().size());
    }


    @Test
    public void Equals_UnoverridedEquals_False(){
        Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());
        facultyTest.addDepartment(new Department(60, "Department1"));
        facultyTest.addDepartment(new Department(60, "Department2"));
        Faculty facultyCopy = new Faculty(facultyTest);
        Assert.assertNotEquals(facultyCopy, facultyTest);
    }

    @Test
    public void CheckDepartmentList_NoUniversityUnit_ThrowsNoUnitUniversityException(){
        Faculty facultyTest = new Faculty(120, "Faculty Test", new ArrayList<>());
        facultyTest.removeUnits();
        try {
            facultyTest.checkDepartmentUnits();
        } catch (NoUnitUniversityException e) {
            Assert.assertEquals(e.getMessage(), "Faculty Test has no departments");
        }
    }



}
