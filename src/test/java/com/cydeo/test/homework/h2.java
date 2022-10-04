package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class h2 {
    public static void main(String[] args) {


       //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
       //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       //2- Go to: https://login1.nextbasecrm.com/

       driver.get("https://login1.nextbasecrm.com/");

       //3- Verify “remember me” label text is as expected:
       //Expected: Remember me on this computer

        WebElement rememberMe = driver.findElement(By.cssSelector("label.login-item-checkbox-label"));

        String expected = "Remember me on this computer";
        String actual = rememberMe.getText();

        if (actual.equals(expected)){
            System.out.println("Remember me on this computer - verification is passed");
        }else {
            System.out.println("Remember me on this computer - verification is failed");
        }

       //4- Verify “forgot password” link text is as expected:
       // Expected: Forgot your password?

        WebElement forgotPassword = driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
        String expectPassword = "Forgot your password?";
        String actualPassword = forgotPassword.getText();

        if (actualPassword.equals(expectPassword)){
            System.out.println("Forgot your password - verification is passed");
        }else {
            System.out.println("Forgot your password - verification is passed");
        }

       //5- Verify “forgot password” href attribute’s value contains expected:
       // Expected: forgot_password=yes
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
        String expectedForgot = "forgot_password=yes";
        String actualPasswor = forgotPassword2.getAttribute("href");

        if (actualPasswor.equals(expectedForgot)){
        System.out.println("forgot_password=yes - verification is passed");
        }else {
        System.out.println("forgot_password=yes - verification is passed");
        }

        driver.quit();









    }
}
