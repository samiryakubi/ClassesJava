package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	/*
	 * TC 1: Swag Lab Title and Login Verification
	 * 
	 * @BeforeMethod should contain navigation to the URL and title verification
	 * 
	 * @Test should contain steps to login and “Product” word verification
	 * 
	 * @AfterMethod should logOut from the application and close the browser
	 */
	@BeforeMethod
	public void setUP(){
		 setUpDriver("chrome", "https://www.saucedemo.com/index.html");	
	}

	@Test
	public void login() throws InterruptedException {
		sendText(driver.findElement(By.cssSelector("input#user-name")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement Product=driver.findElement(By.cssSelector("div.product_label"));
		boolean productText=Product.isDisplayed();
		String ExpectedText="Product";
		if(productText =true) {
		}
	}
	
	@AfterMethod
	public void close() {
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout_sidebar_link\"]")));
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		driver.close();
	}
}
	

