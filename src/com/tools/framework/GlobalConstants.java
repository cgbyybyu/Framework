package com.tools.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class GlobalConstants {

	public static final int ELEMENT_LOCATING_DEFAULT_TIMEOUT = 10;// default
	// value of
	// 10sec

public static final String VALID_USERNAME = "cgbyyb@rambler.ru";
public static final String VALID_PASSWORD = "17grenoble";
public static final String INVALID_PASSWORD1 = "asdfgh12";
public static final String INVALID_PASSWORD2 = "qwe2";

public static final String MESSAGE_FILE = "C:\\Users\\User\\Desktop\\testresult.txt";

public static final String HOME_PAGE_URL = "https://news360.com/";

public static final String HOME_PAGE_TITLE = "News360: Your personalized news reader app";
public static final String LOGIN_PAGE_TITLE = "News360: Your personalized news reader app";
public static final String BROWSER_LIST_FILE_PATH = "C:\\Users\\User\\Desktop\\BrowserSelectionFile.txt";
public static WebDriver currentDriver = null;
public static String currentBrowserToRunWith;

public static final String NEWS360_STARTREADING_BUTTON = "/html/body/div[1]/div[1]/div/div[1]/a[6]";

public static final String NEWS360_SIGNWITHEMAIL_LINK = " /html/body/div[2]/div[2]/div[3]/div[3]/a";

public static final String NEWS360_SIGNIN_BUTTON = "/html/body/div[2]/div[2]/div[4]/form[4]/div[1]/button[2]";
public static final String NEWS360_SIGNUP_LINK = "/html/body/div[2]/div[2]/div[4]/form[4]/div[2]/div[2]/a";

public static final String NEWS360_SIGNUP_BUTTON = "/html/body/div[2]/div[2]/div[4]/form[3]/div[1]/button[2]";
public static final String NEWS360_HELMETSIGN = "/html/body/div[1]/div/div[2]/a[3]";
public static final String NEWS360_LOGOUT_BUTTON = "/html/body/div[2]/div/div[1]";

public static final String NEWS360_DELETEACCAUNT_BUTTON = "/html/body/div[2]/div/div[3]/div[4]";
public static final String NEWS360_DELACCAUNT_BUTTON = "/html/body/div[2]/div/div[3]/div[5]/div/div[2]";
public static final String NEWS360_DELACCAUNT_BUTTON2 = "/html/body/div[2]/div/div[3]/div[6]/div[2]/div[2]";
public static final String NEWS360_STARTREAD_BUTTON = "/html/body/div[1]/div/div[2]";
public static final String NEWS360_ACCAUNTWINDOW_PASSWORDFIELD = "/html/body/div[2]/div/div[3]/div[6]/div[1]/input";
public static final String NEWS360_SHOWMOREPOPULAR_BUTTON = "/html/body/div[2]/div[1]/div[1]/div[1]/div[2]";

public static final String NEWS360_EMAIL_BOX = "/html/body/div[2]/div[2]/div[4]/form[4]/fieldset[1]/input";
public static final String NEWS360_PASSWORD_BOX = "/html/body/div[2]/div[2]/div[4]/form[4]/fieldset[2]/input";

public static final String NEWS360_SIGNUP_EMAIL_BOX = "/html/body/div[2]/div[2]/div[4]/form[3]/fieldset[1]/input";
public static final String NEWS360_SIGNUP_PASSWORD_BOX = "popuppassword";
public static final String NEWS360_SIGNUP_CONFIRMPASSWORD_BOX = "/html/body/div[2]/div[2]/div[4]/form[3]/fieldset[3]/input";
public static final String CONFIRM_PASSWORD_TEXT = "This value should be the same.";
public static final String SIGNUP_CANCEL_BUTTON = "/html/body/div[2]/div[2]/div[4]/form[3]/div[1]/button[1]";
public static final String CONFIRM_PASSWORD_TEXT_MESSAGE = "equalto";
public static final String SIGNIN_INVALID_MESSAGE_XPATH = "/html/body/div[1]/div[1]/div/div[5]/div[1]";
public static final String SIGNIN_INVALID_MESSAGE_TEXT = "Invalid login or password";
public static final String SIGNIN_CANCEL_BUTTON = "/html/body/div[2]/div[2]/div[4]/form[4]/div[1]/button[1]";
public static final String TC_NUMBER1_RESULT = "Sign Up Valid data TC #1";
public static final String TC_NUMBER2_RESULT = "Sign Up Invalid Data TC #2";
public static final String TC_NUMBER8_RESULT = "Sign In Valid Data TC #8";
public static final String TC_NUMBER14_RESULT = "Sign In Invalid Data TC #14";

public static final String EXCEL_RESULT_FILEPATH = "C:\\Users\\User\\Desktop\\data.xlsx";

public static WebDriver getWebDriver(String browser) {
if (browser.equalsIgnoreCase("ie"))
return new InternetExplorerDriver();
else if (browser.equalsIgnoreCase("ie_news360_startup")) {
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(
InternetExplorerDriver.INITIAL_BROWSER_URL,
"http://news360.com");

return new InternetExplorerDriver(capabilities);
} else if (browser.equalsIgnoreCase("chrome"))
return new ChromeDriver();
else if (browser.equalsIgnoreCase("htmlUnit"))
return new HtmlUnitDriver();
else if (browser.equalsIgnoreCase("firefox"))
return new FirefoxDriver();
return null;

}

public static void waiterById(String idquerry) {
FluentWait<WebDriver> waiter = new FluentWait<WebDriver>(
GlobalConstants.currentDriver);
waiter.withTimeout(30, TimeUnit.SECONDS);
waiter.pollingEvery(100, TimeUnit.MILLISECONDS);
waiter.ignoring(NoSuchElementException.class);

waiter.until(ExpectedConditions.presenceOfElementLocated(By
.id(idquerry)));
}

public static void waiterByXpath(String xpathdquerry) {
FluentWait<WebDriver> waiter = new FluentWait<WebDriver>(
GlobalConstants.currentDriver);
waiter.withTimeout(30, TimeUnit.SECONDS);
waiter.pollingEvery(100, TimeUnit.MILLISECONDS);
waiter.ignoring(NoSuchElementException.class);

waiter.until(ExpectedConditions.presenceOfElementLocated(By
.xpath(xpathdquerry)));
}

public static void waiterByLinkText(String textquerry) {
FluentWait<WebDriver> waiter = new FluentWait<WebDriver>(
GlobalConstants.currentDriver);
waiter.withTimeout(30, TimeUnit.SECONDS);
waiter.pollingEvery(100, TimeUnit.MILLISECONDS);
waiter.ignoring(NoSuchElementException.class);

waiter.until(ExpectedConditions.presenceOfElementLocated(By
.partialLinkText(textquerry)));
}
	
}
