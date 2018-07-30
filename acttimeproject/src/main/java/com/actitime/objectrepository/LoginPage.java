package com.actitime.objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
@FindBy(xpath="//input[@name='username']")
private WebElement uName;
@FindBy(xpath="//input[@name='pwd']")
private WebElement password;
@FindBy(xpath="//input[@type='submit']")
private WebElement submit;

public void login(String username,String pass) {
	uName.sendKeys(username);
	password.sendKeys(pass);
	submit.click();
}
}
