package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class HandlingFrames extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		

		setUp();
		
		Thread.sleep(1000);
		
		
		//1st way, switching by index
		//driver.switchTo().frame(0);
		
		//2nd way, switching by Id or Name
		//driver.switchTo().frame("mce_0_ifr");
		
		//3rd way, switching by WebElemnt
		WebElement frame = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame);
		
		
		WebElement frameElement = driver.findElement(By.xpath("//body[@id='tinymce']"));
		
		frameElement.clear();
		Thread.sleep(1000);
		
		frameElement.sendKeys("Fenerbahce will win next time");
		Thread.sleep(2000);
		
		//This will thrown an exception NoSuchElementException
		//because the focus is inside the frame
		//but the element is outside of the frame
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		
		//We have to switch the focus to the main page
		driver.switchTo().defaultContent();
		
		
		
		
		tearDown();
	}

}
