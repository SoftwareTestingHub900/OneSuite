package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class NumberPorting extends TestBase {

	@Test(priority = 1)
	public void login() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Yuance");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
	}

	@Test(priority = 2)
	public void OSNumberPorting() {

		driver.findElement(By.xpath(OR.getProperty("NumberPortingMenu"))).click();
		Select PortingType = new Select(driver.findElement(By.xpath(OR.getProperty("PortingType"))));
		PortingType.selectByValue("1");
		Select PortingCountry = new Select(driver.findElement(By.xpath(OR.getProperty("PortingCountry"))));
		PortingCountry.selectByValue("93");
		Select PortingNumberType = new Select(driver.findElement(By.xpath(OR.getProperty("PortingNumberType"))));
		PortingNumberType.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("PortingNextbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("PortingNextbtn2"))).click();
	}

}
