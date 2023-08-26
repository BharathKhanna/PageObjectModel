package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@Test
	public void runLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("demosalesmanager")
		.enterPassword("crmsfa")
		.clickLoginbutton()
		.verifyHomepage();
		
	}

}
