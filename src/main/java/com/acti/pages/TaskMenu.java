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
	
	
	@FindBy(xpath="//div[@class='title ellipsis'][contains(.,'Add New')]") WebElement buttonAddNew;
	@FindBy(xpath="//div[contains(@class,'item createNewCustomer')]") WebElement dropdownNewCustomer;
	@FindBy(xpath="//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]") WebElement textboxCustomerName;
    @FindBy(xpath="//textarea[contains(@placeholder,'Enter Customer Description')]") WebElement textareaCustomerDescription;
	@FindBy(xpath="//div[@class='components_button_label'][contains(.,'Create Customer')]") WebElement buttonCreateCustomer;
	@FindBy(xpath="//span[@class='innerHtml']") WebElement textSuccessMessage;
	
 //*************************************Page Initialization************************************//
    
    public TaskMenu()
    {
    	PageFactory.initElements(driver, this);
    }
    
    //*************************************Page Methods************************************// 
    
    
    
    public void clickbuttonAddNew()
    {
    	buttonAddNew.click();
    }
    
    public void clickdropdownNewCustomer()
    {
    	dropdownNewCustomer.click();
    }
    
    public void textboxCustomerName(String customername)
    {
    	textboxCustomerName.sendKeys("customername");
    }
    
    public void enterCustomerDescription(String customerdescription)
	{
		textareaCustomerDescription.sendKeys(customerdescription);
	}
	
	public void clickCreateCustomerButton()
	{
		buttonCreateCustomer.click();
	}
	
	public String validateSuccessMessage()
	{
		return textSuccessMessage.getText();
	}

}


