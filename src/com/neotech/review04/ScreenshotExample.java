package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class ScreenshotExample extends CommonMethods{

	public static void main(String[] args) {
		// https://www.facebook.com/
		
		setUp();
	
		wait(1);
		
		//Taking the screenshot of the whole page
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/FacebookLogin.png");
		
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot");
			e.printStackTrace();
		}
		
	    // Taking the screenshot of a WebElement [form]
		WebElement form = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		TakesScreenshot ts2 = (TakesScreenshot) form;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("screenshots/Form.png");
		
		try {
			FileUtils.copyFile(source2, destination2);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot");
			e.printStackTrace();
		}
		wait(1);
		
		
		//For fun: You can try to take the screenshot of other elements
		
		tearDown();

	}

}
