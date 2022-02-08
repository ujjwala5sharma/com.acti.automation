package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name: Task Menu Page
 * Author : Ujjwala
 * Verified and approved : Shantosh
 * Date last modified : 02/07/2022
 */


public class TaskMenu extends DriverScript {
	
	//************************************Page Elements*******************************************//
	
	@FindBy(id="container_tasks") WebElement btnTaskmenu;
	@FindBy(xpath="//div[@class='title ellipsis'][contains(.,'Add New')]") WebElement btnAddNew;
	@FindBy(xpath="//div[contains(@class,'item createNewCustomer')]") WebElement btnNewCust;
	@FindBy(xpath="//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]") WebElement tbCustName;
    @FindBy(xpath="//textarea[contains(@placeholder,'Enter Customer Description')]") WebElement tbCustDes;
	@FindBy(xpath="//div[@class='components_button_label'][contains(.,'Create Customer')]") WebElement btnCreateCust;
	
	
 //*************************************Page Initialization************************************//
    
    public TaskMenu()
    {
    	PageFactory.initElements(driver, this);
    }
    
    //*************************************Page Actions************************************// 
    
    public void clickTaskmenu()
    {
    	btnTaskmenu.click();
    }
    
    public void clickaddNew()
    {
    	btnAddNew.click();
    }
    
    public void clickNewCust()
    {
    	btnNewCust.click();
    }
    
    public void tbCustname()
    {
    	tbCustName.sendKeys("Monika");
    }
    
    public void tbCustName()
    {
    	tbCustName.sendKeys("QA");
    }
    
    public void btnCreateCust()
    {
    	btnCreateCust.click();
    }
}


