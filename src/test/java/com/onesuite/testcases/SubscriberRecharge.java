package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class SubscriberRecharge extends TestBase {

/*	@Test(priority = 1)
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Maryann");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();

	}
*/
	@Test(priority = 2)
	
	public void Recharge() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("RechargeMenu"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Addbalancetab"))), "Valiadate Add balance tab");
		log.info("Successfully Validated Add balance tab");
		driver.findElement(By.xpath(OR.getProperty("SelectAmountOther"))).click();
		driver.findElement(By.xpath(OR.getProperty("EnterAmount"))).sendKeys("50");
		driver.findElement(By.xpath(OR.getProperty("Countinuebtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ValidatedRechargeSection"))),
				"Valiadted Recharge Section on Che kout page");
		log.info("Valiadted Recharge Section");
		driver.findElement(By.xpath(OR.getProperty("PaywithCardbtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("PayInvoiceValidate"))),
				"Valiadted Pay Invoice form");
		log.info("Valiadted Pay Invoice form for Card");
		driver.findElement(By.xpath(OR.getProperty("CardNumber"))).sendKeys("4111111111111111");
		driver.findElement(By.xpath(OR.getProperty("CardExpirydate"))).sendKeys("0222");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("SecurityCode"))).sendKeys("099");
		driver.findElement(By.xpath(OR.getProperty("CardPaybtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("SuccessfullybuyBalance"))),
				"Validate Success popup");
		log.info("Validate Success Recharge");
		driver.findElement(By.xpath(OR.getProperty("Okaybtn"))).click();
		log.info("Successfully Recharged");

	}
}
