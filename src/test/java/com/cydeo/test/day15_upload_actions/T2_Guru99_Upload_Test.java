package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {

    @Test
    public void upload_file_test() throws InterruptedException {

//    1. Go to “https://demo.guru99.com/test/upload”
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

//    2. Upload file into Choose File
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
        String path = "/Users/robertibunjaj/Downloads/some-file.txt";
        chooseFile.sendKeys(path);


//    3. Click terms of service checkbox
        WebElement terms = Driver.getDriver().findElement(By.id("terms"));
        terms.click();

//    4. Click Submit File button
        WebElement submitBtn = Driver.getDriver().findElement(By.id("submitbutton"));
        submitBtn.click();

//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
        WebElement uploaded = Driver.getDriver().findElement(By.id("res"));
        String expected = "1 file\nhas been successfully uploaded.";
        Thread.sleep(3000);
        Assert.assertEquals(uploaded.getText(),expected);
        Driver.closeDriver();



    }




}
