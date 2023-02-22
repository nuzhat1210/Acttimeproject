package com.Acttime.advanceselenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Acttime.Pom.Loginpage;
import com.Acttime.Pom.Logoutpage;

public class Baseclass {
	Filelibrary f = new Filelibrary();
	public static WebDriver driver;

	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connection", true);
	}

	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnection", true);
	}

	@BeforeClass
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("browser launch", true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("browser closed", true);
	}

	@BeforeMethod
	public void LogintoActtime() throws IOException {
		String UN = f.readdatafrompropertyfile("username");
		String PW = f.readdatafrompropertyfile("password");

		Loginpage pg = new Loginpage(driver); // we will create object for loginpage nonstatic method
		pg.login(UN, PW); // we are passing the value from login method
		Reporter.log("login ssuccessfully", true);

	}

	@AfterMethod
	public void LogouttoActtime() throws InterruptedException {
		Logoutpage pg = new Logoutpage(driver); // create object for nonsatic method
		pg.getLogoutbutton().click(); // directly get the value
		Reporter.log("Logout successfully", true);
	}

	@Test
	public void createcustomer() {
		Reporter.log("create customer");

	}
}