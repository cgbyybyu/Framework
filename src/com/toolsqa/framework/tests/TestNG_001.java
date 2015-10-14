package com.toolsqa.framework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_001 extends TestNGBase {
	
  @Test
  public void testRun1(){
	  System.out.println("TestNG_001 RUN");
	  //throw new IllegalStateException();// driver.findElement
	  // Test Code that uses Framework Lib
  }
  
  @Test
  public void testRun2(){
	  System.out.println("TestNG_002 RUN");
	  //throw new IllegalStateException();// driver.findElement
	  // Test Code that uses Framework Lib
  }
  
}
