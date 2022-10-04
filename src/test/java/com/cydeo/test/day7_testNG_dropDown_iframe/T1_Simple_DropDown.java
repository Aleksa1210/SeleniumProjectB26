package com.cydeo.test.day7_testNG_dropDown_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Simple_DropDown {
    WebDriver driver;
    @BeforeMethod
            public void setUpMethod(){
        System.out.println("Before  method is running");
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //    2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropdownTest(){
        //    2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

//    3. Verify “Simple dropdown” default selected value is correct
//    Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String actualSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        // getFirstSelectedOption() - choose first element(return Webelement)
        //.getText(); - translate Webelement to text

        String expectedSimpleDropdown = "Please select an option!";
        Assert.assertEquals(actualSimpleDropdown, expectedSimpleDropdown);

    }

    @Test
    public void stateDropDownTest(){
        //    4. Verify “State selection” default selected value is correct
//    Expected: “
//    Select a State”
        Select stateSelection = new Select(driver.findElement(By.id("state")));
        String actualStateSelection = stateSelection.getFirstSelectedOption().getText();
        String expectedStateSelection = "Select a State";
        Assert.assertEquals(actualStateSelection, expectedStateSelection);
    }

@AfterMethod
    public void tearDownMethod(){
    driver.quit();
}

}
