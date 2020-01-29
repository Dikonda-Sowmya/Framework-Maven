package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.testscripts.BaseClass;


public class ActiveProjectsAndCustomerPage {
	public static Logger log;
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;
	@FindBy(className="successmsg")
	private WebElement successMessage;
	public ActiveProjectsAndCustomerPage()
	{
		log=Logger.getLogger(ActiveProjectsAndCustomerPage.class);
		PageFactory.initElements(BaseClass.driver, this);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void clickOnAddNewCustomerButton()
	{
		addNewCustomerButton.click();
		log.info("--------Add New Customer Button clicked--------");
	}
	public void clickOnAddNewProjectButton()
	{
		addNewProjectButton.click();
		log.info("---------Add New Project Button clicked-------");
	}
	public String retriveSuccessMessage()
	{
		String s=successMessage.getText();
		log.info("-------Success Message retrieved-------");
		return s;
	}


}
