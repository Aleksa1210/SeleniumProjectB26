package com.cydeo.test.homework;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC1 extends TestBase {


    @Test
    public void test1() throws InterruptedException {

    //Given : That I am on the url “https://qa2.vytrack.com/user/login”
        driver.get("https://qa2.vytrack.com/user/login");

    //When: I enter valid username “user171”
        WebElement user = driver.findElement(By.id("prependedInput"));
        user.sendKeys("user171");

    //And I enter valid password “UserUser123”
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");

    //And click login button
        WebElement loginBTN = driver.findElement(By.id("_submit"));
        loginBTN.click();
        Thread.sleep(3000);
    //When I am logged on to the dashboard as a Truck driver user
    //And I click on Fleet dropdown menu
        WebElement fleetDropdownMenu = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetDropdownMenu.click();

    //And  I should be able to see a “Vehicle Odometer”
        WebElement vehicleOdometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));

    //Then I have an access to “Vehicle Odometer” menu once I click button
        vehicleOdometer.click();
        Thread.sleep(3000);



    // test2(){
//        Scenario: As a truck driver, I should have an access to the dashboard
//        Given : That I am on Fleet dropdown menu
//        When: I hover over Fleet I am able to see “Vehicle Odometer”
//        And I click “Vehicle Odometer” menu
//        Then I am able to see all vehicle odometer informations on the grid



   // test3
    //Given : That I am on “Vehicle Odometer” page
    //And I am able to see  “Create Vehicle Odometer ” button on the top right corner
    //And I click on  “Create Vehicle Odometer” button
        WebElement createVehicleOdometer = driver.findElement(By.linkText("Create Vehicle Odometer"));
        createVehicleOdometer.click();
    //And once I am on the page I can add or cancel information
    // And If I click on “Cancel” button

   // WebElement cancelBTN = driver.findElement(By.xpath("//a[@title='Cancel']"));
   // cancelBTN.click();



    Thread.sleep(3000);
    //When: I add information I should click on “Save And Close” button
       WebElement createVehicleOdometer2 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        createVehicleOdometer2.click();
        Thread.sleep(5000);

    //Then I am returned to the “Vehicle Odometer” page

    }

}
