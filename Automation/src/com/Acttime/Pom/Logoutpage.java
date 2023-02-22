package com.Acttime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
@FindBy(xpath="//div[.='Tasks'")
private WebElement Taskbutton ;

@FindBy(id="logoutLink")
private WebElement logoutbutton ;

public Logoutpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getTaskbutton() {
	return Taskbutton;
}

public WebElement getLogoutbutton() {
	return logoutbutton;
}
public void logout () {
	 Taskbutton .click();
	 logoutbutton.click();
}
}
