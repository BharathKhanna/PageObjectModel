package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	
	@Test
	public void runLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginbutton()
		.clickCrmsfalink()
		.clickLeadsTab()
		.clickCreateLeadsLink()
		.typeCompanyName("Capegemini")
		.typeFirstName("Bharath")
		.typeLastName("Khanna")
		.clickCreateLeadsButton()
		.verifyFirstname("Bharath");
		
		
	}

}
