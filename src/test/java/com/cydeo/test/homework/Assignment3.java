package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com");
        Thread.sleep(3000);
        WebElement loginField = driver.findElement(By.name("USER_LOGIN"));

        loginField.sendKeys("helpdesk49@cybertekschool.com");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("USERUSER");
        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
        Thread.sleep(3000);
        driver.quit();








    }
}
