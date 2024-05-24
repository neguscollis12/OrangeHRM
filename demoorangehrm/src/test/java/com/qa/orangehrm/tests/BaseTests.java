package com.qa.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.orangehrm.utilities.DriverUtilities;

public class BaseTests extends DriverUtilities{
    
    

    WebDriver driver;


    public BaseTests(){
        driver = DriverUtilities.getDriver();
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws InterruptedException{
        DriverUtilities.createDriver();
    }


    @AfterMethod(alwaysRun = true)
    public void cleanUp(){
        DriverUtilities.getDriver().quit();
    }
}
