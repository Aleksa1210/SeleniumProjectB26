package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_ActionsPractice {
    @Test
    public void cydeo_practice_drag_and_drop_test(){

//        1. Open a chrome browser
//        2. Go to: https://practice.cydeo.com/drag_and_drop_circles
        Driver.getDriver().get(ConfigurationReader.getProperty("url4"));

//        3. Click and hold small circle
        WebElement small = Driver.getDriver().findElement(By.id("draggable"));
        WebElement big = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(small);
      //  actions.dragAndDrop(small,big).perform(); or such
     //   actions.moveToElement(small).clickAndHold().moveToElement(big).release().perform();

        //        4. Move it on top of the big circle

        actions.moveToElement(big).perform();

//        5. And release on it.
        actions.release().perform();
//        6. Verify “You did great!” text appears on big circle
        String expected = "You did great!";
       // Assert.assertTrue(big.isDisplayed());
        Assert.assertEquals(big.getText(),expected);

        Driver.closeDriver();







    }
}
