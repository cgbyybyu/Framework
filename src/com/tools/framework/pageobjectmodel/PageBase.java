package com.tools.framework.pageobjectmodel;

import org.openqa.selenium.WebDriver;

public abstract class PageBase {

	protected WebDriver driver;
	protected WebPageHeader pageHeader;
	
	// Intialize Data Members
	PageBase(WebDriver driver)
	{
		this.driver=driver;
	}

	public abstract void verifyPage();
}
