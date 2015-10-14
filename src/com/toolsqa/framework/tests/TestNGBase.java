package com.toolsqa.framework.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {

	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod ");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
	  }
}
