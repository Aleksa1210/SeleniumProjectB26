package com.cydeo.test.homework;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class h6 {
    public static void main(String[] args) throws InterruptedException {

//        TC: Etsy checkbox and radio button
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        1. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

//        2. Search for “wooden spoon”
        WebElement searchWoodenSpoon = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        Thread.sleep(3000);
        searchWoodenSpoon.sendKeys("wooden spoon" + Keys.ENTER);

//        3. Click on filters
    WebElement clickFilters = driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']"));
        Thread.sleep(3000);
    clickFilters.click();

//        4. Select free shipping, on sale
        WebElement freeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        Thread.sleep(3000);
        freeShipping.click();

//        5. Select under $25 Click on apply filters
        WebElement selectUnder$25 = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        Thread.sleep(3000);
        selectUnder$25.click();
        WebElement appleFikters = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']"));
        Thread.sleep(3000);
        appleFikters.click();

//        6. Print count of results
  //      WebElement printCountOfResults = driver.findElement(By.xpath("//span[@class='wt-display-inline-flex-sm']/span")).getText());


        Thread.sleep(3000);
        driver.quit();








    }
}
