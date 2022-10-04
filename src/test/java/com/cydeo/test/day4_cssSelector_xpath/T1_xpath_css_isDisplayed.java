package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {



//        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
        //WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //XPATH
        WebElement homeLink2 = driver.findElement(By.xpath("//a[@class='nav-link']")); // xpath(text()='Home')        . -only for attribute
                                                            //a[.='Home']
                                                            // a[@href='/']

//        b. “Forgot password” header c. “E-mail” text
        //Locate forgotPassword using cssSelector form parent to child with ">"
      //  WebElement forgotPassword1 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));

        //XPATH
        WebElement forgotPassword2 = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

//        d. E-mail input box
        WebElement emailBox = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement inputBox = driver.findElement(By.cssSelector("input[name='email']"));


        //XPATH
        WebElement emailBox2= driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailBox3= driver.findElement(By.xpath("//label[.='E-mail']"));

        WebElement inputBox2= driver.findElement(By.xpath("//input[@type='text']"));



//        e. “Retrieve password” button f. “Powered by Cydeo text
        //WebElement retrievePassword = driver.findElement(By.cssSelector("button#form_submit"));
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[class='radius']>i"));
        WebElement poweredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));


        //XPATH
        WebElement retrievePassword2 = driver.findElement(By.xpath("//i[.='Retrieve password']"));
        WebElement poweredByCydeoText2 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));



//        4. Verify all web elements are displayed.
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
        System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());


        System.out.println("homeLink2.isDisplayed() = " + homeLink2.isDisplayed());
        System.out.println("forgotPassword2.isDisplayed() = " + forgotPassword2.isDisplayed());
        System.out.println("forgotPassword3.isDisplayed() = " + forgotPassword3.isDisplayed());
        System.out.println("emailBox2.isDisplayed() = " + emailBox2.isDisplayed());
        System.out.println("emailBox3.isDisplayed() = " + emailBox3.isDisplayed());
        System.out.println("inputBox2.isDisplayed() = " + inputBox2.isDisplayed());
        System.out.println("retrievePassword2.isDisplayed() = " + retrievePassword2.isDisplayed());
        System.out.println("poweredByCydeoText2.isDisplayed() = " + poweredByCydeoText2.isDisplayed());


        driver.quit();



    }

}
