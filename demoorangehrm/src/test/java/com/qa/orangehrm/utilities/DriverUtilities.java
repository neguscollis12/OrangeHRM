package com.qa.orangehrm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtilities {
    static WebDriver driver;

public static void createDriver() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver" , "/Users/neguscollis/Desktop/Code/demoorangehrm/src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(PropertyReader.getProperty("app.url"));
        //driver.manage().window().maximize();

        Thread.sleep(1000);
    }

    public static WebDriver getDriver(){
        return driver;
    }
    
}
