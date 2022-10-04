package com.cydeo.test.day17_pom_syncronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_ActionsPractices {
    CydeoPracticePage cydeoPracticePage; // it ts global
    Actions actions;


    @BeforeMethod
    public void SetUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url4"));
        cydeoPracticePage = new CydeoPracticePage(); // it's local
        actions = new Actions(Driver.getDriver());
    }
    @Test
    public void drag_small_circle_text(){

//        1. Open a chrome browser
//        2. Go to:
//        https://practice.cydeo.com/drag_and_drop_circles
       // Driver.getDriver().get(ConfigurationReader.getProperty("url4")); put in the Before method
        //CydeoPracticePage cydeoPracticePage = new CydeoPracticePage();

//        3. Verify expected default text appears on big circle
//                Expected = "Drag the small circle here."
        //WebElement big = Driver.getDriver().findElement(By.id("droptarget"));
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(),"Drag the small circle here.");



    }

    @Test
    public void drop_here_text(){

//        1. Open a chrome browser
//        2.  Go to:
//        https://practice.cydeo.com/drag_and_drop_circles


//        3. Click and hold small circle

       // actions.moveToElement(cydeoPracticePage.smallCircle).clickAndHold().moveToElement(cydeoPracticePage.bigCircle).release().perform();
        actions.moveToElement(cydeoPracticePage.smallCircle)
                .clickAndHold().pause(2000)
                .moveByOffset(100, 50)
                .pause(2000)
                .perform();


//        4. Verify "Drop here." text appears on big circle
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drop here.");




    }

}
