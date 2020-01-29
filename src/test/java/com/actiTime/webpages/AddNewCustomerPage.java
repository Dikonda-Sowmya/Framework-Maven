package com.actiTime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.testscripts.BaseClass;

public class AddNewCustomerPage {
    public static Logger log;
	
	@FindBy(name="name")
	private WebElement customerNameTextField;
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	public AddNewCustomerPage()
	{
		log=Logger.getLogger(AddNewCustomerPage.class);
		PageFactory.initElements(BaseClass.driver, this);
		PropertyConfigurator.configure("log4j.properties");
	}
	public void enterCustomerName(String customerName)
	{
		customerNameTextField.sendKeys(customerName);
		log.info("----------entered Customer name----------");
	}
	public void clickOnCreateCustomerButton()
	{
		createCustomerButton.click();
		log.info("---------clicked on Create Customer Button----------");
		
	}
}
