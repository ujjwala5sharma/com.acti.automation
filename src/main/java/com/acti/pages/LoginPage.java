package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;



 /*
* Name: LogInPage script
* Author : Ujjwala
* Verified and Approved: Shantosh
* Date last modified:02/06/2022
*/
 
public class LoginPage extends DriverScript {
	
	//************************************Page Elements*******************************************//
	
	
    @FindBy(id="username") WebElement tbUsername;
    @FindBy(name="pwd") WebElement tbPassword;
    @FindBy(xpath="//div[normalize-space()='Login']") WebElement btnLogin;
    @FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
    
    //*************************************Page Initialization************************************//
    
    // Page Factory is a class in Selenium which is used to initialize Current page Class Elements
    
    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
  //*************************************Page Actions************************************//
    
    public boolean verifyActiLogo()
    {
    	return actiLogo.isDisplayed();
    }
    
    public String getLoginPageTitle()
    {
    	return driver.getTitle();
    }
    
    
    public void enterUsername(String username)
    {
    	tbUsername.sendKeys(username);
    	
    }
    
    public void enterPassword(String Password)
    {
    	tbPassword.sendKeys(Password);
    }
    public void clickLoginButton() 
    {
    	btnLogin.click();
    }
}
