package com.cydeo.test.day5_findElemebts_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_isDisplayedFalse {
    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://www.tesla.com/
        driver.get("https://www.tesla.com/");

        //3- Locate Solar Panels header
        WebElement solarPanelsHeader = driver.findElement(By.xpath("(//h1[contains(text(),'Solar Panels')])[1]"));
        //      (//h1[contains(text(),'Solar Panels')])[1]
        //      (//h1[contains(@class,'tcl-homepage-hero__heading t')])[1]
        // if you have 2 different value, then you can put number which you want reach

        //4- Verify if it is displayed on the page
        solarPanelsHeader.isDisplayed();


        System.out.println("solarPanelsHeader = " + solarPanelsHeader.isDisplayed());









    }
}
