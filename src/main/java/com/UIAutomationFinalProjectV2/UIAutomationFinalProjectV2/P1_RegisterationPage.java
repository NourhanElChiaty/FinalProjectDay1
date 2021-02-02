package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_RegisterationPage extends PageBase {

	public P1_RegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement RegisterationLink() {
		WebElement RegisterationLink = driver.findElement(By.linkText("Register"));
		return RegisterationLink;
		
	}
	public WebElement GenderOption() {
		WebElement gender = driver.findElement(By.id("gender-female"));
		return gender;
		
	}
	
	public WebElement FirstName() {
		WebElement firstName = driver.findElement(By.id("FirstName"));
		return firstName;
	}
	
	public WebElement LastName() {
		WebElement lastName = driver.findElement(By.id("LastName"));
		return lastName;
	}
	
	public WebElement Email() {
		WebElement email = driver.findElement(By.id("Email"));
		return email;
	}
	public WebElement DayOfBirthDropDown() {
		WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
		return dayDropDown;
	}
	public WebElement SelectDay() {
		List<WebElement> daysInDropDown = driver.findElements(By.xpath("//select[@name=\"DateOfBirthDay\"]/option"));
		int listSize= daysInDropDown.size();
		int randomDay = ThreadLocalRandom.current().nextInt(1,listSize);
		WebElement daySelected =daysInDropDown.get(randomDay);
		System.out.println(randomDay);
		return daySelected;
	}
	public WebElement MonthOfBirthDropDown() {
		WebElement MonthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
		return MonthDropDown;
	}
	public WebElement SelectMonth() {
		List<WebElement> daysInDropDown = driver.findElements(By.xpath("//select[@name=\"DateOfBirthMonth\"]/option"));
		int listSize= daysInDropDown.size();
		int randomMonth = ThreadLocalRandom.current().nextInt(1,listSize);
		WebElement daySelected =daysInDropDown.get(randomMonth);
		System.out.println(randomMonth);
		return daySelected;
	}
	
	
	public WebElement yearOfBirthDropDown() {
		WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
		return yearDropDown;
	}
	public WebElement Selectyear() {
		List<WebElement> daysInDropDown = driver.findElements(By.xpath("//select[@name=\"DateOfBirthYear\"]/option"));
		int listSize= daysInDropDown.size();
		int randomMonth = ThreadLocalRandom.current().nextInt(1,listSize);
		WebElement daySelected =daysInDropDown.get(randomMonth);
		System.out.println(randomMonth);
		return daySelected;
	}
	public WebElement Password() {
		WebElement Password = driver.findElement(By.id("Password"));
		return Password;
	}
	
	public WebElement ConfirmPassword() {
		WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
		return ConfirmPassword;
	}
	
	public WebElement RegisterBtn() {
		WebElement RegisterBtn = driver.findElement(By.id("register-button"));
		return RegisterBtn;
	}
	
	public List<WebElement> RegisterationErrorMsg() {
		List<WebElement> errorMSG = driver.findElements(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
		return errorMSG;
	}
	
	public List<WebElement> RegisterationSuccessMsg() {
		List<WebElement> successMSG = driver.findElements(By.xpath("//div[@class=\"result\"]"));
		return successMSG;
	}
	
	
}
