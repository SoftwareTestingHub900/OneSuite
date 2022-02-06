package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class CreateResellerbyDistributor extends TestBase {

	@Test
	public void ResellerbyDistributor() throws InterruptedException {
		driver.navigate().to("http://osadmin2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("DistributorUserName"))).sendKeys("Kami");
		driver.findElement(By.xpath(OR.getProperty("DistributorUserPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("DistributorLoginbtn"))).click();
		// Only For Login Distributor First time
		
		/*
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath(OR.getProperty("NewPassword"))).sendKeys(
		 * "Usman12345!@#");
		 * driver.findElement(By.xpath(OR.getProperty("ConfirmNewPassword"))).sendKeys(
		 * "Usman12345!@#");
		 * driver.findElement(By.xpath(OR.getProperty("ResetPasswordbtn"))).click();
		 * driver.findElement(By.xpath(OR.getProperty("SuccessPasswordbtn"))).click();
		 */
		driver.findElement(By.xpath(OR.getProperty("DistributorUserManagement"))).click();
		driver.findElement(By.xpath(OR.getProperty("Resellerslink"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddResellerbtn"))).click();
		Select Type = new Select (driver.findElement(By.xpath(OR.getProperty("Type"))));
		Type.selectByValue("1");
		Select Title = new Select (driver.findElement(By.xpath(OR.getProperty("Title"))));
		Title.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("ResellerFirstName"))).sendKeys("Roxanne");
		driver.findElement(By.xpath(OR.getProperty("ResellerLastName"))).sendKeys("Hedegore");
		Select ResellerCountry = new Select (driver.findElement(By.xpath(OR.getProperty("ResellerCountry"))));
		ResellerCountry.selectByValue("United Kingdom");
		driver.findElement(By.xpath(OR.getProperty("ResellerMobile"))).sendKeys("01363139612");
		driver.findElement(By.xpath(OR.getProperty("ResellerBusinessEmail"))).sendKeys("Roxanne@hotmail.com");
		driver.findElement(By.xpath(OR.getProperty("ResellerPersonalEmail"))).sendKeys("Roxanne@hotmail.com");
		driver.findElement(By.xpath(OR.getProperty("ResellerSkypeId"))).sendKeys("Roxanne21");
		driver.findElement(By.xpath(OR.getProperty("ResellerAddressLine1"))).sendKeys("256 Vesuvius St #159");
		driver.findElement(By.xpath(OR.getProperty("ResellerCity/Town"))).sendKeys("Stutton with Hazlewood");
		driver.findElement(By.xpath(OR.getProperty("ResellerState/Province"))).sendKeys("North Yorkshire");
		driver.findElement(By.xpath(OR.getProperty("ResellerZip/Postcode"))).sendKeys("LS24 9UA");
		Select ResellerStatus = new Select (driver.findElement(By.xpath(OR.getProperty("ResellerStatus"))));
		ResellerStatus.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("ResellerUserName"))).sendKeys("Roxanne");
		driver.findElement(By.xpath(OR.getProperty("ResellerPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("ResellerConfirmPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("ResellerSavebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ResellerConfirmbtn"))).click();
		
		
	}
}