package com.Acttime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
	
@FindBy(xpath="//div[.='Add New']")
private WebElement Addnewbutton;

@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcustomer ;


@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement newcustomername ;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerdescription ;

@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
private WebElement dropdown;

@FindBy(xpath="//div[.='Our company']" )
private WebElement ourcomp;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement createcustomerbutton;

public WebElement getAddnewbutton() {
	return Addnewbutton;
}

public WebElement getNewcustomer() {
	return newcustomer;
}

public WebElement getNewcustomername() {
	return newcustomername;
}

public WebElement getCustomerdescription() {
	return customerdescription;
}

public WebElement getDropdown() {
	return dropdown;
}

public WebElement getOurcomp() {
	return ourcomp;
}

public WebElement getCreatecustomerbutton() {
	return createcustomerbutton;
}

public Taskpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

//business logic or generic method 

public void completetask(String customername,String description) {
	Addnewbutton.click();
	newcustomer.click();
	newcustomername.sendKeys(customername);
	customerdescription.sendKeys(description);
	dropdown.click();
	
}




}
