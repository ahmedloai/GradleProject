/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    
    @Test
    public void testaddInts() {
    	Library testClass = new Library();
    	assertEquals(15, testClass.addInts(70, 8));
    	assertEquals(15, testClass.addInts(7, 8));
    	
    }
   
}
