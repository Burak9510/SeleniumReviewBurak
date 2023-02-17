package com.neotech.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task2 extends BaseClass{

	// Print all the data from the tbody of second table
	//Create the path dynamically
	//Don't print the last column
	public static void main(String[] args) throws InterruptedException {
		//https://the-internet.herokuapp.com/tables	
	setUp();
	
	//I want you to print all the data from the second table
	int rows = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
	int cols = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();
	
	for(int i =1; i <= rows; i++)
	{  //iterating the row
		
		for(int j = 1; j < cols; j++) 
		{  // iterating the column
			
			WebElement el = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]"));
		    System.out.print(el.getText() + " | ");
		}
	System.out.println();
	}
	
	
	Thread.sleep(1000);
	
	
	tearDown();
		
		
		
	}
}
