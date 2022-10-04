package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {



    @Test
    public void google_search_driver_practice(){

        // Go to "https://www.google.com/"
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
       // System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId()); // show that we use the same driver

        // Write “apple” in search box
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchBox.sendKeys("apple" + Keys.ENTER);
        // Verify title:
        //Expected: apple - Google Search
        String actual = Driver.getDriver().getTitle();
        String expected = "apple - Google Search";
        Assert.assertEquals(actual, expected);


    }




}
