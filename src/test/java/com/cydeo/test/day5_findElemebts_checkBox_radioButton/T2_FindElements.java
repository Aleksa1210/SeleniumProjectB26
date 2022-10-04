package com.cydeo.test.day5_findElemebts_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_FindElements {
    public static void main(String[] args) {

//        TC #4: FindElements Task
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest ");

//        3- Locate all the links in the page.
        List <WebElement> allLinks = driver.findElements(By.tagName("a")); // all links start with "a" incrotec

//        4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size()); // size allLinks.size +.soutv

//        5- Print out the texts of the links.
//        6- Print out the HREF attribute values of the links
        for (WebElement each : allLinks){ // iter + tab ; allLink + .tab
            System.out.println("Text of link = " + each.getText()); // each.getText().soutv
            System.out.println("Href values = " + each.getAttribute("href"));
        }






        driver.quit();











    }
}
