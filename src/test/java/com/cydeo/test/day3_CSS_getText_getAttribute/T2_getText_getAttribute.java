package com.cydeo.test.day3_CSS_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {


       // TC #5: getText() and getAttribute() method practice
      //  1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

      //  2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //  3- Verify header text is as expected:
       // Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expected = "Registration form ";

        //getText(); it will get the content(text) from in between the opening and closing tag
        String actualHeader = headerText.getText();

        if (actualHeader.equals(expected)){
            System.out.println("verification is passed");
        }else{
            System.out.println("verification is failed");
        }


        // 4- Locate “First name” input box
        WebElement firstName = driver.findElement(By.className("form-control"));



      //  5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name
        String expect = "first name";

        // getAttribute() (attribute argument) method is helping us to get value of attributes
        String actual = firstName.getAttribute("placeholder");



        if (actual.equals(expect)){
        System.out.println("Placeholder verification is passed");
        }else {
         System.out.println("Placeholder verification is failed");
        }


        driver.quit();











    }
}
