package com.qa.orangehrm.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.orangehrm.tests.BaseTests;
import com.qa.orangehrm.utilities.DriverUtilities;
import com.qa.orangehrm.utilities.PropertyReader;

public class LoginPage extends BaseTests{
    
    By logoImg = By.className("orangehrm-login-branding");

    By username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginBtn = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");

    @FindBy (className = "oxd-form-actions orangehrm-login-action")
    WebElement sumbitBtn;


    public void getLogoImg(){
        Assert.assertTrue(DriverUtilities.getDriver().findElement(logoImg).isDisplayed(), "User is not on the Login Page");
    }


    public String getPageTitle(){
        return DriverUtilities.getDriver().getTitle();
    }

    public void loginUser(){
           
        DriverUtilities.getDriver().findElement(username).sendKeys(PropertyReader.getProperty("login.username"));
        DriverUtilities.getDriver().findElement(password).sendKeys(PropertyReader.getProperty("login.password")); 
        DriverUtilities.getDriver().findElement(loginBtn).click();
    }
}
