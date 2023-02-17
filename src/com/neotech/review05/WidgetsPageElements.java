package com.neotech.review05;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class WidgetsPageElements extends BaseClass{

	// Without Page Factory
		// public WebElement filePathInput = driver.findElement(By.id("image_file"));

		// With Page Factory
		@FindBy(id = "image_file")
		public WebElement filePathInput;

		@FindBy(xpath = "//div[@id='fileinfo']/preceding-sibling::div[1]/input")
		public WebElement upload;

		@FindBy(css = "div.ContactUs")
		public WebElement contactDiv;

		public WidgetsPageElements() {
			PageFactory.initElements(driver, this);
		}
}
