package com.practice.Page;

import com.practice.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private By label = By.xpath("//img[@alt='Perfex CRM | Anh Tester Demo']");
    private By header = By.xpath("//h1[normalize-space()='Login']");
    private By emailTitle = By.xpath("//label[normalize-space()='Email Address']");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");
    private By forgotPasswordButton = By.xpath("//a[normalize-space()='Forgot Password?']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkAccessLoginPage() {
        String actualText = find(header).getText();
        Assert.assertEquals(actualText, "Login", "Trang Login chưa được truy cập");
    }

    public void checkEmailTitle() {
        String actualText = driver.findElement(emailTitle).getText();
        Assert.assertEquals(actualText, "Email Address", "tên email không đúng");
    }

    public DashboardPage inputAndLogin(String email, String password){
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        click(loginButton);
        return new DashboardPage(driver);
    }
}