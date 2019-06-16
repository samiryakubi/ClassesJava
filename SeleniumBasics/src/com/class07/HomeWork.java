package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class HomeWork extends CommonMethods {
	/*
	 * TC 1: ToolsQA Windows verificationOpen chrome browserGo to
	 * “https://the-internet.herokuapp.com/”Click on “Multiple Windows” linkClick on
	 * “Elemental Selenium”Verify title of second window is “Elemental Selenium:
	 * Receive a Free, Weekly Tip on Using Selenium like a Pro”Close second
	 * windowClick on “Click Here” linkVerify title if newly open window is “New
	 * Window”Close second windowVerify title of second window is “The Internet”Quit
	 * browserNOTE: Selenium execution could be too fast, please use Thread.sleep
	 */
	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome","http://the-internet.herokuapp.com/windows/new");
		String parent =driver.getTitle();
		String parentId= driver.getWindowHandle();
		System.out.println("title: "+parent+" "+" ID: "+parentId);
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		parent=it.next();
		String child= it.next();
		driver.switchTo().window(child);
		child=driver.getTitle();
		String childId= driver.getWindowHandle();
		System.out.println("title: "+child+" "+" ID: "+childId);
		driver.switchTo().window(parent);

	}

}
