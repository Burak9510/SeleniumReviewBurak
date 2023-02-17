package com.neotech.review03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebTablePractice extends BaseClass  {

	
	public static void main(String[] args) throws InterruptedException {
		
//		http://testingpool.com/data-types-in-java/

	    setUp();
	    //Find the number of rows 
	    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
	    int size = rows.size();
	    System.out.println("The number of rows is -> " + rows.size());
	    
	    //Find the number of columns in the first rows
	    List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	    int colSize = cols.size();
	    System.out.println("The number of columns is -> " + cols.size());
	    
	    //Find the number of all cells in the table 
	    List<WebElement> cells = driver.findElements(By.xpath("//table/tbody/tr/td"));
	    System.out.println("The number of cell is -> " + cells.size());
	    
	    System.out.println("----------------------------------");
	    
	    // If I want to print the header of the table
	    
	    // 1st way -> Static way, getting the data from the first row
	    List<WebElement> headerList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	    for (WebElement el : headerList)
	    {    
	    	System.out.print(el.getText() + " | ");
	    	el.getText();
	    }
	    System.out.println();
	    
	    System.out.println("----------------------------------");
 
	 // 2nd way -> Dynamic way, getting the data from the first row
	    
	    for(int i = 1; i <= cols.size(); i++)
	    {
	    	String path = "//table/tbody/tr[1]/td[" + i + "]";
//	        System.out.println(path);
	    	

			WebElement cell = driver.findElement(By.xpath(path));
			System.out.print(cell.getText() + " | ");
	    	
	    }   
	    System.out.println();
	    
	    System.out.println("----------------------------------");
	    System.out.println("Let us print all the cells of all the rows");
	    System.out.println("----------------------------------");
	    
	    for (int row = 1; row <= rows.size(); row++) { // iterating the rows

			for (int col = 1; col <= cols.size(); col++) { // iterating the columns
				// String path = "//table/tbody/tr[" + row + "]/td[" + col + "]";
				// System.out.println(path);

				WebElement element = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
				System.out.println(element.getText());
			}

			System.out.println();
		}
	    
	    
	    
	    tearDown();
	    
	    
	    
		
		
	}
}
