package com.onesuite.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.onesuite.utilities.ExcelReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream Fis;
	public static Logger log = Logger.getLogger(TestBase.class.getName());
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\OnesuiteTestData.xlsx");
	


	@BeforeSuite
	public void Setup() {
	
		PropertyConfigurator.configure("./src/test/resources/Properties/log4j.properties");
		if (driver == null) {
	
			try {
				Fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(Fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// For OR properties file
			try {
				OR.load(Fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			if (config.getProperty("browser").equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
	
			} else if (config.getProperty("browser").equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
	
			} else if (config.getProperty("browser").equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
	
			}
	
			driver.get(config.getProperty("SiteUrl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			log.info("Navigated to the Site URL");
			
	
		}
	}

	public boolean isElementPresent(By by) {

		try {
			driver.findElement(by);
			return true;

		} catch (NoSuchElementException e) {

			return false;

		}

	}
	// @AfterSuite
//	public void Teardown() {

	// if (driver !=null) {
	// driver.quit();
	// }
//	}
//
}
