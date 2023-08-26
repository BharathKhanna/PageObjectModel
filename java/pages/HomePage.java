package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage verifyHomepage() {
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		return this;

	}

	public MyHomePage clickCrmsfalink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}


}
