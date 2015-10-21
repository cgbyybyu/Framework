package com.tools.framework.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.tools.framework.GlobalConstants;
import com.tools.framework.logger.Logger;



public class TestNGBase {

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod ");
		  GlobalConstants.currentBrowserToRunWith = "firefox";
		  GlobalConstants.currentDriver = GlobalConstants.getWebDriver(
					GlobalConstants.currentBrowserToRunWith);
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
		  Logger.logInfo("Inside Test Cleanup");
			GlobalConstants.currentDriver.quit();	
		 
	  }
}
