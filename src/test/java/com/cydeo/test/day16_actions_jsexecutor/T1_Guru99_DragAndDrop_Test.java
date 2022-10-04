package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Guru99_DragAndDrop_Test {


    @Test
    public void guru99_dragAndDrop_test (){

        //    1- Open a chrome browser
//    2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));

//    3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bank = Driver.getDriver().findElement(By.partialLinkText("BANK"));
        WebElement debitAccount = Driver.getDriver().findElement(By.id("bank"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(bank, debitAccount).perform();

//    4- Drag “5000” and drop into Amount area under Debit Side
        WebElement fiveK = Driver.getDriver().findElement(By.linkText("5000"));
        WebElement debitAccount2 = Driver.getDriver().findElement(By.id("amt7"));
        actions.dragAndDrop(fiveK,debitAccount2).perform();



//    5- Drag “SALES” and drop into Account area under Credit Side
        WebElement sales = Driver.getDriver().findElement(By.partialLinkText("SALES"));
        WebElement creditAccount = Driver.getDriver().findElement(By.id("loan"));
        actions.dragAndDrop(sales,creditAccount).perform();

//    6- Drag “5000” and drop into Amount area under Credit Side
        WebElement fivks = Driver.getDriver().findElement(By.partialLinkText("SALES"));
        WebElement creditAC = Driver.getDriver().findElement(By.id("amt8"));
        actions.dragAndDrop(fivks,creditAC).perform();

//    7- Verify “Perfect!” text displayed.
        WebElement actual = Driver.getDriver().findElement(By.xpath("//a[@class='button button-green']"));

        String expected = "";
        Assert.assertEquals(actual.getText(), expected);

        Driver.closeDriver();




    }


}
