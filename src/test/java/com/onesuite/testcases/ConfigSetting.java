package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class ConfigSetting extends TestBase {

	@Test(priority = 1)
	public void login() throws InterruptedException {

		driver.navigate().to("http://osadmin2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("AdminUsername"))).sendKeys("osadmin");
		driver.findElement(By.xpath(OR.getProperty("AdminPAssword"))).sendKeys("onesuite");
		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn"))).click();

	}

	// Added SMS Service with PortIn
	@Test(priority = 2)
	public void AddCongiguration1() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("OSNumbers"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added SMS Service with PortOut
	@Test(priority = 3)
	public void AddConfiguration2() throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

// Added SMS Service with PortOut/PortIn
	@Test(priority = 4)
	public void AddConfiguration3() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added VOICE Service with PortIn
	@Test(priority = 5)
	public void AddConfiguration4() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added VOICE Service with PortOut
	@Test(priority = 6)
	public void AddConfiguration5() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added VOICE Service with PortOut/PortIn
	@Test(priority = 7)
	public void AddConfiguration6() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added Fax Service with PortIn
	@Test(priority = 8)
	public void AddConfiguration7() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added FAx Service with PortOut
	@Test(priority = 9)
	public void AddConfiguration8() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added Fax Service with PortIn/PortOut
	@Test(priority = 10)
	public void AddConfiguration9() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}
	

	// Added SMS with VOICE Service with PortIn
	@Test(priority = 11)
	public void AddCongiguration10() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("OSNumbers"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("1");
		ServiveType.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

	// Added SMS with Fax Service with PortOut
	@Test(priority = 12)
	public void AddConfiguration11() throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("1");
		ServiveType.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}

// Added VOICE with FAX  Service with PortOut/PortIn
	@Test(priority = 13)
	public void AddConfiguration12() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
		Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
		ServiveType.selectByValue("2");
		ServiveType.selectByValue("4");
		driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
		Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
		OSNumberCountries.selectByValue("1");
		driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
		// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
		Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
		Porting.selectByValue("1");
		Porting.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

	}
	// Added VOICE with FAX  Service with PortOut/PortIn with multiple selected countries
		@Test(priority = 14)
		public void AddConfiguration13() throws InterruptedException {
			driver.findElement(By.xpath(OR.getProperty("AddNewConfigurationbtn"))).click();
			driver.findElement(By.xpath(OR.getProperty("ServiceTypebtn"))).click();
			Select ServiveType = new Select(driver.findElement(By.xpath(OR.getProperty("SelectServicetype"))));
			ServiveType.selectByValue("2");
			ServiveType.selectByValue("4");
			driver.findElement(By.xpath(OR.getProperty("OSNumberCountriesbtn"))).click();
			Select OSNumberCountries = new Select(driver.findElement(By.xpath(OR.getProperty("SelectOSNumberCountries"))));
			OSNumberCountries.selectByValue("1");
			OSNumberCountries.selectByValue("2");
			OSNumberCountries.selectByValue("3");
			OSNumberCountries.selectByValue("4");
			OSNumberCountries.selectByValue("4");
			OSNumberCountries.selectByValue("6");
			OSNumberCountries.selectByValue("6");
			OSNumberCountries.selectByValue("8");
			OSNumberCountries.selectByValue("9");
			OSNumberCountries.selectByValue("10");
			OSNumberCountries.selectByValue("11");
			OSNumberCountries.selectByValue("12");
			OSNumberCountries.selectByValue("13");
			OSNumberCountries.selectByValue("14");
			OSNumberCountries.selectByValue("15");
			driver.findElement(By.xpath(OR.getProperty("OSNumberPorting"))).click();
			// driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))).click();
			Select Porting = new Select(driver.findElement(By.xpath(OR.getProperty("SelectPorting1"))));
			Porting.selectByValue("1");
			Porting.selectByValue("2");
			driver.findElement(By.xpath(OR.getProperty("ConfigSavebtn"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(OR.getProperty("Configurationaddedbtn"))).click();

		}
}