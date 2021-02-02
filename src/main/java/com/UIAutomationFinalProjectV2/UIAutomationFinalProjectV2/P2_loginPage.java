package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_loginPage extends PageBase{

	public P2_loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement loginLink() {
		return driver.findElement(By.linkText("Log in"));
	}
	
	public WebElement Email() {
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement Password() {
		return driver.findElement(By.id("Password"));
	}
	
	public WebElement LoginBtn() {
		return driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
	}

}
