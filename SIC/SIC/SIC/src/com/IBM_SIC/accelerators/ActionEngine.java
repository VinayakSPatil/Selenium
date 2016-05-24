/**
 * 
 */
package com.IBM_SIC.accelerators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Rohit Khare
 *
 */

/*
Script Name: ActionEngine.java
Description: This package code is used to manage the browser, 
			 platform and configuring browser capabilities. 
             Also configures customize HTML test report attributes.
Created By and Date: Rohit Khare / 19th May 2016
Change Description:
Change By and Date:
Dependency Check:
 */
public class ActionEngine{

	/* Check for element is present in screen or not.*/
	public static boolean isElementPresent(WebDriver driver, By object) 
	{
		try
		{
			driver.findElement(object);
		}
		catch(Throwable t)
		{
			System.err.println("Element not Found -->"+t.getMessage());
			return false;
		}
		return true;
	}

	/*Return the By class object based on the locator identification    */
	
	/* 
	 * 
	 * */
	public static By getLocator(String value)
	{
		System.out.println(value);
		String sValue = value.split(":")[1];
		System.out.println(sValue);
		System.out.println(value.split(":")[0]);
		switch(value.split(":")[0])
		{
		case "xpath": 
			return By.xpath(sValue);
		case "id":
			return By.id(sValue);
		case "name":
			return By.name(sValue);
		case "className":
			return By.className(sValue);
		case "linkText":
			return By.linkText(sValue);
		}
		return null;
	}
	
	
	
	
}
