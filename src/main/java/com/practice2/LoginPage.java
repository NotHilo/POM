package com.practice2;

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

    public void checkPageAccess(){
        String actualText = driver.findElement(emailTitle).getText();
        Assert.assertEquals(actualText, "Email Address", "Login Page is not right");
    }

    public void checkLoginProcess(){
        eSendKeys(emailField, "admin@example.com");
        eSendKeys(passwordField, "123456");
        eClick(loginButton);
    }

}