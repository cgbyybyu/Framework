package com.toolsqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GlobalConstants {

	public static final int ELEMENT_LOCATING_DEFAULT_TIMEOUT = 10;//default value of 10sec
	
	public static final String VALID_USERNAME = "10janbatch_test1";
	public static final String VALID_PASSWORD = "18NYVIZMI52f";
	
	
	public static final String MESSAGE_FILE = "it-it_Messages.txt";
	
	public static final String HOME_PAGE_URL = "http://store.demoqa.com";
	public static final String LOGIN_PAGE = "http://store.demoqa.com/products-page/your-account";
	
	
	public static final String HOME_PAGE_TITLE= "ONLINE STORE";
	public static final String LOGIN_PAGE_TITLE= "Your Account";
	public static final String BROWSER_LIST_FILE_PATH = "C:\\Users\\Sandy\\Desktop\\BrowserSelectionFile.txt";
	public static WebDriver currentDriver  = null;
	public static String currentBrowserToRunWith ;
	
	// LoginErrorMessage=Invalid UserName
	// LoginErrorMessage=Invlid UsN
	
	
	public static WebDriver getWebDriver(String browser)
	{
		if(browser.equalsIgnoreCase("ie"))
			return new InternetExplorerDriver();
		if(browser.equalsIgnoreCase("ie_toolsqa_startup"))
		{
			DesiredCapabilities capabilities =  new DesiredCapabilities();
			capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,
					"http://toolsqa.com");
			
			return new InternetExplorerDriver(capabilities);
		}
		else if(browser.equalsIgnoreCase("chrome"))
			return new ChromeDriver();
		else if(browser.equalsIgnoreCase("htmlUnit"))
			return new HtmlUnitDriver();
		return new FirefoxDriver();
	}
	
}
