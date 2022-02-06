package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class CreateResellerbyAdmin extends TestBase {

	@Test
	public void AddResellerbyAdmin() {
		driver.navigate().to("http://osadmin2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("AdminUsername"))).sendKeys("osadmin");
		driver.findElement(By.xpath(OR.getProperty("AdminPAssword"))).sendKeys("onesuite");
		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("AdminUserManagementlink"))).click();
		driver.findElement(By.xpath(OR.getProperty("DistributorResellerMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("DistributorResellerAdd"))).click();
		Select AccountType = new Select(driver.findElement(By.xpath(OR.getProperty("AccountType"))));
		AccountType.selectByValue("7");

		/*
		 * Select DistributorAccounts = new
		 * Select(driver.findElement(By.xpath(OR.getProperty(
		 * "DistributorAccountsDropdown"))));
		 * DistributorAccounts.selectByVisibleText("Rex - rfaehnle@faehnle.co.uk");
		 */

			
		
		  for (int value = 0; value <= 9; value++) {
		  
		  Select DistributorAccountss = new Select(driver.findElement(By.xpath(OR.getProperty("DistributorAccountsDropdown")))); DistributorAccountss.selectByIndex(value);
		  DistributorAccountss.selectByIndex(value);
		  }
		 
		Select ResellerAccountType = new Select(driver.findElement(By.xpath(OR.getProperty("ResellerDisAccountType"))));
		ResellerAccountType.selectByValue("1");
		Select ResellerTitletype = new Select (driver.findElement(By.xpath(OR.getProperty("ResellerTitletype"))));
		ResellerTitletype.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("ResellerFirstName"))).sendKeys("David");
		driver.findElement(By.xpath(OR.getProperty("ResellerLastName"))).sendKeys("Leana");
		//driver.findElement(By.xpath(OR.getProperty("ResellerCountry"))).click();
		Select ResellerCountry = new Select (driver.findElement(By.xpath(OR.getProperty("ResellerCountry"))));
		ResellerCountry.selectByValue("United Kingdom");
		driver.findElement(By.xpath(OR.getProperty("ResellerMobile"))).sendKeys("090078601000");
		driver.findElement(By.xpath(OR.getProperty("ResellerBusinessEmail"))).sendKeys("Davidleo123@gmail.com");
		driver.findElement(By.xpath(OR.getProperty("ResellerPersonalEmail"))).sendKeys("Davidleo123@gmail.com");
		driver.findElement(By.xpath(OR.getProperty("ResellerAddress1"))).sendKeys("strt 5631 uk");
		driver.findElement(By.xpath(OR.getProperty("ResellerCity"))).sendKeys("London");
		driver.findElement(By.xpath(OR.getProperty("ResellerState"))).sendKeys("uk");
		driver.findElement(By.xpath(OR.getProperty("ResellerZip"))).sendKeys("uk9000");
		Select Status = new Select (driver.findElement(By.xpath(OR.getProperty("ResellerStatus"))));
		Status.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("ResellerUserName"))).sendKeys("David");
		driver.findElement(By.xpath(OR.getProperty("ResellerPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("ResellerConfirmPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("ResellerSave"))).click();
		driver.findElement(By.xpath(OR.getProperty("ResellerConfirmSavebtn"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * for(int Svalue=1; Svalue <=9; Svalue++) {
		 * driver.findElement(By.xpath(OR.getProperty("DisAccount"))).click(); }
		 */

		/*
		 * Select ResellerAccountType = new Select
		 * (driver.findElement(By.xpath(OR.getProperty("ResellerAccountType"))));
		 * ResellerAccountType.selectByValue("1");
		 */
	}

	/*
	 * @DataProvider public Object [][] getdata() {
	 * 
	 * return data;
	 * 
	 * }
	 */
}