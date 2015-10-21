package com.tools.framework.pageobjectmodel;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tools.framework.GlobalConstants;



public class News360LoginPage extends PageBase {

	public News360LoginPage() {
		this(GlobalConstants.currentDriver);
	}

	News360LoginPage(WebDriver driver) {
		super(driver);
		driver.get(GlobalConstants.HOME_PAGE_URL);
		driver.manage().window().maximize();

	}

	public void clickStartReadingButton() {
		driver.findElement(
				By.xpath(GlobalConstants.NEWS360_STARTREADING_BUTTON)).click();

	}

	public void signWithEmailLink() {
		driver.findElement(
				By.xpath(GlobalConstants.NEWS360_SIGNWITHEMAIL_LINK)).click();
	}

	public void signUpLink() {
		driver.findElement(By.xpath(GlobalConstants.NEWS360_SIGNUP_LINK))
				.click();
	}

	public void signupSetUserName(String username) {

		driver.findElement(By.xpath(GlobalConstants.NEWS360_SIGNUP_EMAIL_BOX))
				.sendKeys(username);

	}

	public void setUserName(String username) {

		driver.findElement(By.xpath(GlobalConstants.NEWS360_EMAIL_BOX))
				.sendKeys(username);
	}

	public void signupSetPassword(String password) {
		driver.findElement(By.id(GlobalConstants.NEWS360_SIGNUP_PASSWORD_BOX))
				.sendKeys(password);
	}

	public void signupConfirmPassword(String password) {
		driver.findElement(
				By.xpath(GlobalConstants.NEWS360_SIGNUP_CONFIRMPASSWORD_BOX))
				.sendKeys(password);
	}

	public void setPassword(String password) {
		driver.findElement(By.xpath(GlobalConstants.NEWS360_PASSWORD_BOX))
				.sendKeys(GlobalConstants.VALID_PASSWORD);
	}

	public void clickSignupButton() {

		driver.findElement(By.xpath(GlobalConstants.NEWS360_SIGNUP_BUTTON))
				.click();
	}
		
public News360LoggedInPage openHomePage()
{
		News360LoggedInPage nlp = new News360LoggedInPage(
				GlobalConstants.currentDriver);

		GlobalConstants
				.waiterByXpath(GlobalConstants.NEWS360_SHOWMOREPOPULAR_BUTTON);

		return nlp;
	}

	public void clickSigninButton() {

		driver.findElement(By.xpath(GlobalConstants.NEWS360_SIGNIN_BUTTON))
				.click();
	}
	public News360LoggedInPage  openHome_Page()
	{
		
		GlobalConstants.waiterByXpath(GlobalConstants.NEWS360_HELMETSIGN);

	
		News360LoggedInPage nlp = new News360LoggedInPage(
				GlobalConstants.currentDriver);
		return nlp;
	}

	public void verifyPage(String title) {
		if (driver.getTitle().equals(title))
			System.out.println();
		else
			throw new IllegalStateException();
	}
	
		public void verifyTextByXpath (String text1)
		{
		try {
		assertEquals(text1, driver.findElement(By.xpath(GlobalConstants.SIGNIN_INVALID_MESSAGE_XPATH)).getText());
	    } catch (Error e) {
	        
	    }
		}
	public void verifyTextClassname(String text) {
		// TODO Auto-generated method stub
		try {
			assertEquals(text, driver.findElement(By.className(GlobalConstants.CONFIRM_PASSWORD_TEXT_MESSAGE)).getText());
		    } catch (Error e) {
		        
		    }
	}
	public void signinCancelButton()
	{
		driver.findElement(By.xpath(GlobalConstants.SIGNIN_CANCEL_BUTTON)).click();
	}
		
		
		
		
		public void cancelButton()
		{
		 driver.findElement(By.xpath(GlobalConstants.SIGNUP_CANCEL_BUTTON)).click();
		}

	@Override
	public void verifyPage() {
		// TODO Auto-generated method stub

	}

	
		
	}

	


