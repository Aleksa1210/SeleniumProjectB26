package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_JSExecutor_Scroll {

    @Test
    public void etsy_scroll_test(){


//         Goto Etsy homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.page.url"));

//         Scroll down
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // up, left - negative number "window.scrollBy(0, -1000)"
        // down, right - positive number "window.scrollBy(0, 1000)"
        js.executeScript("window.scrollBy(0, 5000)");

//         Generate random email and enter into subscribe box
        WebElement email = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        js.executeScript("arguments[0].scrollIntoView(true)", email); // [0] first word and element
        Faker faker = new Faker();
        email.sendKeys(faker.internet().emailAddress() + Keys.ENTER);

//         Click on Subscribe
     //   WebElement subscribe = Driver.getDriver().findElement(By.xpath("//button[@class ='wt-btn wt-input-btn-group__btn']"));
     //   subscribe.click();

//         Verify "Great! We've sent you an email to confirm your subscription." is displayed
        WebElement veryfe = Driver.getDriver().findElement(By.xpath("//div[@class ='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        String expected = "Great! We've sent you an email to confirm your subscription.";
        Assert.assertEquals(veryfe.getText(), expected);



        Driver.closeDriver();












    }

}
