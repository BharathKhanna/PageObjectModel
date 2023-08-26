package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage typeCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;

}
	
	public CreateLeadPage typeFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	
}
	
	public CreateLeadPage typeLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	
	
}
	
	public ViewLeadsPage clickCreateLeadsButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	
}
	
}
