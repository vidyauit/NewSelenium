package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//div[@id='container']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td/table/tbody/tr/td[6]/a")
	WebElement clickOnProjCust;
	public void clickOnProjectCustomer(){
		clickOnProjCust.click();
	}
}
