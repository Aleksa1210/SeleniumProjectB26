package com.cydeo.test.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating a private constructor, we are closing access to the
    // object of the class from outside the class
    private Driver(){}

    // We make Webdriver private, because we want to close access from outside of class
    //We make it static, because we will use it inside static method
    private static WebDriver driver; // default value driver null



    public static WebDriver getDriver(){
    // it will check if driver is null, if it is we will set up browser inside if statment
        // if you already set up driver and using it again for following line of code, it will return to same driver
        if (driver == null){ // single degisn pedder
            // We read browser type from Configuration.properties with help of ConfigurationReader class getProperty() method
          String browserType = ConfigurationReader.getProperty("browser");
          switch (browserType){
              case "chrome":
                  WebDriverManager.chromedriver().setup();
                  driver = new ChromeDriver();
                  driver.manage().window().maximize();
                  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                  break;

              case "firefox":
                  WebDriverManager.firefoxdriver().setup();
                  driver = new FirefoxDriver();
                  driver.manage().window().maximize();
                  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                  break;
          }
      }
      return driver;

    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null; // this line will termonate the existing driver session, with using this driver will not be use
        }

    }







}
