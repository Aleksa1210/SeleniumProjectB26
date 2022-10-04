package com.cydeo.test.day5_findElemebts_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_2_RadioButton {
    public static void main(String[] args) throws InterruptedException {


     // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

     //   2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        // 3. Locate all "sport" RadioButton
        List<WebElement> sportRadioButton = driver.findElements(By.xpath("//input[@name='sport']"));


        for (WebElement each : sportRadioButton){
            Thread.sleep(3000);
            each.click();
        }

        driver.quit();


    }
}
