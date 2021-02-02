package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Registeration extends BaseTest{
	// WebDriver driver;
  @Test
  public void RegisterationTestCase() throws InterruptedException, IOException {
	 P1_RegisterationPage register = new P1_RegisterationPage(driver);
	 PropertyFile prop = new PropertyFile();
	
	 register.RegisterationLink().click();
	 Thread.sleep(2000);
	 register.GenderOption().click();
	 register.FirstName().click();
	 Thread.sleep(3000);
	 register.FirstName().sendKeys(prop.getProperty("FirstName"));
	 register.LastName().click();
	 
	 register.LastName().sendKeys(prop.getProperty("LastName"));
	 
	 Thread.sleep(3000);
	 register.DayOfBirthDropDown().click();
	 
	 register.SelectDay().click();
	 Thread.sleep(3000);
	 register.MonthOfBirthDropDown().click();
	 
	 register.SelectMonth().click();
	 Thread.sleep(3000);
	 register.yearOfBirthDropDown().click();
	 
	 register.Selectyear().click();
	
	 register.Email().click();
	 Thread.sleep(3000);
	 register.Email().sendKeys(prop.getProperty("email"));
	 
	 register.Password().click();
	 Thread.sleep(3000);
	 register.Password().sendKeys(prop.getProperty("password"));
	 
	 register.ConfirmPassword().click();
	 register.ConfirmPassword().sendKeys(prop.getProperty("confirmPassword"));
	 
	 register.RegisterBtn().click();
	 
	 //System.out.println("Done");
	
	// assertFalse(driver.findElements(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).isEmpty());
	 
	 if(register.RegisterationErrorMsg().isEmpty()) {
		 assertTrue(register.RegisterationSuccessMsg().size()==1);
		 System.out.println("RegisterationSuccessMsg is Exists");
	 }
	 else {
		 Thread.sleep(3000);
			
		 assertTrue(register.RegisterationErrorMsg().size()==1);
		 System.out.println("RegisterationErrorMsg is Exists");
	 }
	 
	 
  }
}
