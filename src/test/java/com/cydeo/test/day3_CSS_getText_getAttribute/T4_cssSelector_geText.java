package com.cydeo.test.day3_CSS_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_geText {
    public static void main(String[] args) {




        //  TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Verify “Reset password” button text is as
        // expected:Expected: Reset password

        WebElement resetPassword = driver.findElement(By.cssSelector("button.login-btn"));

        String expected = "Reset password";
       // String actual = resetPassword.getAttribute("value");
        String actual = resetPassword.getText(); // here we can use both way attribute and getText in the text area

        if (actual.equals(expected)){
            System.out.println("verification is passed");
        }else {
            System.out.println("verification is failed");
        }


        driver.quit();


    }
}
