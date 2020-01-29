package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actiTime.testscripts.BaseClass;

public class AddNewProjectPage {
	public static Logger log;
	
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	@FindBy(name="name")
	private WebElement projectNameTextField;
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	public AddNewProjectPage()
	{
		log=Logger.getLogger(AddNewProjectPage.class);
		PageFactory.initElements(BaseClass.driver, this);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void selectCustomerFromDropdown(String customerName)
	{
		Select s1=new Select(customerDropdown);
		s1.selectByVisibleText(customerName);
		log.info("--------selected customer from dropdown---------");
	}
	public void enterprojectName(String projectName)
	{
		projectNameTextField.sendKeys(projectName);
		log.info("---------entered project name---------");
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
		log.info("---------clicked on Create Project Button---------");
	}

}
