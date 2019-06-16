package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

	/*
	 * Task Three
	 *Ahead to http://uitestpractice.com/Students/Index
	 *Click on the Actions
	 *Click and hold on 1,2,3,4 boxes
	 *Close the browser
	 */
public class DragAndDropTask5 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		setUpDriver("chrome", "http://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
