package com.actiTime.testscripts;

import org.testng.annotations.Test;

import com.actiTime.webpages.ActiveProjectsAndCustomerPage;
import com.actiTime.webpages.AddNewProjectPage;
import com.actiTime.webpages.OpenTaskPage;


public class CreateProject extends BaseClass{
	@Test
	public void testCreateProjectTC_02()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomerLink();
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewProjectButton();
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.selectCustomerFromDropdown("QspKPHB11");
		anpp.enterprojectName("seleniu1m121");
		anpp.clickOnCreateProjectButton();
		String s=apcp.retriveSuccessMessage();
		System.out.println(s);
	}

}
