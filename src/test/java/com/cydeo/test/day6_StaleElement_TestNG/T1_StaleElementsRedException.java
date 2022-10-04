package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementsRedException {
    public static void main(String[] args) {



//        TC #1: StaleElementReferenceException handling
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/ ");

//        3. Click to “Add Element” button
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick= 'addElement()']"));
        // or //button[.= 'Add Element']
        addElement.click();

//        4. Verify “Delete” button is displayed after clicking.
        //WebElement deleteButton = driver.findElement(By.xpath("//button[@class= 'added-manually']"));
      WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));

        System.out.println("Before click delete button " + deleteButton.isDisplayed());

//        5. Click to “Delete” button.
        deleteButton.click();

//        6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("After click delete button " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("This mens the web element is completely deleted from page and html ");
        }


        driver.quit();















    }
}
