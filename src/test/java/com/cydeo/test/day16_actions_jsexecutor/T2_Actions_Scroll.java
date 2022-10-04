package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T2_Actions_Scroll {

    @Test
    public void actions_scroll_test (){
//    1- Open a chrome browser
//    2- Go to:


        Driver.getDriver().get(ConfigurationReader.getProperty("url3"));

//    3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

//    4- Scroll using Actions class “moveTo(element)” method
        // There to ways to do sctolling in Actions class
        // moveToElement(cydeoLink)
        // second Keys.PageUp and Keys.PageDown
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();

        //actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();


//    1- Continue from where the Task 4 is left in the same test.
//    2- Scroll back up to “Home” link using PageUP button
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        actions.moveToElement(homeLink).perform();

        // for second way we don't need to create WebElement for such way
       // actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.closeDriver();




    }



}
