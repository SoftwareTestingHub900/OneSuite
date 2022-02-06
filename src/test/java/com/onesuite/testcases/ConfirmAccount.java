package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class ConfirmAccount extends TestBase{
	
	@Test
	public void confirmAccount() {
	
	Select PhoneNumber = new Select (driver.findElement(By.xpath(OR.getProperty("PhoneNumbertype"))));
	PhoneNumber.selectByValue("1");
	driver.findElement(By.xpath(OR.getProperty("ConfirmAccountSubmitbtn"))).click();
	

}
}