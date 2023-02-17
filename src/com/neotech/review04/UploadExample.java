package com.neotech.review04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class UploadExample extends CommonMethods{
	
	public static void main(String[] args) {
		
    // http://uitestpractice.com/Students/Widgets	
		
	setUp();
	
	wait(1);
	
	tearDown();
	
	String imagePath = System.getProperty("user.dir") + "/screenshots/Form.png";

	driver.findElement(By.id("image_file")).sendKeys(imagePath);

	driver.findElement(By.xpath("//input[@value='Upload']")).click();
	
	// Let's wait for div with class ContactUs to be visible
	waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));

	String expectedMessage = "File Successfully Uploaded";
	String actualMessage = driver.findElement(By.id("upload_response")).getText();

	String destinationPath = "screenshots";
	if (actualMessage.contains(expectedMessage)) {
		destinationPath += "/passed/upload.png";
	} else {
		destinationPath += "/failed/upload.png";
	}

	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(destinationPath);

	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}

	tearDown();
	
	
	
	
		
	}
	

}
