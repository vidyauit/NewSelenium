package com.actitimeproject.genericLib;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	FileUtils fil=new FileUtils();
@BeforeClass
public void initialization(){
	driver= new FirefoxDriver();
	
}
@BeforeMethod
public void login() throws IOException{
	Properties pObj = fil.readDatafromProperty();
	driver.get(pObj.getProperty("url"));
LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
loginPage.login(pObj.getProperty("username"), pObj.getProperty("password"));
}
}
