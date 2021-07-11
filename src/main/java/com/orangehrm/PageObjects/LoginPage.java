package com.orangehrm.PageObjects;

import com.orangehrm.utilities.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@id='spanMessage']")
    public WebElement spanMessage;


}
