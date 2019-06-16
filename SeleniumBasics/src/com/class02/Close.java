package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Facebook.com");	
	}
}
