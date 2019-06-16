package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
				
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.walmart.com");
		Thread.sleep(3000);
		driver.navigate().to("hhttp://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();
	}
}
