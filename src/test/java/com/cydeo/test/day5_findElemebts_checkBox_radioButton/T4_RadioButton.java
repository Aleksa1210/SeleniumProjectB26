package com.cydeo.test.day5_findElemebts_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_RadioButton {
    public static void main(String[] args) {



//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();

//        4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());




        //Locate Green button
    WebElement greenButton = driver.findElement(By.xpath("//input[@id='green']"));

        //verify if it is Enabled
        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());


        driver.quit();


    }
}
