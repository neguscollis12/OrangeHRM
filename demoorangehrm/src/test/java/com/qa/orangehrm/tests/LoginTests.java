package com.qa.orangehrm.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.orangehrm.pages.LoginPage;
import com.qa.orangehrm.utilities.PropertyReader;


public class LoginTests extends BaseTests{
    
    LoginPage loginPage = new LoginPage();

   
    @Test(groups = {"Login.titlePages"})
    public void testPageTitle(){

        String pageTitle = loginPage.getPageTitle();
        Assert.assertEquals(pageTitle, PropertyReader.getProperty("title.name"));

    }

    @Test(groups = {"Login.logoImg"})
    public void testLoginLogo(){
           loginPage.getLogoImg();
    }

    @Test(groups = {"Login.login"})
    public void testLoginFeature(){
            loginPage.loginUser();
    }




}
