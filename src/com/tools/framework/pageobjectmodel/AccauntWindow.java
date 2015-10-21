package com.tools.framework.pageobjectmodel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.tools.framework.GlobalConstants;



public class AccauntWindow extends PageBase {

	AccauntWindow(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickLogout() {

		driver.findElement(By.xpath(GlobalConstants.NEWS360_LOGOUT_BUTTON))
				.click();

		GlobalConstants
				.waiterByXpath(GlobalConstants.NEWS360_STARTREADING_BUTTON);

		
	}

	public void deleteaccaunt() {
		driver.findElement(
				By.xpath(GlobalConstants.NEWS360_DELETEACCAUNT_BUTTON)).click();
		
	}

	public void delaccaunt() {
		driver.findElement(By.xpath(GlobalConstants.NEWS360_DELACCAUNT_BUTTON))
				.click();
	}

	public void delaccaunt2() {
		driver.findElement(By.xpath(GlobalConstants.NEWS360_DELACCAUNT_BUTTON2))
				.click();

		GlobalConstants
				.waiterByXpath(GlobalConstants.NEWS360_STARTREADING_BUTTON);
	}

	public void password(String pass) {
		driver.findElement(
				By.xpath(GlobalConstants.NEWS360_ACCAUNTWINDOW_PASSWORDFIELD))
				.sendKeys(pass);
		;
	}

	@Override
	public void verifyPage() {
		// TODO Auto-generated method stub

	}

}
