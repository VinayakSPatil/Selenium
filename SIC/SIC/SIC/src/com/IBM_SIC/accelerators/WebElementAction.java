package com.IBM_SIC.accelerators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WebElementAction extends TestEngine{
	
	/**
	 * Method Name : clearInputText
	 * Description : Clear the input text field. 
	 * @param driver
	 * @param object
	 * @throws Exception
	 */
	public void clearInputText(By object) throws Exception
	{
		try
		{
			WebElement inputText = driver.findElement(object);
			inputText.clear();
		}
		catch(Exception e)
		{
			throw new Exception("inputText --- >Element Not Present. Error Message -->"+e.getMessage());
		}
	}
	/**
	 * Method Name : InputText
	 * Description : This simulate typing into an element, which may set its value. This method accepts CharSequence as a parameter and returns nothing.
	 * @param driver
	 * @param object
	 * @param sValue
	 * @throws Exception
	 */
	public void InputText(By object,String sValue) throws Exception
	{
		try
		{
			WebElement inputText = driver.findElement(object);
			inputText.sendKeys(sValue);
		}
		catch(Exception e)
		{
			throw new Exception("inputText --- >Element Not Present. Error Message -->"+e.getMessage());
		}
	}
	/**
	 * Method Name : click
	 * Description : This simulates the clicking of any element. Accepts nothing as a parameter and returns nothing.
	 * @param driver
	 * @param object
	 * @throws Exception
	 */
	public void click(By object) throws Exception
	{
		try
		{
			WebElement element = driver.findElement(object);
			element.click();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
	}
	/**
	 * Method Name : isDisplayed
	 * Description : This method determines if an element is currently being displayed or not. This accepts nothing as a parameter but returns boolean value(true/false).
	 * @param driver
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public boolean isDisplayed(By object) throws Exception
	{
		boolean flag = false;
		try
		{
			flag = driver.findElement(object).isDisplayed();
			
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return flag;
	}
	/**
	 * Method Name : isEnabled
	 * Description : This determines if the element currently is Enabled or not? This accepts nothing as a parameter but returns boolean value(true/false).
	 * @param driver
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public boolean isEnabled(By object) throws Exception
	{
		boolean flag = false;
		try
		{
			flag = driver.findElement(object).isEnabled();
			
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return flag;
	}
	/**
	 * Method Name : isSelected
	 * Description : Determine whether or not this element is selected or not. This accepts nothing as a parameter but returns boolean value(true/false).
	 * @param driver
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public boolean isSelected(By object) throws Exception
	{
		boolean flag = false;
		try
		{
			flag = driver.findElement(object).isSelected();
			
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return flag;
	}
	/**
	 * Method Name : submit
	 * Description : This method works well/better than the click() if the current element is a form, or an element within a form. This accepts nothing as a parameter and returns nothing.
	 * @param driver
	 * @param object
	 * @throws Exception
	 */
	public void submit(By object) throws Exception
	{
		try
		{
			WebElement element = driver.findElement(object);
			element.submit();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
	}
	/**
	 * Method Name : getText
	 * Description : This method will fetch the visible (i.e. not hidden by CSS) innerText of the element. This accepts nothing as a parameter but returns a String value.
	 * @param driver
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public String getText(By object) throws Exception
	{
		String txt = null;
		try
		{
			WebElement element = driver.findElement(object);
			txt = element.getText();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return txt;
	}
	/**
	 * Method Name : getTagName
	 * Description : This method gets the tag name of this element. This accepts nothing as a parameter and returns a String value.
	 * @param driver
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public String getTagName(By object) throws Exception
	{
		String txt = null;
		try
		{
			WebElement element = driver.findElement(object);
			txt = element.getTagName();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return txt;
	}
	/**
	 * Method Name : getCssvalue
	 * Description : This method Fetch CSS property value of the give element. This accepts nothing as a parameter and returns a String value.
	 * @param driver
	 * @param object
	 * @param arg
	 * @return
	 * @throws Exception
	 */
	public String getCssvalue(By object,String arg) throws Exception
	{
		String txt = null;
		try
		{
			WebElement element = driver.findElement(object);
			txt = element.getCssValue(arg);
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return txt;
	}
	/**
	 * Method Name : getAttribute
	 * Description : This method gets the value of the given attribute of the element. This accepts the String as a parameter and returns a String value.
	 * @param driver
	 * @param object
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public String getAttribute(By object,String name) throws Exception
	{
		String txt = null;
		try
		{
			WebElement element = driver.findElement(object);
			txt = element.getCssValue(name);
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return txt;
	}
	/**
	 * Method Name : getSize
	 * Description : This method fetch the width and height of the rendered element. This accepts nothing as a parameter but returns the Dimension object.
	 * @param driver
	 * @param object
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public Dimension getSize(By object,String name) throws Exception
	{
		Dimension dimensions = null;
		try
		{
			WebElement element = driver.findElement(object);
			dimensions = element.getSize();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return dimensions;
	}
	/**
	 * Method Name : getLocation
	 * Description : This method locate the location of the element on the page. This accepts nothing as a parameter but returns the Point object.
	 * @param driver
	 * @param object
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public Point getLocation(By object,String name) throws Exception
	{
		Point point = null;
		try
		{
			WebElement element = driver.findElement(object);
			point = element.getLocation();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return point;
	}
	/**
	 * Method Name : getInputTextValue
	 * Description : This method will fetch the Text of the input text element.
	 * @param driver
	 * @param object
	 * @return
	 * @throws Exception
	 */
	public String getInputTextValue(By object) throws Exception
	{
		String txt = null;
		try
		{
			WebElement inputText = driver.findElement(object);
			txt =  inputText.getText();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
		return txt;
	}
	/**
	 * Method Name : clearInputTextValue
	 * Description : This method will fetch the Text of the input text element.
	 * @param driver
	 * @param object
	 * @throws Exception
	 */
	public void clearInputTextValue(By object) throws Exception
	{
		try
		{
			WebElement inputText = driver.findElement(object);
			inputText.clear();
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
	}
	/**
	 * Method Name : clearAndInputTextValue
	 * Description : This method will clear the input text field data and enter the Text into the input text element.
	 * @param driver
	 * @param object
	 * @param value
	 * @throws Exception
	 */
	public void clearAndInputTextValue(By object,String value) throws Exception
	{
		try
		{
			WebElement inputText = driver.findElement(object);
			Thread.sleep(1000);
			inputText.clear();
			Thread.sleep(1000);
			inputText.sendKeys(value);
		}
		catch(Exception e)
		{
			throw new Exception("Element Not Present. Error Message -->"+e.getMessage());
		}
	}

}
