package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	//Action + Element name
	public LoginPage enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	
	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
	}
	
	public HomePage clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
