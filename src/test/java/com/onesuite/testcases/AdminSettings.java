package com.onesuite.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class AdminSettings extends TestBase {

	@Test(priority = 1)
	public void Roles() throws InterruptedException {
		driver.navigate().to("http://osadmin2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("AdminUsername"))).sendKeys("osadmin");
		driver.findElement(By.xpath(OR.getProperty("AdminPAssword"))).sendKeys("onesuite");
		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SettingsMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("Roleslink"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddRole"))).click();
		driver.findElement(By.xpath(OR.getProperty("RoleName"))).sendKeys("HTML5  Role");
		driver.findElement(By.xpath(OR.getProperty("RoleDescription"))).sendKeys("Its a HTML5 Roles");
		driver.findElement(By.xpath(OR.getProperty("RoleSavebtn"))).click();

	}

	@Test(priority = 2)
	public void scrollpage() {

		((JavascriptExecutor) driver).executeScript("scroll(0,300)");

	}

	@Test(priority = 3)
	public void Departments() throws InterruptedException {

		driver.findElement(By.xpath(OR.getProperty("Departmentlink"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddAdminDepartment"))).click();
		driver.findElement(By.xpath(OR.getProperty("AdminDepartmentTitle"))).sendKeys("Dev Software Department");
		driver.findElement(By.xpath(OR.getProperty("Departmentdescripstion"))).sendKeys("Its a Dev Software Department");
		driver.findElement(By.xpath(OR.getProperty("DepartmentSavebtn"))).click();

	}

	@Test (priority = 4)
    public void Incedent() { 
		
		driver.findElement(By.xpath(OR.getProperty("IncidentMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddticketType"))).click();
		Select TicketType = new Select (driver.findElement(By.xpath(OR.getProperty("AdminTicketTypes"))));
		TicketType.selectByValue("2");
		driver.findElement(By.xpath(OR.getProperty("AdminTicketName"))).sendKeys("Call Planing issues");
		driver.findElement(By.xpath(OR.getProperty("LowPriority"))).click();
		driver.findElement(By.xpath(OR.getProperty("MediumPriority"))).click();
		driver.findElement(By.xpath(OR.getProperty("HighPriority"))).click();
		driver.findElement(By.xpath(OR.getProperty("TicketSavebtn"))).click();
		
		
		
		
		
		
		
}
}