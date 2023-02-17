package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		//https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html
		setUp();
		
	    //Implicit wait
		//Always done RIGHT after driver creation 
		//Valid throughout the driver lifetime
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("downloadButton")).click();
		
		Thread.sleep(1000);
		
		
		
		//driver.findElement(By.xpath("//div[text()='Complete!']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("div[text()='Complete!'")));
		
		//Wait until the webElement is visible
		//Wait for a maximum of 25 seconds
		
		
		WebElement label = driver.findElement(By.xpath("div[text()='Complete!'"));
		System.out.println(label.getText());
		
		tearDown();
		
		
		

	}

}
