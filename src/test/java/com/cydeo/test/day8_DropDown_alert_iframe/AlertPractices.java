package com.cydeo.test.day8_DropDown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void confirmAlertTest(){

//        3. Click to “Click for JS Confirm” button
        WebElement clickJSConfirm = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickJSConfirm.click();


//        4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        // for clicking Ok button in JS alert we are using accept() method

        alert.accept(); // alert.dismiss(); for cancel


//        5. Verify “You clicked: Ok” text is displayed.
        WebElement clickedOk = driver.findElement(By.id("result"));
        Assert.assertTrue(clickedOk.isDisplayed());
        //Assert.assertEquals(clickedOk.getText(), "You clicked: Ok");

        String actual = clickedOk.getText();
        String expected = "You clicked: Ok";
        Assert.assertEquals(actual, expected);

    }



    @AfterMethod
    public  void afterMethod(){
        driver.quit();
    }



}
