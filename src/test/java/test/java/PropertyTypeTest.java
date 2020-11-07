package test.java;

import com.university.units.PropertyType;
import org.junit.Assert;
import org.junit.Test;

public class PropertyTypeTest {

    @Test
    public void testToString1(){
        PropertyType propertyType = PropertyType.PRIVATE_UNIVERSITY;
        String expected = "private university";
        Assert.assertEquals(propertyType.toString(), expected);
    }

    @Test
    public void testToString2(){
        PropertyType propertyType = PropertyType.UNKNOWN;
        String expected = "unknown";
        Assert.assertEquals(propertyType.toString(), expected);
    }
}
