package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SRM_utilities {

    public static void crm_login(WebDriver driver){

//  Method #1 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver

        WebElement loginPage = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginPage.sendKeys("helpdesk1@cybertekschool.com");
        WebElement passwordPage = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordPage.sendKeys("UserUser");

        WebElement loginClick = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginClick.click();
    }

    public static void crm_login(WebDriver driver, String username, String password){
//  Method #2 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String username
//• Arg3: String password

        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys(username);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);

        WebElement loginClick = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginClick.click();


    }


}
