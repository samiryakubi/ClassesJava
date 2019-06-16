package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task2 extends CommonMethods{
	/*
	 * TC 1: Table headers and rows verification
	 * 
	 * Open chrome browser Go to
	 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
	 * aspx” Login to the application Verify customer “Susan McLaren” is present in
	 * the table Click on customer details Update customers last name Verify updated
	 * customers name is displayed in table Close browser
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";
		setUpDriver("chrome", url);
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		List<WebElement>row=driver.findElements(By.xpath("//table[contains(@id,'ctl00_MainContent')]/tbody/tr"));
        System.out.println(row.size());
        List<WebElement>col=driver.findElements(By.xpath("//table[contains(@id,'ctl00_MainContent')]/tbody/tr[1]/th"));
        System.out.println(col.size());
        
        String name="Susan McLaren ";
        for(int i=1;i<=row.size();i++) {
            String text=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]")).getText();
            if(text.contains(name)) {
                System.out.println("Present");
            }
        }
       
        driver.close();
	}
}
