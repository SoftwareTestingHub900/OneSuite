package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class OsAdmin_Login extends TestBase {

	@Test
	public void LoginAsAdmin() throws InterruptedException {
		driver.navigate().to("http://osadmin2.inovedia.com/");
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ValidateLoginPage"))), "Login page Not Found");
		driver.findElement(By.xpath(OR.getProperty("AdminUsername"))).sendKeys("osadmin");
		driver.findElement(By.xpath(OR.getProperty("AdminPAssword"))).sendKeys("onesuite");
		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn"))).click();
		// Assert.assertTrue(isElementPreset(By.xpath(OR.getProperty("ValidateLoginPage")));
	}

	@Test
	public void LogoutAsAdmin() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AdminProfileD"))).click();
		driver.findElement(By.xpath(OR.getProperty("AdminLogoutbtn"))).click();
		Thread.sleep(3000);

	}

	@Test
	public void LoginRequiredValidations() throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn1"))).click();
		Thread.sleep(3000);

	}

}