package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

// annotations.Test
    public class TestNG_Intro {


    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void tearDown(){System.out.println("After class is running");}

    // BeforeMethod will be running before each method
    @BeforeMethod
    public void setUoMethod (){
    System.out.println("Before method is running");
}
    @AfterMethod
    public void tearDownMethod(){
    System.out.println("After method is running");
}



    @Test //(priority = 2)
    public void test1(){
        System.out.println("Test 1 is running.....");
        String actual = "apple";
        String expected = "appl";
        //actual, expected, message -> (will appear only if test wil fail)
        Assert.assertEquals(actual, expected, "Test did not pass");
    }

    @Test //(priority = 1, dependsOnMethods = "test1")
    public void test2(){
    System.out.println("Test 2 is running.....");
    Assert.assertEquals("dog", "dog", "Test did not pass");
    }

}
