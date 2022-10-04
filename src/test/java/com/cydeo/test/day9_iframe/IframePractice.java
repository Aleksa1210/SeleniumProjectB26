package com.cydeo.test.day9_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePractice extends TestBase {


    @Test
    public void confirmAlertTest (){
//        2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


//        3- Clear text from comment body
        driver.switchTo().frame("mce_0_ifr"); // with id
        //  driver.switchTo().frame("//iframe[@id='mce_0_ifr']");         // with locator
        //  driver.switchTo().frame(0);                                   //frame index start with 0
        //frame - check how much iframe


       WebElement commentBody = driver.findElement(By.id("tinymce")); // NoSuchElement exception comes with reasons: not located correctly element or there is a iframe you have to switch to frame to reach such element

        // clear() method delete text from comment body
        commentBody.clear();

//        4- Type "Hello World" in comment body
        commentBody.sendKeys("Hello World");


//        5- Verify "Hello World" text is written in comment body
          String actual = commentBody.getText();
          String expected = "Hello World";
        Assert.assertEquals(actual, expected);

//        6- Verify header "An iFrame containing the TinyMCE
//        WYSIWYG Editor" is displayed

        driver.switchTo().parentFrame();
       // driver.switchTo().defaultContent();
        WebElement header = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(header.isDisplayed());
       // System.out.println("header.isDisplayed() = " + header.isDisplayed());
        Assert.assertEquals(header.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");


    }

}
