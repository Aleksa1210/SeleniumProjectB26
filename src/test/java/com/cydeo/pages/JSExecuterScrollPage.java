package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSExecuterScrollPage {


    public JSExecuterScrollPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (className = "row")
    public WebElement text;



//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll
//            3- Use below JavaScript method and scroll
//    a.  750 pixels down 10 times.
//            b.  750 pixels up 10 times


}
