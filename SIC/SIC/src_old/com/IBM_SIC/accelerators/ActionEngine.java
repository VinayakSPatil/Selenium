/**
 * 
 */
package com.IBM_SIC.accelerators;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.IBM_SIC.CONFIG.Constant;

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
public class ActionEngine {

	public static String exeTime= null;
	public static Properties properties = new Properties();
	public static WebDriver driver = null;

	/* This method is used to open the Browser	*/
	public static WebDriver OpenBrowser() throws Exception{
		String sBrowserName;
		String environment=null;
		exeTime = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
		try{
			properties.load(new FileInputStream(Constant.configPath));
			sBrowserName = properties.getProperty("Browser");
			environment = properties.getProperty("Environment");
			String URL =  properties.getProperty("URL");

			if(sBrowserName.equals("Mozilla")){
				try
				{	
					System.out.println();
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Executing on Firefox Browser: " + exeTime);
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
					driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.get(URL);
				}
				catch (Exception e)
				{
					System.err.println();
					System.err.println("Class Utils | Method OpenBrowser Inside Catch Exception | Exception: "+e.getMessage());
					System.out.println("Inside catch Exception to open the firfox");
					File pathToFirefoxBinary = new File(properties.getProperty("Browser_Mozilla"));
					FirefoxBinary firefoxbin = new FirefoxBinary(pathToFirefoxBinary);
					driver = new FirefoxDriver(firefoxbin,null);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.get(URL);
				}
			}

			if(sBrowserName.equals("Chrome"))
			{
				try
				{
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Executing on Chrome Browser: " + exeTime);
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println(properties.getProperty("Browser_Chrome"));
					System.setProperty("webdriver.chrome.driver", properties.getProperty("Browser_Chrome"));
					driver = new ChromeDriver(); 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.get(URL);
					
				}
				catch (Exception e)
				{
					System.out.println("Class Utils | Method OpenBrowser Inside Catch Exception | Exception: "+e.getMessage());
					System.out.println("Inside catch Exception to open the Chrome");
					System.setProperty("webdriver.chrome.driver", properties.getProperty("Browser_Chrome"));
					driver = new ChromeDriver(); 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					driver.get(URL);
				}
			}

			if(sBrowserName.equals("InternetExplorer"))
			{
				try
				{
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("Executing on Internet Explorer Browser: " + exeTime);
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
					DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
					cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					cap.setJavascriptEnabled(true);			
					//File file = new File(".//lib//IEDriverServer.exe");
					System.setProperty("webdriver.ie.driver", properties.getProperty("Browser_IE"));
					driver = new InternetExplorerDriver(cap);
					driver.manage().window().maximize();
					driver.get(URL);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				catch (Exception e)
				{
					System.out.println("Class Utils | Method OpenBrowser Inside Catch Exception | Exception desc"+e.getMessage());
					System.out.println("Inside catch Exception to open the IE");
					DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
					cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
					cap.setJavascriptEnabled(true);		
					System.setProperty("webdriver.ie.driver", properties.getProperty("Browser_IE"));
					driver = new InternetExplorerDriver(cap);
					driver.manage().window().maximize();
					driver.get(URL);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
			}
		}catch (Exception e){
			System.out.println("Class Utils | Method OpenBrowser | Exception: "+e.getMessage());
		}

		return driver;
	}

	public static void main(String[] args)
	{
		try {
			OpenBrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
