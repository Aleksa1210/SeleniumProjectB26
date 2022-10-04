package com.cydeo.test.day3_CSS_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) throws InterruptedException {


       // TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

      //  3- Enter incorrect username: “incorrect”
        WebElement userName = driver.findElement(By.className("login-inp")); // located
        userName.sendKeys("incorrect");


       // 4- Enter incorrect password: “incorrect”
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        Thread.sleep(3000);

      //  5- Click to login button.
        WebElement loginBtn = driver.findElement((By.className("login-btn")));
        loginBtn.click();

        Thread.sleep(3000);

        // 6- Verify error message text is as expected:
        //  Expected: Incorrect login or password
        WebElement eerorMessage = driver.findElement(By.className("errortext"));

        String expected = "Incorrect login or password";

        //getText(); it will get the content(text) from in between the opening and closing tag
        String actualMsg = eerorMessage.getText();


        if (actualMsg.equals(expected)){
            System.out.println("verification is passed");
        }else {
            System.out.println("verification is failed");
        }

        driver.quit();






















    }
}
