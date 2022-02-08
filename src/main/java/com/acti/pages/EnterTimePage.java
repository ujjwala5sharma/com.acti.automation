package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.acti.base.DriverScript;

public class EnterTimePage extends DriverScript {
	
	// ***************************Page Elements*********************************************//
	
	@FindBy(id="logoutLink") WebElement linkLogout;
	@FindBy(xpath="//a[@class='userProfileLink username ']") WebElement textUserLoggedIn;
	@FindBy(id="container_tasks") WebElement menuTasks;
	
	//********************************Page Initialization************************************//
	
	public EnterTimePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	//*******************************Page Methods****************************************//
	
	public void ClickTasksMenu() 
	{
     menuTasks.click();
	}
	
	public String verifyUserLoggedIn()
	{
		return textUserLoggedIn.getText();
	}
	
	public void clickLogout()
	{
		linkLogout.click();
	}
	
	}
