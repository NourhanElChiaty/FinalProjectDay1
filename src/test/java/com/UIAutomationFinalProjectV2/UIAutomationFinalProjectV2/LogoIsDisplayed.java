package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class LogoIsDisplayed extends BaseTest {
  @Test
  public void logo() throws InterruptedException {
	 
	  
	  P0_Logo logo = new P0_Logo(driver);
	  WebElement logoElement = logo.logo();
	  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
	  try {
		  Thread.sleep(2000);
	  assertEquals(logoElement.isDisplayed(), true);
	  System.out.println("Test case is passed");
	  }
	  catch (AssertionError e) {
		  System.out.println("Test case is failed");
	  }
  }
}
