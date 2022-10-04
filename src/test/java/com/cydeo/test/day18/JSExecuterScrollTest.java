package com.cydeo.test.day18;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecuterScrollTest {

@Test
    public void JS(){
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll
    Driver.getDriver().get(ConfigurationReader.getProperty("url7"));

// 3- Use below JavaScript method and scroll


    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    js.executeScript("window.scrollBy(0, 50000)");



//    a.  750 pixels down 10 times.
//            b.  750 pixels up 10 times
    for (int i = 0; i < 10; i++){
        js.executeScript("window.scrollBy(0, 50000)");

    }
    for (int i = 0; i < 10; i++){
        js.executeScript("window.scrollBy(0, -50000)");

    }




}




}
