package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {
    public static void main(String[] args) {

        // Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.google.com/
    driver.get("https://www.google.com");

        //3. Verify title
        //Expected "Facebook - log in or sign up"
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification is passed");
        }else {
            System.out.println("Title verification is failed");
        }

        driver.quit();
    }
}
