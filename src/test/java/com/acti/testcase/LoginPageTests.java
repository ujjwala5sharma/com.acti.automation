package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.acti.utils.ExcelLib;

public class LoginPageTests extends BaseTest {
	
	
	
	@Test(enabled = true)
	public void testValidateLoginPageDisplayed()
	{
		String title = lp.getLoginPageTitle();
		Assert.assertTrue(title.contains("Login"));
		
	}

	@Test(enabled = true)
   public void testValidateActiLogoDisplayed()
   {
	   boolean flag = lp.verifyActiLogo();
	   Assert.assertTrue(flag);
	   
	  }
		
	@Test(dataProvider = "actiData")
	public void testLoginFubction(String username, String password)
	{
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickLoginButton();
		String actual = ep.verifyUserLoggedIn();
		System.out.println(actual);
		ep.clickLogout();
		
	}
	
	}
