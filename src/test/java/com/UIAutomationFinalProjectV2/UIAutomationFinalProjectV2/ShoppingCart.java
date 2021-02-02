package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShoppingCart extends BaseTest{
  @Test
  public void AddProduct() throws IOException, InterruptedException {
	  
	
	  Actions actions = new Actions(driver);
	  P2_loginPage loginPage = new P2_loginPage(driver);
	  P3_Products Products = new P3_Products(driver);
	  P4_ShopPage addToCart = new P4_ShopPage(driver);
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  loginPage.loginLink().click();
	  Thread.sleep(2000);
	  loginPage.Email().sendKeys(prop.getProperty("email"));
	  Thread.sleep(2000);
	  loginPage.Password().sendKeys(prop.getProperty("password"));
	  Thread.sleep(2000);
	  loginPage.LoginBtn().click();
	  Thread.sleep(2000);

	WebElement targetMainProduct = Products.RandomMainProducts();
	Reporter.log(targetMainProduct.getText());
	System.out.println(targetMainProduct.getText());
	  //WebElement targetMainProduct =driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]"));
//	Thread.sleep(2000);
//	actions.moveToElement(targetMainProduct).perform();
	Thread.sleep(2000);
	targetMainProduct.click();
	
	Thread.sleep(2000);
	try{
		Products.mainProduct().isDisplayed();
	
		Thread.sleep(2000);
		addToCart.ShoppingItems().click();
		Reporter.log(addToCart.ItemName().getText());
		System.out.println(addToCart.ItemName().getText());
	}
	catch(NoSuchElementException e) {
		Thread.sleep(2000);
		WebElement targetSubProduct = Products.RandomSubProducts();
		Reporter.log(targetSubProduct.getText());
		Thread.sleep(2000);
		targetSubProduct.click();
		Thread.sleep(2000);
		addToCart.ShoppingItems().click();
		Reporter.log(addToCart.ItemName().getText());
		
	}
	 
	assertTrue(wait.until(ExpectedConditions.visibilityOf(addToCart.sucessAdd())).isDisplayed());
		
	
	  
	  
			  
  }
}
