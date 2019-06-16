package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) throws InterruptedException {
		/*
		 *  TC 2: Mercury Tours Registration:
			Open chrome browser
			Go to “http://newtours.demoaut.com/”
			Click on Register Link
			Fill out all required info
			Click Submit
			User successfully registered
			(Create 2 scripts using different locators)
		 */

		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Johny");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("mike");
		Thread.sleep(3000);
		driver.findElement(By.name("phone")).sendKeys("1234567878");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("samir_aziz@live.com");
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("123 w tempe str ");
		Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("chandler");
		Thread.sleep(3000);
		driver.findElement(By.name("state")).sendKeys("Az");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("85282");
		Thread.sleep(3000);
		driver.findElement(By.name("country")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("johnymike123");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("123mikeyy");
		Thread.sleep(3000);
		driver.findElement(By.name("confirmPassword")).sendKeys("123mikeyy");
		Thread.sleep(3000);
		driver.findElement(By.name("register")).click();
		Thread.sleep(3000);
		
		
	}

}
