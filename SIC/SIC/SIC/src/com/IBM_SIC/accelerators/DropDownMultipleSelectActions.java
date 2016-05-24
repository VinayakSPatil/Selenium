package com.IBM_SIC.accelerators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



/**
Script Name: DropDownMultipleSelectActions.java
Description: This package code is used to manage DropDown and Multi Select elements.
Created By and Date: Vinayak Patil / 19th May 2016
Change Description:
Change By and Date:
Dependency Check:
 */

public class DropDownMultipleSelectActions extends TestEngine {

	/**
	 * Method Name :- selectByVisibleText
	 * Description :- Select an option given under any dropdowns and multiple selection boxes with selectByVisibleText method. 
	 * It takes a parameter of String which is one of the Value of Select element and it returns nothing.
	 * @param driver
	 * @param id
	 * @param textToSelect
	 */

	public void selectByVisibleText(By object, String textToSelect)
	{

		try {
			//Find Select object to perform Select action by visible Text
			Select oSelect = new Select(driver.findElement(object));

			oSelect.selectByVisibleText(textToSelect);
			System.out.println(textToSelect+" Selected");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());
		}
	}

	/**
	 * Method Name :- selectByIndex
	 * Description :- It is almost the same as selectByVisibleText but the only difference here is that we provide the index number of the option here 
	 * rather the option text.It takes a parameter of int which is the index value of Select element and it returns nothing. 
	 * @param driver
	 * @param id
	 * @param indexToSelect
	 */
	public void selectByIndex(By object, Integer indexToSelect){

		try {
			//Find Select object to perform Select action by Index
			Select oSelect = new Select(driver.findElement(object));

			oSelect.selectByIndex(indexToSelect);
			System.out.println(indexToSelect+" Selected");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());
		}
	}

	/**
	 * Method Name :- selectByValue
	 * Description :- It takes a parameter of String which is on of the value of Select element and it returns nothing
	 * @param driver
	 * @param id
	 * @param valueToSelect
	 */

	public void selectByValue(By object, String valueToSelect){

		try {
			//Find Select object to perform Select action by Value
			Select oSelect = new Select(driver.findElement(object));

			oSelect.selectByValue(valueToSelect);
			System.out.println(valueToSelect+" Selected");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());
		}
	}

	/**
	 * Method Name :- getOptions
	 * Description :- This gets the all options belonging to the Select tag. It takes no parameter and returns List<WebElements>.
	 * @param driver
	 * @param id
	 * @return 
	 */
	public List<WebElement> getOptions(By object){

		try {
			//Find Select object to perform Select action by Value
			Select oSelect = new Select(driver.findElement(object));

			List<WebElement> elements = oSelect.getOptions();

			return elements;

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());
			return null;
		}
	}

	/**
	 * Method Name :- deselectAll
	 * Description :- Clear all selected entries. This is only valid when the SELECT supports multiple selections.
	 * @param driver
	 * @param id
	 */
	public void deselectAll(By object){
		try {
			//Find Select object to perform Select action by id
			Select oSelect = new Select(driver.findElement(object));

			oSelect.deselectAll();

			System.out.println("All selections deselected successfully...");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());

		}
	}

	/**
	 * Method Name :- deselectByIndex
	 * Description :- Deselect the option at the given index.
	 * @param driver
	 * @param id
	 * @param index
	 */
	public void deselectByIndex(By object, Integer index){
		try {
			//Find Select object to perform Select action by id
			Select oSelect = new Select(driver.findElement(object));

			oSelect.deselectByIndex(index);

			System.out.println(index+ " selection deselected successfully...");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());

		}
	}

	/**
	 * Method Name :- deselectByValue
	 * Description :- Deselect all options that have a value matching the argument.
	 * @param driver
	 * @param id
	 * @param value
	 */
	public void deselectByIndex(By object, String value){
		try {
			//Find Select object to perform Select action by id
			Select oSelect = new Select(driver.findElement(object));

			oSelect.deselectByValue(value);

			System.out.println(value+ " selection deselected successfully...");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());

		}
	}

	/**
	 * Method Name :- deselectByVisibleText
	 * Description :- Deselect all options that display text matching the argument.
	 * @param driver
	 * @param id
	 * @param value
	 */
	public void deselectByVisibleText(By object, String visibleText){
		try {
			//Find Select object to perform Select action by id
			Select oSelect = new Select(driver.findElement(object));

			oSelect.deselectByVisibleText(visibleText);

			System.out.println(visibleText+ " selection deselected successfully...");

		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());

		}
	}

	/**
	 * Method Name :- isMultiple
	 * Description :- This tells whether the SELECT element support multiple selecting options at the same time or not. 
	 * This accepts nothing by returns boolean value(true/false).
	 * @param driver
	 * @param id
	 * @return
	 */
	public boolean isMultiple(By object){
		try {
			//Find Select object to perform Select action by id
			Select oSelect = new Select(driver.findElement(object));
			System.out.println(" selection deselected successfully...");
			return oSelect.isMultiple();


		} catch (Exception e) {
			System.err.println("Element not Found -->"+e.getMessage());
			return false;
		}

	}

	/**
	 * Method Name :- getDropBoxDefaultValue
	 * Description :- This method returns drop box default value.
	 * @param driver
	 * @param objectxPath
	 * @return
	 * @throws Exception
	 */
	public String getDropBoxDefaultValue(By object) throws Exception{
		if(isElementPresent(driver, object)){
			WebElement selectDropBox = driver.findElement(object);
			Select select = new Select(selectDropBox);
			return select.getFirstSelectedOption().getText();
		}
		else{
			throw new Exception("getDropBoxDefaultValue() --- >Element Not Present");
		}
	}

	/**
	 * Method Name :- isElementPresentByXpath
	 * Descrption :- Method checks if element is present by given xpath.
	 * @param driver
	 * @param xpath
	 * @return
	 */
	public boolean isElementPresentByXpath( String xpath){
		try{
			driver.findElement(By.xpath(xpath));
		}
		catch(Throwable t){
			System.err.println("Element not Found -->"+t.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * Method Name :- getDropBoxSelectedValue
	 * Description :- Method returns DropDown Selected value
	 * @param driver
	 * @param objectxPath
	 * @param index
	 * @return
	 * @throws Exception
	 */

	public String getDropBoxSelectedValue(By object,Integer index) throws Exception{
		if(isElementPresent(driver, object)){
			WebElement selectDropBox = driver.findElement(object);
			Select select = new Select(selectDropBox);
			return select.getOptions().get(index).getText();
		}
		else{
			throw new Exception("getDropBoxSelectedValue() --- >Element Not Present");
		}
	}

	/**
	 * Method Name :- getDropBoxSize
	 * Description :- It returns DropBox size
	 * @param driver
	 * @param objectxPath
	 * @return
	 * @throws Exception
	 */
	public int getDropBoxSize(By object) throws Exception	
	{
		if(ActionEngine.isElementPresent(driver, object))
		{
			WebElement selectDropBox = driver.findElement(object);
			Select select = new Select(selectDropBox);
			return select.getOptions().size();
		}
		else{
			throw new Exception("getDropBoxSize() --- >Element Not Present");
		}
	}

	/**
	 * Method Name :- getDropBoxValue
	 * Desciption :- It returns drop box values
	 * @param driver
	 * @param objectxPath
	 * @return
	 * @throws Exception
	 */

	public String[] getDropBoxValue(By object) throws Exception
	{
		if(isElementPresent(driver, object)){
			WebElement selectDropBox = driver.findElement(object);
			Select select =new Select(selectDropBox);
			List<WebElement> optionValue = select.getOptions();
			String[] value = new String[optionValue.size()];
			for(int i =0;i<optionValue.size();i++)
				value[i] = optionValue.get(i).getText();
			return value;
		}
		else{
			throw new Exception("selectDropBoxValue() --- >Element Not Present");
		}

	}


}
