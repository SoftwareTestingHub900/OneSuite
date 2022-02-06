package OneSuiteWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class OnesuiteWebMenus extends TestBase {

	@Test
	public void webmenus() throws InterruptedException {

		driver.navigate().to("http://osweb2.inovedia.com/");
		driver.findElement(By.xpath(OR.getProperty("Home"))).click();
		driver.findElement(By.xpath(OR.getProperty("OS2.0VOIP"))).click();
		driver.findElement(By.xpath(OR.getProperty("InternetFax"))).click();
		WebElement menu = driver.findElement(By.xpath(OR.getProperty("CallForwarding")));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		driver.findElement(By.xpath(OR.getProperty("Tollfreecallforwarding"))).click();
		driver.findElement(By.xpath(OR.getProperty("Onesuite1.0"))).click();
		
	}

}
