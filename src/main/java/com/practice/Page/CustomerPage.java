package com.practice.Page;

import com.practice.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerPage extends BasePage {

    private By customerSummaryLabel = By.xpath("//span[normalize-space()='Customers Summary']");

    public CustomerPage(WebDriver driver){
        this.driver = driver;
    }

    public void checkPageLabel(){
        String actualText = find(customerSummaryLabel).getText();
        Assert.assertEquals(actualText, "Customers Summary", "Customer Page is not accessed");
    }



}
