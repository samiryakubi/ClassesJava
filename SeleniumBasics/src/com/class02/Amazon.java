package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed")) {
			System.out.println("This is the correct title");
		}else {
			System.out.println("this is not the title");
		}
	}
}
