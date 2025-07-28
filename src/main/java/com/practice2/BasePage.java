package com.practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    public void driverConfig(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    public void openChromeDriver(){
        driver = new ChromeDriver();
        driverConfig();
    }

    public void openFirefoxDriver(){
        driver = new FirefoxDriver();
        driverConfig();
    }

    public void openDefaultDriver(){
        System.out.println("Driver not found. Opening Chrome driver by default");
        openChromeDriver();
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void eClick(By locator){
        find(locator).click();
    }

    public void eSendKeys(By locator, String text){
        find(locator).sendKeys(text);
    }

    @Parameters ({"browserType", "appURL"})
    @BeforeClass
    public void setDriver(String browserType, String appURL){
        switch (browserType){
            case "chrome" -> openChromeDriver();
            case "firefox" -> openFirefoxDriver();
            default -> openDefaultDriver();
        }
        driver.get(appURL);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}


