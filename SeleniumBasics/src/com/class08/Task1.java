package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUpDriver("chrome", "https://www.toolsqa.com");
		
		WebElement menu = driver.findElement(By.xpath("xpathExpression"));
	}

}
