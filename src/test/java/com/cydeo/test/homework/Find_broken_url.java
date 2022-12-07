package com.cydeo.test.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_broken_url {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://webkul.com/");

        List<WebElement> links = driver.findElements(By.tagName("a")); // how much link on website
        System.out.println(links.size()); // how much link on website

        for (WebElement link: links) {  // go throw each
            String url = link.getAttribute("href");
            System.out.println(url); // all address

            if (url == null || url.isEmpty()){
                System.out.println("Url is empty");
                continue;
            }

            //open connection
            HttpURLConnection huc;
            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());
                huc.connect(); // connecting
                if (huc.getResponseCode()>=400){
                    System.out.println(url + "URL is broken");
                }else {
                    System.out.println(url + "URL is vailed");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        driver.close();









    }

}
