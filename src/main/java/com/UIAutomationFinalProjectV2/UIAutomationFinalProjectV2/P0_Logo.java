package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P0_Logo extends PageBase {

	public P0_Logo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement logo(){
		WebElement logo = driver.findElement(By.xpath("//div[@class=\"header-logo\"]/a/img"));
		return logo;
	} 
}
