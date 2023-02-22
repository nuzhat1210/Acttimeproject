//Tester will make this class 

package com.Acttime.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Usageclass {

	@Test
	public void LogintoActtime() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Loginpage lp=new Loginpage(driver); //create object for login page 
	lp.login("admin","manager");
	//another way to call element 
	lp.getUsernametextbox().sendKeys("admin");
	lp.getPasswordtextbox().sendKeys("password");
	lp.getLoginbutton().click();
	driver.close();
	
	
	
	
	}
}
