package com.cydeo.test.day8_DropDown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDateDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void dateDropdownTest() throws InterruptedException {
//    3. Select “December 1st, 1923” and verify it is selected.
//    Select year using   : visible text
        Select yearSelect = new Select(driver.findElement(By.id("year")));
        yearSelect.selectByVisibleText("1923");
        String actualYear = yearSelect.getFirstSelectedOption().getText();
        String expectedYear = "1923";
        Assert.assertEquals(actualYear,expectedYear);

//    Select month using    : value attribute Select
        Select monthSelect = new Select(driver.findElement(By.id("month")));
        //option[.='May']  (//option[@value='5'])[1]
        // (//option[@value='5'])[1]/preceding-sibling::option[2] - go back/before sibling (if don't have value and text)
        // (//option[@value='5'])[1]/following-sibling::option[2] - go ahead/next sibling
        monthSelect.selectByValue("11");
        String actualMonth = monthSelect.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth,expectedMonth);

//    day using : index number
        Select daySelect = new Select(driver.findElement(By.id("day")));
        daySelect.selectByIndex(0);
        String actualDay = daySelect.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertTrue(actualDay.equals(expectedDay)); // the same like Assert.assertEquals
      //  Assert.assertEquals(actualDay,expectedDay);

        for (WebElement option : yearSelect.getOptions()){
            System.out.print(option.getText());
        }
    }
@AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }



}
