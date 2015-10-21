package com.tools.framework.pageobjectmodel;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.tools.framework.GlobalConstants;




public class News360LoggedInPage extends PageBase {

	News360LoggedInPage(WebDriver driver) {
		super(driver);

	}

	public AccauntWindow helmetSign() {
		driver.findElement(By.xpath(GlobalConstants.NEWS360_HELMETSIGN))
				.click();

		
		GlobalConstants.waiterByXpath (GlobalConstants.NEWS360_DELACCAUNT_BUTTON);

		AccauntWindow aw = new AccauntWindow(GlobalConstants.currentDriver);

		return aw;
	}

	public void clickStartread() {

		driver.findElement(By.xpath(GlobalConstants.NEWS360_STARTREAD_BUTTON))
				.click();

		
		GlobalConstants.waiterByXpath (GlobalConstants.NEWS360_HELMETSIGN);

	}

	@Override
	public void verifyPage() {
		// TODO Auto-generated method stub

	}
}
