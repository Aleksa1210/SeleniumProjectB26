package com.cydeo.test.day7_testNG_dropDown_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before  method is running");
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }



    @Test
    public void googleTitle(){

        // Get "https://google.com/"
       driver.get("https://google.com/");


        // Assert: title is  "Google"
       String actual = driver.getTitle(); // came from Selenium
       String expected = "Google";  // came from requirements
       Assert.assertEquals(actual, expected, "Title verification is failed");

    }


    @Test
    public void yahooTitle(){
    driver.get("https://yahoo.com");
    }


    @Test
    public void yandexTitle(){
        driver.get("https://yandex.ru");
    }















}
