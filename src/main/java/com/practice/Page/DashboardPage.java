package com.practice.Page;

import com.practice.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage extends BasePage {

    private By dashboardTab = By.xpath("//span[normalize-space()='Dashboard']");
    private By customerTab = By.xpath("//span[normalize-space()='Customers']");


    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkPageAccess(){
        String actualText = find(dashboardTab).getText();
        Assert.assertEquals(actualText, "Dashboard", "Dashboard page is not accessed");
    }

    public CustomerPage openCustomerTab(){
        click(customerTab);
        return new CustomerPage(driver);
    }
}
