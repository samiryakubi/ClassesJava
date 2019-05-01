package com.class28;

public class webDriverTest {
public static void main (String [] args) {
	
	
System.out.println("-------------ChromBrowser----------------");

	WebDriver web = new ChromeDriver();
	
	web.openBrowser();
	web.closeBrowser();
	web.maximizeWindow();
	web.maximizeWindow();
	
	
	System.out.println("-------------FireFoxDriver----------------");
		
	WebDriver web1 = new FirefoxDriver();
		
		web1.openBrowser();
		web1.closeBrowser();
		web1.maximizeWindow();
		web1.maximizeWindow();
	
	
 }
}
