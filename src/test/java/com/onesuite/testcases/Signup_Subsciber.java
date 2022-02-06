package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class Signup_Subsciber extends TestBase {

	@Test (priority= 1)

	public void signup() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Signup"))).click();
		driver.findElement(By.xpath(OR.getProperty("SubscriberFirstName"))).sendKeys("Oonette");
		driver.findElement(By.xpath(OR.getProperty("SubscriberLastName"))).sendKeys("Stenseth");
		driver.findElement(By.xpath(OR.getProperty("SubscriberEmail"))).sendKeys("Oonette13600306@zwoho.com");
		driver.findElement(By.xpath(OR.getProperty("SubscriberCountry"))).click();
		Select country = new Select(driver.findElement(By.xpath(OR.getProperty("SubscriberSelect_Country"))));
		country.selectByValue("971_ae");
	//	Select countrycode = new Select (driver.findElement(By.xpath(OR.getProperty("SubscriberSelect_CountryCode"))));
	//	countrycode.selectByValue("971_ae");
		driver.findElement(By.xpath(OR.getProperty("SubscriberPhoneNumber"))).sendKeys("12453075116");
		driver.findElement(By.xpath(OR.getProperty("SubscriberUserName"))).sendKeys("Oonette");
		driver.findElement(By.xpath(OR.getProperty("SubscriberPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("SubscriberConfirmPassword"))).sendKeys("Usman12345!@#");
	//	driver.findElement(By.xpath(OR.getProperty("SubscriberReferralCodeReseller"))).sendKeys("33364942");
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("SubscriberAcceptandSend"))).click();
		driver.findElement(By.xpath(OR.getProperty("SubscriberSubmitbtn"))).click();
		log.info("Sign up page Submitted successfully");
	//	driver.findElement(By.xpath(OR.getProperty("SubscriberSelectPhoneNumbertype"))).click();
	//	driver.findElement(By.xpath(OR.getProperty("SubscriberPhoneNumbertype"))).click();
		Select PhoneNumber = new Select (driver.findElement(By.xpath(OR.getProperty("SubscriberSelectPhoneNumbertype"))));
		PhoneNumber.selectByValue("2");
		log.info("Subscriber Phone Number Verified");
		//Select PhoneNumber = new Select (driver.findElement(By.xpath(OR.getProperty("SubscriberSelectPhoneNumbertype"))));
		//PhoneNumber.selectByValue("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("SubscriberConfirmAccountSubmitbtn"))).click();
		Thread.sleep(70000);
		driver.findElement(By.xpath(OR.getProperty("SubscriberConfirmbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SubscriberDashboardbtn"))).click();
		log.info("Sign up successfully");
		
		
		

	}

}
