package com.tools.framework.tests;

import org.testng.annotations.Test;

import com.tools.framework.GlobalConstants;
import com.tools.framework.dataaccess.TextWriter;
import com.tools.framework.logger.Logger;
import com.tools.framework.pageobjectmodel.News360LoginPage;



public class SignUpInvalidUsingFramework extends TestNGBase{

	@Test
	public void run() {
		// TODO Auto-generated method stub
		
		Logger.logTestStart(GlobalConstants.TC_NUMBER2_RESULT + " in"
				+ GlobalConstants.currentBrowserToRunWith + " browser");
		TextWriter.writer(GlobalConstants.TC_NUMBER2_RESULT + " in"
				+ GlobalConstants.currentBrowserToRunWith + " browser - STARTED");
		News360LoginPage nloginp = new News360LoginPage();
		nloginp.verifyPage(GlobalConstants.HOME_PAGE_TITLE);
		nloginp.clickStartReadingButton();
		nloginp.signWithEmailLink();
		nloginp.signUpLink();
		nloginp.signupSetUserName(GlobalConstants.VALID_USERNAME);
		nloginp.signupSetPassword(GlobalConstants.VALID_PASSWORD);
		nloginp.signupConfirmPassword(GlobalConstants.INVALID_PASSWORD2);
		nloginp.clickSignupButton();
			
		nloginp.verifyTextClassname(GlobalConstants.CONFIRM_PASSWORD_TEXT);
		nloginp.cancelButton();
		GlobalConstants.waiterByXpath(GlobalConstants.NEWS360_SIGNWITHEMAIL_LINK);
		Logger.logTestEnd(GlobalConstants.TC_NUMBER2_RESULT, true);
		

			TextWriter.writer(GlobalConstants.TC_NUMBER2_RESULT + "PASSED");

			
			
				
	}

}
