package com.cydeo.test.day7_testNG_dropDown_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void confirmAlertTest() {

//        3. Click to “Click for JS Alert” button
        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertBtn.click();

//        4. Click to OK button from the alert
       // driver.switchTo().alert().accept();

        Alert alert = driver.switchTo().alert();
        // for clicking Ok button in JS alert we are using accept() method
        alert.accept();

//        5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed());

        String actualResult = resultText.getText();
        String expected = "You successfully clicked an alert";
        Assert.assertEquals(actualResult,expected, "Result text did not appear correctly");


        driver.quit();

    }
}
