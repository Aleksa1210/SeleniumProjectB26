package com.cydeo.test.day7_testNG_dropDown_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_StateDropDown {
    WebDriver driver;
@BeforeMethod
    public void setUpMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("http://practice.cybertekschool.com/dropdown");
//    1. Open Chrome browser
//    2. Go to http://practice.cybertekschool.com/dropdown


}

@Test
    public void stateDropTest(){
//    3. Select Illinois
    Select selectIllinois = new Select(driver.findElement(By.id("state")));
    selectIllinois.selectByValue("IL");

//    4. Select Virginia
    selectIllinois.selectByVisibleText("Virginia");
//    5. Select California
    selectIllinois.selectByIndex(5);
//    6. Verify final selected option is California.
//    Use all Select options. (visible text, value, index)

    // getFirstSelectedOption() method will return to current selected option
    String actual = selectIllinois.getFirstSelectedOption().getText();
    String expected = "California";
    Assert.assertEquals(actual, expected);
    System.out.println();
}
@Test
public void multiSelectDropdownTest(){

    //3. Select all the options from multiple select dropdown.
    Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

    //isMultiple()  will return if dropdown has multiselect option
    System.out.println(languages.isMultiple());

    //4. Print out all selected values.
    languages.selectByValue("java");
    languages.selectByVisibleText("C#");
    languages.selectByIndex(3);
    System.out.println(languages.getOptions());


    // getOptions() - return to all options in dropdown
    List<WebElement> allOptions = languages.getOptions();
    for (WebElement each: allOptions){ /*or languages.getOptions()*/
        each.click();
        System.out.println(each.getText());
    }

    //5. Deselect all values. (edited)
    languages.deselectAll();






}









@AfterMethod
    public void tearDownMethod(){

    driver.quit();
}



}
