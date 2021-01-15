package TestNGAgain;

import org.testng.annotations.*;

public class PreAndPostConditions {

    @BeforeClass
    public void beforeClass() {
        System.out.println("I am before Class");
    }
    @Test
    public void testMethod() {
        System.out.println("I am a test Method");
    }

    @Test
    public void testMethod2() {
        System.out.println("I am a second test Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am after Class");
    }
}
