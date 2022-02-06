package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class CallForwarding extends TestBase {

	
	 /* @Test(priority = 1) 
	  public void login() {
	  driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Maryann"); 
	  driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
	  driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
	  
	  }
	 */
	@Test(priority = 7)
//	  @Test (priority=2)
	    public void CallForwardingNum() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("CallforwardingMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("Statusbtn"))).click();
		Select Country = new Select(driver.findElement(By.xpath(OR.getProperty("ForwardingCallCountry"))));
		Country.selectByValue("44_gb");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("CallForwardingNumb"))).sendKeys("44321678899");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("CallForwardingNumbSavebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("Succesfullyokbtn"))).click();

	}
}
