package com.actiTime.testscripts;

import org.testng.annotations.Test;

import com.actiTime.webpages.ActiveProjectsAndCustomerPage;
import com.actiTime.webpages.AddNewCustomerPage;
import com.actiTime.webpages.OpenTaskPage;

public class CreateCustomer extends BaseClass{
	@Test
	public void testCreateCustomerTC_01()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewCustomerButton();
		AddNewCustomerPage ancp=new AddNewCustomerPage();
		ancp.enterCustomerName("QspKPHB11121");
		ancp.clickOnCreateCustomerButton();
		String s=apcp.retriveSuccessMessage();
		System.out.println(s);
		
	}


}
