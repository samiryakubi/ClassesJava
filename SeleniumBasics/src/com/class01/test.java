package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.get("http://www.amazon.com");
		driver.get("http://facebook.com");
		
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://google.com");
		
	}
}
