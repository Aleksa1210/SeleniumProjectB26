package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_Multiple_Windows extends TestBase {
    @Test
    public void windowsHandleTest() throws InterruptedException {
//        2. Go to:https://www.amazon.com
        driver.get("https://www.amazon.com");
       // driver.navigate().to("https://google.com"); use the same tab

//        3. Copy paste the lines from below into your class
        //'_blank' will open url in new tab/window
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

//        4. Create a logic to switch to the tab where Etsy.com is open

       // BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy" ); // in our utils class


        // Set we store all windows in Set of String with using getWindowHandles() method
        Set<String> allWindowsHandles = driver.getWindowHandles(); // give all open tab/windows
        for (String eachWindow : allWindowsHandles) { // .iter  // go throw every tab
            driver.switchTo().window(eachWindow);   // switch tabs
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }
//        5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();
        String  expectedTitle = "Etsy";
        Assert.assertTrue(actualTitle.contains(expectedTitle)); //assertEqals - should be exactly the same




    }
}
