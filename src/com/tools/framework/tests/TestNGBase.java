package com.tools.framework.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tools.framework.GlobalConstants;
import com.tools.framework.logger.Logger;

public class TestNGBase {

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod ");
	  }

	  @AfterMethod
	  public void afterMethod(ITestResult result) {
		  System.out.println("afterMethod");
		  if(ITestResult.FAILURE==result.getStatus())
		  {
		  Logger.logScreenShot(GlobalConstants.currentDriver, result.getTestName());
		  }
	  }
}
