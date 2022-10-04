package com.cydeo.test.day13_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Config_Practice extends TestBase {

    @Test
    public void login_ctm_app(){

//        2. Go to : http://login1.nextbasecrm.com/
      //  driver.get("http://login1.nextbasecrm.com/"); old

      driver.get(ConfigurationReader.getProperty("environment"));

//        3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
       username.sendKeys(ConfigurationReader.getProperty("username"));

//        4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

//        5. Click to Log In button

        WebElement clickLog = driver.findElement(By.xpath("//input[@value='Log In']"));
        clickLog.click();

//        6. Verify title is as expected:
//        Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");


    }




}
