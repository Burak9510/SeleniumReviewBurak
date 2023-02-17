package com.neotech.review03;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class HandlingAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//http://www.seleniumframework.com/Practiceform/

		setUp();
		
		WebElement alertBtn = driver.findElement(By.id("alert"));
		alertBtn.click();
	    Thread.sleep(1000);
	    
	    WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(30));
		   wait.until(ExpectedConditions.alertIsPresent());
	    
	    //Handling the Alert
	    Alert alert = driver.switchTo().alert();
	    String alertText = alert.getText();
        System.out.println("The text of the alert is -> " + alertText);
        alert.accept();
        Thread.sleep(1000);
        
        //Handling Timing Alert
        driver.findElement(By.id("timingAlert")).click();
        
        // This kind of waiting is not good
        // Because I don't want to wait for too long 
        //Thread.sleep(10000);
        
        wait.until(ExpectedConditions.alertIsPresent());
	   
	   alert = driver.switchTo().alert();
	   Thread.sleep(1000);
	   
	   alert.accept();
	   
	   Thread.sleep(1000);
	    
		tearDown();
		
		
		
		
		
	}

}
