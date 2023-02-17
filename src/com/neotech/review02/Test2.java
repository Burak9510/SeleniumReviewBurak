package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Test2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	    
		//Preparing for our test
		setUp();
	
	    // Do our test
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='tUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='tPassword']")).sendKeys("Neotech$123");
        driver.findElement(By.xpath("//input[@id='bLogin']")).click();
        Thread.sleep(2000);
		
		//Clear up everything
		tearDown();
	
	
	
	}
}
