//package com.practice.Test;
//
//import com.practice.Page.DashboardPage;
//import com.practice.Base.BasePage;
//import com.practice.Page.LoginPage;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
//
//public class TestDashboardPage extends BasePage {
//
//    private WebDriver driver;
//    public DashboardPage dashboardPage;
//    public LoginPage loginPage;
//
//    @Test
//    public void testDashboardPageAccess(){
//        driver = getDriver();
//        dashboardPage = new DashboardPage(driver);
//        loginPage = new LoginPage(driver);
//        loginPage.inputAndLogin();
//        dashboardPage.checkPageAccess();
//    }
//
//}
