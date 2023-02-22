package com.Acttime.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceException {

	
	@Test
	public void exception() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement element = driver.findElement(By.id("username"));
	driver.navigate().refresh();
	element.sendKeys("admin");
	driver.close();   
	//we are getting Stale element exception error so we will handle by using POM .
		}
}