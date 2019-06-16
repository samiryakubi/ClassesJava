package com.class08;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

/*
 * // Task for contextClick
//		 Navigate to https://www.saucedemo.com
//			 Right click on the password textbox 
//			 Close the browser 
 */
public class TaskRightClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("Chrome", "https://www.saucedemo.com");
		
		WebElement rightClick= driver.findElement(By.cssSelector("input#password"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		Thread.sleep(5000);
		driver.close();

	}

}
