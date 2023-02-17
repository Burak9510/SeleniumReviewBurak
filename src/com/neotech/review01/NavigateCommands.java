package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // which driver, and where is it

		WebDriver driver = new ChromeDriver();
	
	    String url = "https://www.instagram.com/";
	    
	    //driver.get(url);
	    // will wait for page elements to be loaded
	 // will  NOT keep the history
	    
	    driver.navigate().to(url);
	
	    // will  NOT wait for page elements to be loaded
	    // will keep the history
	    
	    Thread.sleep(1000);
	    
	    driver.manage().window().maximize(); // will male full screen
	    
	    Thread.sleep(1000);
	    
	    driver.manage().window().minimize(); // will minimize the screen
	    Thread.sleep(1000);
	    
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    String fakeNews = "https://www.foxnews.com/";
	    driver.navigate().to(fakeNews);
	    Thread.sleep(500);
	    
	    String fifa = "https://www.fifa.com/";
	    driver.navigate().to(fifa);
	    Thread.sleep(1000);
	    
	    driver.navigate().back(); // will bring us back to the second page
	    Thread.sleep(1000);
	    
	    driver.navigate().back(); // will bring us back to the first page	    
	    Thread.sleep(1000);
	    
	    driver.navigate().forward();
	    Thread.sleep(1000);
	
	    driver.navigate().refresh();
	    Thread.sleep(1000);
	
	    driver.quit();
	}
}
