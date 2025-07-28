package com.practice2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.practice2.LoginPage;

public class LoginTest extends BasePage {

    private WebDriver driver;
    LoginPage loginPage;

    @Test (priority = 1)
    public void testPageAccess() {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        loginPage.checkPageAccess();
    }

    @Test (priority = 2)
    public void testLoginPage(){
//        loginPage = new LoginPage(driver);
        loginPage.checkLoginProcess();
    }
}