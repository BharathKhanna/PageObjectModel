package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods {
	
	public ViewLeadsPage verifyFirstname(String expName) {
		
		String actName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		Assert.assertEquals(actName, expName);
		return this;
	}

}
