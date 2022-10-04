package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoaded {

    public DynamicallyLoaded(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "(//button[@class='btn btn-primary'])[1]") //"//button[.='Start']"
    public WebElement start;

    @FindBy (id = "username")
    public WebElement userName;

    @FindBy (id = "pwd")
    public  WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@id='flash']")
    public WebElement text;

    @FindBy (id = "loading")
    public WebElement loading;



//    TC#5 : Dynamically Loaded Page Elements 1
// 1. Go to https://practice.cydeo.com/dynamic_loading/1
// 2. Click to start
//3. Wait until loading bar disappears
//4. Assert username inputbox is displayed
//5. Enter username: tomsmith
//6. Enter password: incorrectpassword
//7. Click to Submit button
//8. Assert “Your password is invalid!” text is displayed.
//            Note: Follow POM Design Pattern











}
