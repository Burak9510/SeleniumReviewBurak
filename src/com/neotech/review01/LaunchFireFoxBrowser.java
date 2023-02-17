package com.neotech.review01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    
    String url = "https://www.nytimes.com/games/wordle";
    driver.get(url);
    
	
    Thread.sleep(1000);
    
    String currentUrl = driver.getCurrentUrl();
    
    System.out.println("url -> " + url);
    System.out.println("currentUrl -> " + currentUrl);
    
    if(url.equalsIgnoreCase(currentUrl)) 
    {
    	System.out.println("Url are the same!");
    }else
    {
    	System.out.println("Urls are the different!");
    }
    
    Thread.sleep(1000);
    driver.quit();
    
    
	}

}
