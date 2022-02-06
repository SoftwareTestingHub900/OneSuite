package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class AddressBook extends TestBase {

/*	@Test(priority = 1)
	//@Test(dataProvider = "getdata")
	public void login() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Blair");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
		log.info("Logged in Successfully");

	}
*/
//	@Test(priority = 2)
	@Test(dataProvider = "getdata")
	public void SubscriberAddressBook(String FirstName, String LastName, String Company, String EmailAddress, String Number) throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Blair");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
		log.info("Logged in Successfully");
		driver.findElement(By.xpath(OR.getProperty("SubscriberAddressBook"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddOSContact"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("ContactFirstName"))).sendKeys(FirstName);
		driver.findElement(By.xpath(OR.getProperty("ContactLastName"))).sendKeys(LastName);
		driver.findElement(By.xpath(OR.getProperty("ContactCompany"))).sendKeys(Company);
		driver.findElement(By.xpath(OR.getProperty("EmailContactType"))).sendKeys(EmailAddress);
		Select ContactType = new Select(driver.findElement(By.xpath(OR.getProperty("SubscriberContactType"))));
		ContactType.selectByValue("1");
		Select CountryAddress = new Select(driver.findElement(By.xpath(OR.getProperty("CountryAddress"))));
		CountryAddress.selectByValue("224");
		driver.findElement(By.xpath(OR.getProperty("ContactNumber"))).sendKeys(Number);
		driver.findElement(By.xpath(OR.getProperty("SubmitContactNumber"))).click();
		log.info("Contact Added Successfully");
		driver.findElement(By.xpath(OR.getProperty("Logoutbtn"))).click();

	}

	@DataProvider
	public Object[][] getdata() {
		String SheetName = "AddressBook";
		int rows = excel.getRowCount(SheetName);
		int cols = excel.getColumnCount(SheetName);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			for (int colNum = 0; colNum < cols; colNum++) {

				data[rowNum - 2][colNum] = excel.getCellData(SheetName, colNum, rowNum);

			}

		}

		return data;

	}

	/*@Test(priority = 3)
	public void OSContactSearch() throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("OSContactSearchA"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSContactSearchK"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("SearchContactName"))).sendKeys("Jamesr");
		driver.findElement(By.xpath(OR.getProperty("Searchbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("SearchContactName"))).clear();
		driver.findElement(By.xpath(OR.getProperty("Searchbutton"))).click();

	}
*/
	/*
	 * @Test (priority = 5) public void SMSGroup() {
	 * driver.findElement(By.xpath(OR.getProperty(""))).click();
	 * driver.findElement(By.xpath(OR.getProperty(""))).click();
	 * driver.findElement(By.xpath(OR.getProperty(""))).click();
	 * driver.findElement(By.xpath(OR.getProperty(""))).click();
	 * driver.findElement(By.xpath(OR.getProperty(""))).click();
	 * 
	 * }
	 */
}
