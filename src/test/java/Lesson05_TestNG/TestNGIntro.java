package Lesson05_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGIntro {
    @BeforeClass
    public void setup(){
        //what to do before any of the tests.This is the first method which exacutes in any TestNG
        System.out.println("Before class is running");
    }
    @AfterClass
    public void cleaning(){//certain statements like driver.close
        System.out.println("After class is running");
    }
    @Test(priority = 3)
    public void Test1() {
        System.out.println("This is a test1");
    }

    @Test(priority = 1)
    public void Test2() {
        System.out.println("This is a test2");
    }

    @Test(priority = 2)
    public void Test3() {
        System.out.println("This is a test3");


    }


}
