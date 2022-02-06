package com.onesuite.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.onesuite.base.TestBase;

public class Countrieslist extends TestBase {

	public static void main(String[] args) {
		List<WebElement> Countries = driver.findElements(By.tagName("option"));
		
        System.out.println();
	}

}
