package com.IBM_SIC.accelerators;

import java.util.Set;

/**
Script Name: BrowserAction.java
Description: This package code is used to manage the browser action
Created By and Date: Rohit Khare / 19th May 2016
Change Description:
Change By and Date:
Dependency Check:
 */
public class BrowserAction extends TestEngine{

	/**
	 * Method Name : getTitle
	 * Description : return the title text of the page
	 * @param : driver
	 */
	public String getTitle()
	{
		try
		{
			return driver.getTitle();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}
		return null;

	}
	/**
	 * Method Name : getCurrentURL
	 * Description : return the current URL of the page
	 * @param : driver
	 */
	public String getCurrentURL() throws Exception
	{
		try
		{
			return driver.getCurrentUrl();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}
		return null;
	}
	/**
	 * Method Name : getPageSource
	 * Description : return the Page Source.
	 * @param : driver
	 */
	public String getPageSource() throws Exception
	{
		try
		{
			return driver.getPageSource();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}
		return null;
	}
	/**
	 * Method Name : close
	 * Description : close the browser
	 * @param : driver
	 */
	public void close() throws Exception
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}

	}
	/**
	 * Method Name : quit
	 * Description : quit the browser and end the driver variable
	 * @param : driver
	 */
	public void quit() throws Exception
	{
		try
		{
			driver.quit();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}

	}
	/**
	 * Method Name : refresh
	 * Description : refresh the page
	 * @param : driver
	 */
	public void refresh() throws Exception
	{
		try
		{
			driver.navigate().forward();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}

	}
	/**
	 * Method Name : back
	 * Discription : navigate to back page
	 * @param : driver
	 */
	public void back() throws Exception
	{
		try
		{
			driver.navigate().back();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}

	}
	/**
	 * Method Name : forward
	 * Discription : navigate to next page
	 * @param : driver
	 */
	public void forward() throws Exception
	{
		try
		{
			driver.navigate().forward();
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}

	}
	/**
	 * Method Name : navigateTo
	 * Description : navigate to the URL
	 * @param : driver
	 */
	public void navigateTo(String URL) throws Exception
	{
		try
		{
			driver.navigate().to(URL);
		}
		catch(Exception e)
		{
			System.err.println("Error -->"+e.getMessage());
		}

	}
	/**
	 * Method Name : getWindowHandle
	 * Description : Switch between old window to the new window.Handling multiple window
	 * @param : driver
	 * @param : title
	 */
	public void getWindowHandle(String title) 
	{
		Set<String> handles = driver.getWindowHandles();
		String[] browser =	handles.toArray(new String[0]);
		System.out.println("Number of broiwsers opened are" + browser.length);
		for (int i=0; i<handles.size();i++) 
		{
			driver.switchTo().window(browser[i]);
			if(driver.getTitle().equals(title))
			{
				driver.getWindowHandle();

			}
		}

	} 






}
