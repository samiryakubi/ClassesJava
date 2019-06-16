package GroupTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	/*
	 * 1.Open chrome browser 2.Go to “http://uitestpractice.com/” 3.Click on “Forms
	 * link 4.Fill out the entire form5.Close the browser
	 */
	public static void main(String[] args) throws InterruptedException {

		String url = "http://uitestpractice.com/";
		CommonMethods.setUpDriver("chrome", url);

		jsClick(driver.findElement(By.xpath("//a[text()='Form']")));
		sendText(driver.findElement(By.cssSelector("input#firstname")), "Zaheer");
		sendText(driver.findElement(By.cssSelector("input#lastname")), "Haidari");

		radioButtonText(driver.findElements(By.cssSelector("label.radio-inline")), "Married");
		checkBoxClick(driver.findElements(By.cssSelector("label.checkbox-inline")), "Cricket");
		selectValueFromDD(driver.findElement(By.cssSelector("select#sel1")), "Afghanistan");

		jsClick(driver.findElement(By.cssSelector("input#datepicker")));
		month(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")), "Aug");
		year(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")), "1988");
		day(driver.findElements(By.xpath("//td[@data-handler='selectDay']")), "20");

		sendText(driver.findElement(By.cssSelector("input#phonenumber")), "555555888");
		sendText(driver.findElement(By.cssSelector("input#username")), "zaheerhaidari");
		sendText(driver.findElement(By.cssSelector("input#email")), "haidari.zaheer@gmail.com");
		sendText(driver.findElement(By.cssSelector("textarea#comment")), "I am an automation test engineer");
		sendText(driver.findElement(By.cssSelector("input#pwd")), "Kbl12345");
		jsClick(driver.findElement(By.cssSelector("button[type='submit']")));

		driver.close();
	}

	private static void day(List<WebElement> findElements, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void year(WebElement findElement, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void month(WebElement findElement, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void checkBoxClick(List<WebElement> findElements, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void radioButtonText(List<WebElement> findElements, String string) {
		// TODO Auto-generated method stub
		
	}

}