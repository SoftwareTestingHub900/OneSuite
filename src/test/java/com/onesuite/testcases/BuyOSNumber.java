package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class BuyOSNumber extends TestBase {

	/*@Test(priority = 1)

	public void LoginSubs() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Maryann");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
	}
*/
	@Test(priority = 3)
	public void OSBuyNumber() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("MyOSnumbermenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddOSNumberbtn"))).click();
	//	driver.findElement(By.xpath(OR.getProperty(""))).click();
		Select ServiceType = new Select(driver.findElement(By.xpath(OR.getProperty("Servicetype"))));
		ServiceType.selectByValue("2");
		Thread.sleep(3000);
		Select NumberType = new Select(driver.findElement(By.xpath(OR.getProperty("OSNumberType"))));
		NumberType.selectByValue("1");
		Select BuyNumberCountry = new Select(driver.findElement(By.xpath(OR.getProperty("BuyNumberCountry"))));
		BuyNumberCountry.selectByValue("224");
		driver.findElement(By.xpath(OR.getProperty("OSNumberQuantity"))).clear();
		driver.findElement(By.xpath(OR.getProperty("OSNumberQuantity"))).sendKeys("5");
		driver.findElement(By.xpath(OR.getProperty("OSNumberSearchbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart1"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart2"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart3"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart4"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart5"))).click();
		driver.findElement(By.xpath(OR.getProperty("Checkoutbtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ValidateOSnumbers"))), "Valaidate OS Numbers");
		log.info("OS Numbers Validated");
		driver.findElement(By.xpath(OR.getProperty("OSbalancebtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("accountbalancepopup"))),
				"Are you sure you want to pay from your account balance?");
		log.info("Are you sure you want to pay from your account balance?");
		driver.findElement(By.xpath(OR.getProperty("Yesbtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("okaybtn"))).click();

	}
}