package com.cydeo.test.day10_utilitites_windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.SRM_utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Iframe_CRM_AppreciationTest extends TestBase {

    @Test
    public void sendingAppreciationMsg() throws InterruptedException {
//        2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");

//        3- Login Homepage ( Login with valid username and password)
//        WebElement loginPage = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        loginPage.sendKeys("helpdesk1@cybertekschool.com");
//        WebElement passwordPage = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
//        passwordPage.sendKeys("UserUser");
//
//        WebElement loginClick = driver.findElement(By.xpath("//input[@class='login-btn']"));
//        loginClick.click();

        //SRM_utilities.crm_login(driver);
        SRM_utilities.crm_login(driver, "hr1@cydeo.com", "UserUser");

//        4- Click the MORE tab and select APPRECIATION
        WebElement moreTab = driver.findElement(By.cssSelector("span[id$='link-text']"));
        // span[contains(@id,'link-text']
        moreTab.click();

        WebElement appreciationMessage = driver.findElement(By.xpath("//span[.='Appreciation']"));
        appreciationMessage.click();
        Thread.sleep(3000);
//        5- Write an Appreciation message

        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Hello"); //body[@style='min-height: 184px;']

//        6- Click the SEND button
        driver.switchTo().parentFrame();
        WebElement clickSendButton = driver.findElement(By.id("blog-submit-button-save"));
        clickSendButton.click();

//        7- Verify the Appreciation message is displayed on
//        the feed
        WebElement feedText = driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
        String actualText = feedText.getText();
        String expectedText = "Hello!";
        Assert.assertEquals(actualText, expectedText, "Feed message did not appear correctly!");
    }

}
