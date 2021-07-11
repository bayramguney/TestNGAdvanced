package com.orangehrm.testcases;

import com.orangehrm.utilities.*;

import org.openqa.selenium.support.ui.*;

import org.testng.*;
import org.testng.annotations.*;

import java.util.*;

public class LoginTest extends BaseTest {


    @Test(dataProviderClass = DataProviders.class, dataProvider = "masterDP")
    public void loginTest(Hashtable<String, String> data) {
        ExcelReader excel = new ExcelReader(Constants.SUITE1_XL_PATH);
        DataUtil.checkExecution("master", "LoginTest", data.get("Runmode"), excel);
        log.info("Inside Login Test");

        openBrowser(data.get("browser"));
        logInfo("Launched Browser : " + data.get("browser"));

        getUrl(ConfigsReader.getProperty("url"));
        logInfo("The website is ready : " + ConfigsReader.getProperty("url"));
        System.out.println(ConfigsReader.getProperty("url"));

        wait.until(ExpectedConditions.visibilityOf(loginPage.username));
        loginPage.username.sendKeys(ConfigsReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigsReader.getProperty("password"));
        loginPage.loginButton.click();
       
        logInfo("Login is successful with the valid credential => username :  " + ConfigsReader.getProperty("username") +
                "|   password : " + ConfigsReader.getProperty("password"));


        wait.until(ExpectedConditions.elementToBeClickable(homePage.assignLeave));
        homePage.assignLeave.click();
        logInfo("At the Assign Leave Page");

quit();
    }
}
