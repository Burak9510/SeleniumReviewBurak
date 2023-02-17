package com.neotech.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {
	// https://nxtgenaiacademy.com/alertandpopup/
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(2000);
	   // When alert is open, you cannot interact main page
	   driver.findElement(By.name("confirmalertbox")).click();
	   Alert confirmAlert = driver.switchTo().alert();
	   Thread.sleep(1000);
	   
	   System.out.println("The confirm alert text is -> " + confirmAlert.getText());
	   
	   //confirmAlert.dismiss();
	   confirmAlert.accept();
	   Thread.sleep(3000);
	   
	   // After accept/dismiss, we can interact with the main page 
	   driver.findElement(By.name("promptalertbox1234")).click();
	   
	   Alert promptAlert = driver.switchTo().alert();
	   Thread.sleep(1000);
	   
	   promptAlert.sendKeys("Yes");
	   promptAlert.accept();
		
	    tearDown();
	    
	    
	
	
	
	}
}
