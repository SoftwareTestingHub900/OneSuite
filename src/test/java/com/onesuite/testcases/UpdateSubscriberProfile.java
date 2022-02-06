package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class UpdateSubscriberProfile extends TestBase {

/*	@Test(priority = 1)
	public void login() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Maryann");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();

	}
*/
	@Test(priority = 11)
	// @Test(priority = 2)
	public void SubscriberProfile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("SubscriberProfilebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ViewSubscriberProfilebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SubscriberUpdateProfilebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SubscriberAddressLine1"))).clear();
		driver.findElement(By.xpath(OR.getProperty("SubscriberAddressLine1"))).sendKeys("8289 Cadogan St");
		driver.findElement(By.xpath(OR.getProperty("SubscriberAddressLine2"))).clear();
		driver.findElement(By.xpath(OR.getProperty("SubscriberAddressLine2"))).sendKeys("211 Hobart St");
		driver.findElement(By.xpath(OR.getProperty("SubscriberCity"))).clear();
		driver.findElement(By.xpath(OR.getProperty("SubscriberCity"))).sendKeys("Newquay");
		driver.findElement(By.xpath(OR.getProperty("SubscriberState"))).clear();
		driver.findElement(By.xpath(OR.getProperty("SubscriberState"))).sendKeys("Brimpton");
		Select Country = new Select(driver.findElement(By.xpath(OR.getProperty("SubscriberProfileCountry"))));
		Country.selectByValue("ae");
		driver.findElement(By.xpath(OR.getProperty("SubscriberPostalCode"))).sendKeys("0987");
		// driver.findElement(By.xpath(OR.getProperty("UploadProfilebtn"))).click();
		// WebElement Addfile =
		// driver.findElement(By.xpath(OR.getProperty("UploadProfilebtn")));
		// Addfile.sendKeys("C:\\Users\\Usman\\OneDrive\\Desktop\\Pics\\637576810772775043_Un-Named.jpg");
		driver.findElement(By.xpath(OR.getProperty("UploadProfilebtn")))
				.sendKeys("D:\\Project\\Onesuite\\Shahid-Afridi-1.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("SubscriberProfileSubmitbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SubscriberProfileUpdatedbtn"))).click();
		log.info("Subscriber profile updated successfully");
	}
}
