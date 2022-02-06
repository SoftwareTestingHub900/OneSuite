package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class CallPlan extends TestBase {

/*	@Test(priority = 1)
	public void login() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Maryann");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();

	}
*/
	@Test(priority = 9)
//    @Test(priority = 2)
	public void Callplan() {
		driver.findElement(By.xpath(OR.getProperty("CallPlanMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("BuyIn"))).click();
		driver.findElement(By.xpath(OR.getProperty("PaywithOSbalancebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SucessfullybuyCallPlan"))).click();
		driver.findElement(By.xpath(OR.getProperty("Successokbtn"))).click();

	}
}
