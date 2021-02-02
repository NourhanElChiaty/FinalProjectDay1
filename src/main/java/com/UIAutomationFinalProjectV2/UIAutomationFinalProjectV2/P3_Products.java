package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;


import java.util.List;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Products extends PageBase {
	public P3_Products(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement RandomMainProducts() {
		
		List<WebElement>Categories = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
		int ProductMenusize =Categories.size();
		int randomProduct = ThreadLocalRandom.current().nextInt(0,5);
		 WebElement selectedProduct =Categories.get(randomProduct);
		 
		 
		return selectedProduct;
		
	}
	
	
	public WebElement mainProduct() {
		WebElement sort = driver.findElement(By.xpath("//div[@class=\"product-selectors\"]"));
		return sort;
	}
	public WebElement SubProducts() {
		WebElement SubProducts = driver.findElement(By.xpath("//div[@class=\"category-grid sub-category-grid\"]"));
		return SubProducts;
	}
	public WebElement RandomSubProducts() {
	     
			List<WebElement>subProducts = driver.findElements(By.xpath("//div[@class=\"picture\"]/a"));
			int ProductMenusize =subProducts.size();
			int randomProduct = ThreadLocalRandom.current().nextInt(1,ProductMenusize);
			 WebElement selectedProduct =subProducts.get(randomProduct);
			 
			return selectedProduct;

		
		
	}

}
