package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.testscripts.BaseClass;


public class OpenTaskPage {
public static Logger log;

	@FindBy(linkText="Projects & Customers")
	private WebElement ProjectAndCustomerLink;
	@FindBy(linkText="Settings")
	private WebElement settingsLink;
	@FindBy(linkText="Reports")
	private WebElement reportsLink;

	public OpenTaskPage()
	{
		log=Logger.getLogger(OpenTaskPage.class);
		PageFactory.initElements(BaseClass.driver, this);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void clickOnProjectsAndCustomerLink()
	{
		ProjectAndCustomerLink.click();
		log.info("---------clicked on Projects and Customers link--------");
	}
	public void clickOnSettingsLink()
	{
		settingsLink.click();
		log.info("----------clicked on Settings link---------");
	}
	public void ClickOnReports()
	{
		reportsLink.click();
		log.info("----------clicked on Reports-----------");
	}

}
