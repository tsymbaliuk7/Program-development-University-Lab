package test;

import com.university.units.Library;
import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {
    @Test
    public void receiveBooksTest(){
        Library libraryTest = new Library(123, 4444);
        Assert.assertEquals(5555, libraryTest.receiveBooks(1111));
    }

    @Test
    public void giveOutTest1(){
        Library libraryTest = new Library(123, 4444);
        Assert.assertEquals(-1, libraryTest.giveOutBooks(1000000000));
    }

    @Test
    public void giveOutTest2(){
        Library libraryTest = new Library(123, 4444);
        Assert.assertEquals(3333, libraryTest.giveOutBooks(1111));
    }
}
