package com.neotech.review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsExample extends CommonMethods{

	public static void main(String[] args) {
		
		//http://uitestpractice.com/Students/Actions
	
    setUp();
    
    wait(2);
    
    WebElement draggable = driver.findElement(By.id("draggable"));
    
    WebElement droppable = driver.findElement(By.id("droppable"));
    
    Actions act = new Actions(driver);
    //act.dragAndDrop(draggable, droppable).perform();
    //Don't forget .perform() at the and
    
    act.clickAndHold(droppable).moveToElement(droppable).pause(1000).release().perform();
    
        // Task
 		// In the table below
 		// Click and hold on number 2
 		// Move to number 7
 		// Move to number 11
 		// Release
 		// See the pattern selected
    
       WebElement two = driver.findElement(By.name("two"));
       WebElement seven = driver.findElement(By.name("seven"));
       WebElement eleven = driver.findElement(By.name("eleven"));
       
       act.clickAndHold(two).pause(1000).moveToElement(seven).pause(1000).moveToElement(eleven).release().perform();
       wait(1);
       
       //Double click
       WebElement dblClick = driver.findElement(By.name("dblClick"));
       
       // Clicking 2 times didn't work
       // dblClick.click();
       // dblClick.click();

       act.doubleClick().perform();
       wait(1);
       
       
    tearDown();
    
		
		
	}

}
