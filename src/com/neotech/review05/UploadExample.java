package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class UploadExample extends CommonMethods{

	public static void main(String[] args) {
//		http://uitestpractice.com/Students/Widgets
		
		setUp();
		
		String filePath = "C:\\Users\\burak\\OneDrive\\Pictures\\Saved Pictures";
		
		WebElement filePathInput = driver.findElement(By.id("image_file"));
		filePathInput.sendKeys(filePath);
		wait(2);

		WebElement upload = driver.findElement(By.xpath("//div[@id='fileinfo']/preceding-sibling::div[1]/input"));
		upload.click();
		wait(2);

		String expectedText = "File Successfully Uploaded";

		waitForVisibility(driver.findElement(By.cssSelector("div.ContactUs")));
		String actualText = driver.findElement(By.cssSelector("div.ContactUs")).getText();

		String destinationPath = "screenshots";
		if (actualText.contains(expectedText)) {
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

		wait(3);
		
		tearDown();

	}

}
