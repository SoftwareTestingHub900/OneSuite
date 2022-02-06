package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class Support extends TestBase {

	/*@Test(priority = 1)
	public void Login() {
		driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Maryann");
		driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("Usman12345!@#");
		driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();

	}
*/
	 @Test(priority = 10)
	//@Test(priority = 2)
	public void SupportManagement() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("SupportMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("OpenTicket"))).click();
		Select Ticket = new Select(driver.findElement(By.xpath(OR.getProperty("Ticket"))));
		Ticket.selectByValue("5");
		Thread.sleep(3000);
		Select Priority = new Select(driver.findElement(By.xpath(OR.getProperty("Priority"))));
		Priority.selectByValue("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("TicketTitle"))).sendKeys("Call Issue");
		driver.findElement(By.xpath(OR.getProperty("Descripstion"))).sendKeys("I am facing Call issues");
		driver.findElement(By.xpath(OR.getProperty("Generatebtn"))).click();
		log.info("ticket Generated Succesfully");

	}
}
