package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.amazon.com/";
		driver.get(url);
		
//		# (hashtag) means id
//		. (period) means class
		
//		#twotabsearchtextbox -> any element with id = twotabsearchtextbox
//		input#twotabsearchtextbox -> any input with id = twotabsearchtextbox

//		. (period) means class
//		input.naim -> input that has class = naim
		
		WebElement searchText =driver.findElement(By.cssSelector(" input#twotabsearchtextbox"));
		searchText.sendKeys("Mbappe jersey kids");
		Thread.sleep(1000);
		
//		div#division-b > div > a
//		Find the div with id division-b
//		Locate the div child
//		Locate the a grand-child
		
		driver.findElement(By.cssSelector("span#nav-search-submit-text")).click();
		Thread.sleep(3000);
		
		driver.quit();


	}

}
