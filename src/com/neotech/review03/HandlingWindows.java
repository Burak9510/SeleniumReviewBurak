package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		String windowID1 = driver.getWindowHandle();
		System.out.println(windowID1);

		driver.findElement(By.xpath("//a[@title='seleniumframework']")).click();
		Thread.sleep(1000);

		System.out.println("-------------------------------");

		// Not able to click.The focus is still on the first page
		driver.findElement(By.linkText("Choosing an Automation Solution")).click();

		// This will return unique IDs in a SET
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowId : allWindows) {
			System.out.println(windowId);

			if (!windowId.equals(windowID1)) {
				driver.switchTo().window(windowId);
			}
		}

		// I am able to click. The focus is on the second page
		driver.findElement(By.linkText("Choosing an Automation Solution")).click();

		Thread.sleep(2000);

		tearDown();

	}

}
