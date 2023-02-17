package com.neotech.review05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDownExample {

	final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//You can specify the version of Chrome Browser you want to use
		//options.getBrowserVersion()
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
	
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("burak3495@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("05057531877");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Burak Ingin']")).click();	
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i = 1; i<=15; i++) {
		js.executeScript("window.scrollBy(0, 200)");
		Thread.sleep(500);
		}
		driver.quit();
	}
}
