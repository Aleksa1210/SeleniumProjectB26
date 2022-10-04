package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.WebTableUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_WebTablePractice extends TestBase  {


    @Test
    public void orderNameVerifyTest(){

//        1. Goto : https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

//        2. Verify Bob’s name is listed as expected.
//        Expected: “Bob Martin”
        WebElement bobName = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[2]"));
        String actul = bobName.getText();
        String expected = "Bob Martin";
        Assert.assertEquals(actul, expected);
//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021 (edited)
        WebElement date = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[5]")); //td[.='12/31/2021']
        String actulDate = date.getText();
        String expectedDate = "12/31/2021";
        Assert.assertEquals(actulDate, expectedDate);





        //Teacher way
        /*
         2. Verify Bob’s name is listed as expected.
//        Expected: “Bob Martin”
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        String actualBobName = bobMartinCell.getText();
        String expectedBobName = "Bob Martin";
        Assert.assertEquals(actualBobName,expectedBobName,"Bob name did not appear correctly!");


//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021
        WebElement bobMartinDateCell =
                driver.findElement(By.xpath("//td[.='Bob Martin']//following-sibling::td[3]"));

        String actualBobMartinDateCell = bobMartinDateCell.getText();
        String expectedBobMartinDateCell = "12/31/2021";

        Assert.assertEquals(actualBobMartinDateCell,expectedBobMartinDateCell);

         */

    }

    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/web-tables");

        String customerOrderDate1 = WebTableUtilities.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

        String customerOrderDate2 = WebTableUtilities.returnOrderDate(driver,"Ned Stark");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);

    }

    @Test
    public void test3(){
        driver.get("https://practice.cydeo.com/web-tables");

        WebTableUtilities.orderVerify(driver,"Alexandra Gray","04/15/2021");

    }


}
