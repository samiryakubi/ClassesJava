package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Samir_aziz@live.com");
		driver.findElement(By.name("pass")).sendKeys("Passwordsamjohn");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}
}
