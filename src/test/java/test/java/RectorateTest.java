package test.java;

import com.university.units.Rectorate.*;
import com.university.units.Rectorate;
import org.junit.Assert;
import org.junit.Test;

public class RectorateTest {

    @Test
    public void toStringTest(){
        Rectorate.Rector rector = new Rectorate.Rector("RectorTest");
        String expected = "Rector name: RectorTest";
        System.out.println(rector);
        Assert.assertEquals(rector.toString(), expected);
    }
}
