package com.Acttime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
//declaration
@FindBy(id = "username")                                    //we will use @findby instead of using findelement
	private WebElement usernametextbox;                    //private--hiding the element
	
@FindBy(name = "pwd")
private WebElement passwordtextbox;

@FindBy(xpath = "//div[.='Login ']")
private WebElement loginbutton ;   //hiding element by using private 
	
//initialization
public Loginpage (WebDriver driver){                      //creating constructor-give classname 
PageFactory.initElements(driver, this);	                 //to initialize we use  initelements  static method which is present in page factory class
                                                         //it will accept two parameter 1.driver , 2.this
}
//getter method applied 
public WebElement getUsernametextbox() {
	return usernametextbox;
}

public WebElement getPasswordtextbox() {
	return passwordtextbox;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

//utilization
public void login(String username,String password)     //creating constructor  
{ 
	usernametextbox.sendKeys(username);
	passwordtextbox.sendKeys(password);
	loginbutton.click();
}
//We can use business logic instead of using utlization 
//business logic
	public void login1 (String username,String password) {
		usernametextbox.sendKeys(username);
		passwordtextbox.sendKeys(password);
		loginbutton.click();
		//we will create one object in baseclass 
	}
	


}





