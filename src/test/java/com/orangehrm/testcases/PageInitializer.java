package com.orangehrm.testcases;

import com.orangehrm.PageObjects.*;

public class PageInitializer {
    public static HomePage homePage;
    public static LoginPage loginPage;

    public static void initializePages() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
}