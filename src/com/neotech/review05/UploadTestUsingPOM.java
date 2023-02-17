package com.neotech.review05;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class UploadTestUsingPOM extends CommonMethods{
	public static void main(String[] args) {
		// http://uitestpractice.com/Students/Widgets

		setUp();

		WidgetsPageElements wigdets = new WidgetsPageElements();

		String filePath = "/Users/elionlimanaj/Downloads/Ensar.png";

		wigdets.filePathInput.sendKeys(filePath);
		// sendText(wigdets.filePathInput, filePath);
		wait(2);

		wigdets.upload.click();
		// click(wigdets.upload);

		String expectedText = "File Successfully Uploaded";

		waitForVisibility(wigdets.contactDiv);

		String actualText = wigdets.contactDiv.getText();

		String destinationPath = "screenshots";
		if (actualText.equals(expectedText)) { // We are verifying
			destinationPath += "/passed/Betim.png";
		} else {
			destinationPath += "/failed/Lusha.png";
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(destinationPath);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			System.out.println("Couldn't save the screenshot!!!");
			e.printStackTrace();
		}

		tearDown();

	}
}
