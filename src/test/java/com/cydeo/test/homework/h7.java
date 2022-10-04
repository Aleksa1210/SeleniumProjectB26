package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class h7 {
    public static void main(String[] args) throws InterruptedException {


//        TC #6: StaleElementReferenceException Task
//
//        1. Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2. Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

//        3. Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

//        4. Refresh the page.
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
//        5. Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        driver.quit();
//
//
//
//
//        This is a simple StaleElementReferenceException to
//        understand what is this exception and how to handle it.
//
//*** In this practice StaleElementReferenceException is
//        coming because of navigation(refresh). When exception
//        comes because of navigation, we should handle with
//        reassigning (relocating) the web element after navigation
//        happens.


    }
}
