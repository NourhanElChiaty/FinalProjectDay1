package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterTest;

public class BaseTest {
	protected WebDriver driver;
	  public String getProperty(String key) throws IOException {
		  Properties prop = new Properties();
		//  File file = new File(System.getProperty("user.dir")+"\\data.properties");
		  FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		  prop.load(input);
		   
		return prop.getProperty(key);
		  
	  }
	  
	  public void setProperty(String key , String value) throws IOException {
		  Properties prop = new Properties();
		  FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		  prop.load(stream);
		  prop.setProperty(key, value);
		  FileOutputStream output = new FileOutputStream(System.getProperty("user.dir")+"\\data.properties");
		  prop.store(output,"Test comment");
		
	  }
	  
  @BeforeTest
  public void beforeTest() throws IOException {
	  if(getProperty("browserName").equals("chrome")) {
		  System.out.println(getProperty("browserName"));
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 // String URL =getProperty("baseURL");
		  
		  }
	  else if(getProperty("browserName").equals("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	  driver.navigate().to(getProperty("baseURL"));
	  System.out.println(getProperty("baseURL"));
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
