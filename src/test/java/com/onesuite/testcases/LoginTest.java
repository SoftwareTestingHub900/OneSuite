package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void loginAsSubscriber() throws InterruptedException {
		
		
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Daryl");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
		Thread.sleep(3000);
		log.info("Subscriber logged in Successfully");
		
	}

}
