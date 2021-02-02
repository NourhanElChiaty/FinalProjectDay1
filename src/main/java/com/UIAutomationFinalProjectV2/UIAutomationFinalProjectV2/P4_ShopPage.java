package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_ShopPage extends PageBase {

	public P4_ShopPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  
	 public WebElement shop() {
	WebElement shopArea= driver.findElement(By.xpath("//div[@class=\"item-grid\"]"));
	return shopArea;
	}
	
	 public WebElement ShoppingItems() {
		 List<WebElement>Categories = driver.findElements(By.xpath("//input[@class=\"button-2 product-box-add-to-cart-button\"]"));
			int ProductMenusize =Categories.size();
			int randomProduct = ThreadLocalRandom.current().nextInt(0,ProductMenusize);
			 WebElement selectedProduct =Categories.get(randomProduct);
			 return selectedProduct;
			}
	 public WebElement ItemName() {
		 WebElement itemName = driver.findElement(By.xpath("//h2[@class=\"product-title\"]"));
		 return itemName;
	 }
	
	 public WebElement sucessAdd() {
		 WebElement statusBar = driver.findElement(By.id("bar-notification"));
		 return statusBar;
	 }
}
