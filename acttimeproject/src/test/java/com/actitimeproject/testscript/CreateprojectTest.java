package com.actitimeproject.testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.objectrepository.HomePage;
import com.actitimeproject.genericLib.BaseClass;

public class CreateprojectTest extends BaseClass{
	@Test
	public void createNewCustomer(){
HomePage homepage=PageFactory.initElements(BaseClass.driver, HomePage.class);
	
	}
}
