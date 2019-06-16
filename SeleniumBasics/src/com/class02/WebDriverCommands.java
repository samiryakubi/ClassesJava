package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverCommands {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("This is the correct title");
		}else {
			System.out.println("this is not the title");
		}
		driver.get("http://www.Facebook.com");
		System.out.println(driver.getTitle());
		String title1 = driver.getTitle();
		if(title.equalsIgnoreCase("Facebook.com")) {
			System.out.println("This is the correct title");
		}else {
			System.out.println("this is not the title");
		}
	}
}
