package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class Rough extends TestBase {
	
	@Test (priority = 1)
	public void roughtest() {
		driver.navigate().to("http://osadmin2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("AdminUsername"))).sendKeys("osadmin");
		driver.findElement(By.xpath(OR.getProperty("AdminPAssword"))).sendKeys("onesuite");
		driver.findElement(By.xpath(OR.getProperty("AdminLoginbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SettingsMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("Roleslink"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddRole"))).click();
		driver.findElement(By.xpath(OR.getProperty("RoleName"))).sendKeys("Auotmation QA  Role");
		driver.findElement(By.xpath(OR.getProperty("RoleDescription"))).sendKeys("Its a Auotmation QA Roles");
		driver.findElement(By.xpath(OR.getProperty("RoleSavebtn"))).click();
		
	}
		
		
		@Test (priority = 2)
		public void Department() {
		driver.findElement(By.xpath(OR.getProperty("Departmentlink"))).click();

	}

}
