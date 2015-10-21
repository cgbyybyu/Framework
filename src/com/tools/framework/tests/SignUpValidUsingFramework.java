package com.tools.framework.tests;


import org.testng.annotations.Test;


import com.tools.framework.GlobalConstants;
import com.tools.framework.dataaccess.TextWriter;
import com.tools.framework.pageobjectmodel.AccauntWindow;
import com.tools.framework.pageobjectmodel.News360LoggedInPage;
import com.tools.framework.pageobjectmodel.News360LoginPage;


public class SignUpValidUsingFramework extends TestNGBase{


	News360LoggedInPage nlp;
	AccauntWindow aw;
	
	@Test
	public void run() {
		
	
		

		TextWriter.writer(GlobalConstants.TC_NUMBER1_RESULT + " in"
				+ GlobalConstants.currentBrowserToRunWith + " browser - STARTED");
		News360LoginPage nloginp = new News360LoginPage();
		nloginp.verifyPage(GlobalConstants.HOME_PAGE_TITLE);
		nloginp.clickStartReadingButton();
		nloginp.signWithEmailLink();
		nloginp.signUpLink();
		nloginp.signupSetUserName(GlobalConstants.VALID_USERNAME);
		nloginp.signupSetPassword(GlobalConstants.VALID_PASSWORD);
		nloginp.signupConfirmPassword(GlobalConstants.VALID_PASSWORD);
		nloginp.clickSignupButton();
		 nloginp.openHomePage();
		nlp.clickStartread();
		nlp.helmetSign();
		aw.clickLogout();



			//TextWriter.writer(GlobalConstants.TC_NUMBER1_RESULT + " PASSED");
		
		
	}

	
}
