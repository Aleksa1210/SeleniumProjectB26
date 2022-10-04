package com.cydeo.test.day10_utilitites_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T3_Windows_handle extends TestBase {
    @Test
    public void windowHandleTest() throws InterruptedException {

//  2. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
       // String mainWindow = driver.getWindowHandle();
       // System.out.println(mainWindow);

//  3. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);


//  4. Click to: “Click Here” link
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();

//  5. Switch to new Window.
        Set<String> allWindows = driver.getWindowHandles(); // store window for switch tab
            for (String each : allWindows){
                driver.switchTo().window(each);  // switch to another tab
                // window handle 1 - main window
                // window handle 2 - 2nd window
                System.out.println(driver.getTitle());
                Thread.sleep(3000);

        }
//  6. Assert: Title is “New Window”
        String expected = "New Window";
            Assert.assertEquals(driver.getTitle(), expected);





}
}
