package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class CreateDistributorReseller extends TestBase {

	@Test(dataProvider="getdata")
	public void DistribuorReseller(String FirstName, String LastName, String Mobile, String BussinessEmail, String PersonalEmail, String AddressLine1, String City, String State, String ZipCode, String UserName, String Password, String ConfirmPassword) throws InterruptedException {
		driver.navigate().to("http://osadmin2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("AdminUsername"))).sendKeys("osadmin");
		driver.findElement(By.xpath(OR.getProperty("AdminPAssword"))).sendKeys("onesuite");
		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("AdminUserManagementlink"))).click();
		// Validate DistributorReseller Page
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ValidateDistributorResellerPage"))),
				"Distributor/Reseller Page is not Found");
		driver.findElement(By.xpath(OR.getProperty("DistributorResellerMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("DistributorResellerAdd"))).click();
		// Validate Add DistributorReseller Page
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ValidateAddNewDistributor/Reseller"))),
				"Add Distributor/Reseller Page not found");
		Select AccountType = new Select(driver.findElement(By.xpath(OR.getProperty("AccountType"))));
		AccountType.selectByValue("2");
		Select AccountSubType = new Select(driver.findElement(By.xpath(OR.getProperty("AccountSubType"))));
		AccountSubType.selectByValue("1");
		Select AccountTitle = new Select(driver.findElement(By.xpath(OR.getProperty("AccountTitle"))));
		AccountTitle.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("FirstName"))).sendKeys(FirstName);
		driver.findElement(By.xpath(OR.getProperty("LastName"))).sendKeys(LastName);
		Select Country = new Select(driver.findElement(By.xpath(OR.getProperty("Country"))));
		Country.selectByValue("United Kingdom");
		
		driver.findElement(By.xpath(OR.getProperty("Mobile"))).sendKeys(Mobile);
		driver.findElement(By.xpath(OR.getProperty("BusinessEmail"))).sendKeys(BussinessEmail);
		driver.findElement(By.xpath(OR.getProperty("PersonalEmail"))).sendKeys(PersonalEmail);
		driver.findElement(By.xpath(OR.getProperty("SkypeId"))).sendKeys(AddressLine1);
		driver.findElement(By.xpath(OR.getProperty("AddressLine1"))).sendKeys(AddressLine1);
		driver.findElement(By.xpath(OR.getProperty("City/Town"))).sendKeys(City);
		driver.findElement(By.xpath(OR.getProperty("State/Province"))).sendKeys(State);
		driver.findElement(By.xpath(OR.getProperty("Zip/Postcode"))).sendKeys(ZipCode);
		Select Status = new Select(driver.findElement(By.xpath(OR.getProperty("Status"))));
		Status.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("UserName"))).sendKeys(UserName);
		driver.findElement(By.xpath(OR.getProperty("Password"))).sendKeys(Password);
		driver.findElement(By.xpath(OR.getProperty("ConfirmPassword"))).sendKeys(ConfirmPassword);
		Select CommissionProfile = new Select(driver.findElement(By.xpath(OR.getProperty("CommissionProfile"))));
		CommissionProfile.selectByValue("63");
		driver.findElement(By.xpath(OR.getProperty("Savebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("CONFIRMATION"))).click();

	}

	@DataProvider
	public Object[][] getdata() {
		String sheetName = "CreateDistributor";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			for (int colNum = 0; colNum < cols; colNum++) {
				// data[]0[0]
				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);

			}
		}
		return data;

	}

}
