package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;


public class EnterTimePageTests extends DriverScript  {

	
	@Test
	public void EnterTimePageValidate()
	{
		initApplication();
		EnterTimePage lp = new EnterTimePage();
		    String title=lp.verifyUserLoggedIn();
		    Assert.assertTrue(title.contains("Logout"));
			quitBrowser();
	}

	
	@Test
	public void testEnterTimePage()
	{
		initApplication();
		EnterTimePage et = new EnterTimePage();
		et.clickLogout();
		et.verifyUserLoggedIn();
		et.ClickTasksMenu();
		quitBrowser();
		
	}
	
}
