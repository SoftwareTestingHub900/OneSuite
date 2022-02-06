package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class SubscriberNotifications extends TestBase {
	/*
	 * @Test (priority=1) public void login() {
	 * driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Octavio");
	 * driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys(
	 * "Usman12345!@#");
	 * driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
	 * 
	 * }
	 */

	@Test(priority=14)
	public void ReadNotification() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("Notificatioicon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(OR.getProperty("ReadNotification"))).click();
		log.info("Verify Notification");
	}
}
