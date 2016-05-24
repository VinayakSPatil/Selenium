package com.IBM_SIC.accelerators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
Script Name: CheckBoxRadioButtonActions.java
Description: This package code is used to perform actions on Check Boxes and Radio Buttons
Created By and Date: Vinayak Patil / 19th May 2016
Change Description:
Change By and Date:
Dependency Check:
 */

public class CheckBoxRadioButtonActions extends TestEngine {
	
	/**
	 * Method Name :- selectCheckBox
	 * Description :- Method to select Checkbox
	 * @param driver
	 * @param objectxPath
	 * @throws Exception
	 */
	public void selectCheckBox(By object) throws Exception{
		try
		{
			WebElement checkBox = driver.findElement(object);
			checkBox.click();
		}
		catch(Exception e){
			throw new Exception("checkBox --- >Element Not Present");
		}
	}
	
	/**
	 * Method Name :- selectRadioButton
	 * Description :- Method to select Radio Button
	 * @param driver
	 * @param objectxPath
	 * @throws Exception
	 */
	public void selectRadioButton(By object) throws Exception{
		try
		{WebElement radioButton = driver.findElement(object);
			radioButton.click();
		}
		catch(Exception e){
			throw new Exception("checkBox --- >Element Not Present");
		}
	}

	/**
	 * Method Name :- isSelected
	 * Description :- Method to check if default radio button selected or not and if Yes then click on other radio button
	 * @param driver
	 * @param name
	 */
	public void isSelected(By object)
	{
		// Store all the elements of same category in the list of WebLements
		List<WebElement> oRadioButton = driver.findElements(object);
		
		// Create a boolean variable which will hold the value (True/False)
		 
		 
		 
		 // This statement will return True, in case of first Radio button is selected
		 
		 boolean bValue = oRadioButton.get(0).isSelected();
		 
		 // This will check that if the bValue is True means if the first radio button is selected
		 
		 if(bValue = true){
		 
			// This will select Second radio button, if the first radio button is selected by default
		 
			oRadioButton.get(1).click();
		 
		 }else{
		 
			// If the first radio button is not selected by default, the first will be selected
		 
			oRadioButton.get(0).click();
		 }
	}
	
	

}
