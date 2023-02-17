package com.neotech.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class LoginSIS extends BaseClass {
	//LOgin to SIS Web Application
	//http://sis.neotechacademy.com:9000/Test/

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
        Thread.sleep(1000);
       
	    WebElement username = driver.findElement(By.xpath("//input[@id='tUsername']"));
	    username.sendKeys(ConfigsReader.getProperty("username"));
	    Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='tPassword']")).sendKeys(ConfigsReader.getProperty("password"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='bLogin']")).click();
        Thread.sleep(3000);
        
        tearDown();
		
		
		
	}

}
