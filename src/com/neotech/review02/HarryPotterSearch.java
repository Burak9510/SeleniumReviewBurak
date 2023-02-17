package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HarryPotterSearch extends BaseClass{
	
	//Go to https://www.amazon.com/
	//select books from the search dropdown
	//type Harry potter
	//and click on Search
	//check "Kindle Unlimited Eligible" checkbox on the left
	
	public static void main(String[] args) throws InterruptedException {
		
	
	setUp();
	
	Thread.sleep(1000);
	
	WebElement searchDDElement = driver.findElement(By.id("searchDropdownBox"));
	Select selectDD = new Select(searchDDElement);
	
//	Print all the option of the drop-down
//	List<WebElement> optionList = selectDD.getOptions();
//	for(WebElement option : optionList)
//	{   System.out.println(option.getText());
//		
//	}
	
	// 3 different ways to select one drop-down options
//	selectDD.selectByIndex(4);
//	selectDD.selectByValue("search-alias=electronics");
	selectDD.selectByVisibleText("Books");
	Thread.sleep(1000);
	
	WebElement searchTxt =driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//	searchTxt.sendKeys("Serkan");
//	searchTxt.clear();
//	searchTxt.sendKeys("Akdagli");
	
	searchTxt.clear();
	searchTxt.sendKeys("Harry Potter");
	Thread.sleep(1000);
	
	WebElement searchBtn = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input"));
	searchBtn.submit();
	Thread.sleep(1000);
	
	// findElement vs findElements
	// findElement returns the first WebElement with that xPath
	// findElements returns all the WebElements with that xPath inside a List
	
	List<WebElement> elementList = driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
	
	System.out.println("There are -> " + elementList.size() + "<- elements with that xPath");
	
	// This exception is a nightmare -> StaleElementReferenceException
    // Happens when we click, and don't break the loop
	for(WebElement el : elementList)
	{
	  String elementText = el.getText();
	  if(elementText.equals("Kindle Unlimited Eligible")) 
	  {   el.click();
		  break;
	  }
	}
	
	
	Thread.sleep(3000);
	
	tearDown();
	
	
	
	
	
	}
}
