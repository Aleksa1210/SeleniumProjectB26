package com.cydeo.test.day3_CSS_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_Css {
    public static void main(String[] args) throws InterruptedException {

       // T3_getAttribute_Css
      //  TC #3: NextBaseCRM, locators, getText(), getAttribute() practice 1- Open a chrome browser

       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
      WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

       // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        Thread.sleep(3000);
     //   3- Verify “Log in” button text is as expected:
      //  Expected: Log In

        //Located using Type attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
        WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));
       // WebElement logInBtn = driver.findElement(By.cssSelector("div[class='page-header']"));

        String expected = "Log In";
        String actual = logInBtn.getAttribute("value");


        if (actual.equals(expected)){
            System.out.println("verification is passed");
        }else{
            System.out.println("verification is failed");
        }


        driver.quit();










    }
}
