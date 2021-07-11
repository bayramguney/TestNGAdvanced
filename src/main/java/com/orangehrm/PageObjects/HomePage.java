package com.orangehrm.PageObjects;

import com.orangehrm.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Assign Leave']")
    public WebElement assignLeave;















}
