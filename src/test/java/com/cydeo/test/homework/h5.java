package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class h5 {
    public static void main(String[] args) throws InterruptedException {





       // TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
       // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        Thread.sleep(2000);

       // 3- Enter incorrect username into login box:
        WebElement incorrectUsername = driver.findElement(By.name("USER_LOGIN"));
        incorrectUsername.sendKeys("incorrect");
        Thread.sleep(2000);

       //4- Click to `Reset password` button
        WebElement clickResetPassword = driver.findElement(By.cssSelector("button.login-btn"));
        clickResetPassword.click();
        Thread.sleep(3000);

       // 5- Verify “error” label is as expected
       // Expected: Login or E-mail not found
        WebElement error = driver.findElement(By.cssSelector("div.errortext"));

        String expectedError = "Login or E-mail not found";
        String actualError = error.getText();

        if (actualError.equals(expectedError)){
            System.out.println("Error verification is passed");
        }else {
            System.out.println("Error verification is failed");
        }


        driver.quit();












    }
}
