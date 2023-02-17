package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class CalendarHandling  extends CommonMethods{
	
	// Go to this link: https://jqueryui.com/
	// Click on Datepicker from the left menu
	// Show the Calendar
	// Select 10/14/2023 from the Calendar
	// Verify that you have selected 10/14/2023


	public static void main(String[] args) {
		
	setUp();
	
	wait(1);
	//1st way using Selenium click method
	//driver.findElement(By.linkText("Datepicker")).click();
	
	//2nd way, using CommonMethods click() method
	click(driver.findElement(By.linkText("Datepicker")));
	
	//1st way using Selenium switchTo().frame() method
	//driver.switchTo().frame(0);
	
	//2nd way, using CommonMethods switchToFrame() method
	//switchToFrame(0); // using the index
	
	switchToFrame(driver.findElement(By.tagName("iframe")));
	
	driver.findElement(By.id("datepicker")).click();
	wait(1);
	
	String expectedMonthYear = "October 2023";
	
	while(true) {
		WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String monthYearText = monthYear.getText();
		
		if(monthYearText.equals(expectedMonthYear)) {
			break;
		}
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	wait(1);
	
	// Now we need to click on the correct day
	
	String expectedDay = "14";
	List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	
	for(WebElement day : days) {
		if(day.getText().equals(expectedDay)) {
			// I found the correct day
			day.click();
		    break;
		}
	}
	
	wait(2);
	
	// Lets verify that we selected the correct date -> 10/14/2023
	String expectedDate = "10/14/2023";
	WebElement dateTextBox = driver.findElement(By.id("datepicker"));
	
	if(dateTextBox.getAttribute("value").equals(expectedDate)) {
		System.out.println("Test Passed");
	}else {
		System.out.println("Test Failed");
	}
	
	tearDown();

	// Extra practice
			// Go to this link:
			// https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html

			// Select 22/01/2022 in the first Calendar

			// Select a range of dates in the -> Date Range Example :
	
	
	
	
	
	}

}
