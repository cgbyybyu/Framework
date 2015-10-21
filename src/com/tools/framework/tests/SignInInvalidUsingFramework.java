package com.tools.framework.tests;

import org.testng.annotations.Test;

import com.tools.framework.GlobalConstants;
import com.tools.framework.dataaccess.TextWriter;
import com.tools.framework.logger.Logger;
import com.tools.framework.pageobjectmodel.News360LoginPage;

public class SignInInvalidUsingFramework extends TestNGBase{

	@Test
	public void run() {
		// TODO Auto-generated method stub
		Logger.logTestStart(GlobalConstants.TC_NUMBER14_RESULT + " in "
				+ GlobalConstants.currentBrowserToRunWith + " browser");
		TextWriter.writer(GlobalConstants.TC_NUMBER14_RESULT + " in "
				+ GlobalConstants.currentBrowserToRunWith + " browser - STARTED");
		News360LoginPage nloginp = new News360LoginPage();
		nloginp.verifyPage(GlobalConstants.HOME_PAGE_TITLE);
		nloginp.clickStartReadingButton();
		nloginp.signWithEmailLink();
		nloginp.setUserName(GlobalConstants.VALID_USERNAME);
		nloginp.setPassword(GlobalConstants.INVALID_PASSWORD1);
		nloginp.clickSigninButton();
		nloginp.verifyTextByXpath(GlobalConstants.SIGNIN_INVALID_MESSAGE_TEXT);
		nloginp.signinCancelButton();
		GlobalConstants
				.waiterByXpath(GlobalConstants.NEWS360_STARTREADING_BUTTON);
		Logger.logTestEnd(GlobalConstants.TC_NUMBER14_RESULT, true);
		
			TextWriter.writer(GlobalConstants.TC_NUMBER14_RESULT + " PASSED");
		

	}

}
