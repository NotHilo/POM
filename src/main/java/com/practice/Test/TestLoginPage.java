package com.practice.Test;

import com.practice.Base.BasePage;
import com.practice.Page.CustomerPage;
import com.practice.Page.DashboardPage;
import com.practice.Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLoginPage extends BasePage {

    private WebDriver driver;
    public LoginPage loginPage;
    public DashboardPage dashboardPage;
    public CustomerPage customerPage;

    @Test(priority = 1)
    public void testLoginPageAccess() {
        driver = getDriver();
        loginPage = new LoginPage(driver);
        loginPage.checkAccessLoginPage();
    }

    @Test(priority = 2)
    public void testInputAndLogin() {
        loginPage = new LoginPage(driver);
        dashboardPage = loginPage.inputAndLogin("admin@example.com", "123456");
    }

    @Test (priority = 3)
    public void testDashboardPageAccess() {
        dashboardPage.checkPageAccess();
        customerPage = dashboardPage.openCustomerTab();
        customerPage.checkPageLabel();
    }

}
