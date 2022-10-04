package com.cydeo.test.day18;

import com.cydeo.pages.DynamicallyLoaded;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadedPage {

    @Test
    public void homework(){


// 1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get(ConfigurationReader.getProperty("url6"));

// 2. Click to start
        DynamicallyLoaded dynamicallyLoaded = new DynamicallyLoaded();
        dynamicallyLoaded.start.click();

//3. Wait until loading bar disappears
      // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
       // wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoaded.loading));
        BrowserUtils.waitForInvisibilityOf(dynamicallyLoaded.loading);

//4. Assert username inputbox is displayed
        dynamicallyLoaded.userName.isDisplayed();

//5. Enter username: tomsmith
        dynamicallyLoaded.userName.sendKeys("tomsmith");

//6. Enter password: incorrectpassword
        dynamicallyLoaded.password.sendKeys("incorrectpassword");
//7. Click to Submit button
        dynamicallyLoaded.submit.click();

//8. Assert “Your password is invalid!” text is displayed.
//            Note: Follow POM Design Pattern
        dynamicallyLoaded.text.isDisplayed();
        Assert.assertEquals(dynamicallyLoaded.text.getText(), "Your password is invalid!\n×");
        Driver.closeDriver();

    }

}