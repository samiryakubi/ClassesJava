package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/samaziz/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://syntaxtechs.com");
		driver.navigate().to("hhttp://google.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
