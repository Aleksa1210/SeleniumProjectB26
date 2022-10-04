package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage7 {

    public DynamicallyLoadedPage7(){ // constructor

        PageFactory.initElements(Driver.getDriver(), this); // initElements() - for unitilize
    }

    @FindBy(id = "alert")
    public WebElement doneMsg ; // find locater

    @FindBy (tagName = "img") // or //img[@alt='square pants']
    public WebElement image;


//        1. Go to https://practice.cydeo.com/dynamic_loading/7
//        2. Wait until title is “Dynamic title”
//        3. Assert:
//        Message “Done” is displayed.
//        4. Assert: Image is displayed.


}
