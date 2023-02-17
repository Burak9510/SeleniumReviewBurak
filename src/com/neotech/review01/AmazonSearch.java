package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		driver.get(url);
		
		// There are 8 locaters to find the elements in the DOM
		//id, name, classname, linkText, partialLinkText, tagName, xPath, cssSelector

	   WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	   searchText.sendKeys("Messi jersey");
	   Thread.sleep(1000);
	   
	   WebElement searchButton = driver.findElement(By.xpath(" //input[@id='nav-search-submit-button']"));
	   searchButton.click();
	   Thread.sleep(3000);
	   
	    // one forward slash means direct child
		// //div[@id='division-b']/div/a

		// two forward slashes means direct or indirect child
		// //div[@id='division-b']//a
	   
	   
	   driver.quit();
	   
	
	
			 //input[@id='nav-search-submit-button']
	}

}
