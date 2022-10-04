package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {

        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        // 3- Make our page full screen
        driver.manage().window().maximize();

        //Make our page full screen
       // driver.manage().window().fullscreen();

        driver.get("https:www.etsy.com");
        // navigate().to() method is for navigation to web Page
        // driver.navigate().to("https:www.etsy.com");


        //It is using for stopping application are giving time to application to see steps
        Thread.sleep(3000);

        // navigate().back() method is for navigation to back from web page
        driver.navigate().back();

        Thread.sleep(3000);

        // navigate().forward() method is for navigating to forward from web page
        driver.navigate().forward();

        Thread.sleep(3000);

        //driver.navigate().refresh(); method is for refreshing the page
        driver.navigate().refresh();

        System.out.println("Etsy driver.getTitle() = " + driver.getTitle());
        //String currentTitle = driver.getTitle();

        System.out.println("Etsy driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.get("https://www.tesla.com");

        System.out.println("Tesla driver.getTitle() = " + driver.getTitle());

        System.out.println("Tesla driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // this will close the currently opened page
        driver.close();

        // this will close all page/tabs
        driver.quit();


    }
}
