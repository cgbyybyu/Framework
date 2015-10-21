package com.tools.framework.tests;

import org.testng.annotations.Test;

import com.tools.framework.GlobalConstants;
import com.tools.framework.dataaccess.TextWriter;
import com.tools.framework.logger.Logger;
import com.tools.framework.pageobjectmodel.AccauntWindow;
import com.tools.framework.pageobjectmodel.News360LoggedInPage;
import com.tools.framework.pageobjectmodel.News360LoginPage;

public class SignInValidUsingFramework extends TestNGBase {

	@Test
	public void run() {
		// TODO Auto-generated method stub
		Logger.logTestStart(GlobalConstants.TC_NUMBER8_RESULT + " in"
				+ GlobalConstants.currentBrowserToRunWith + " browser");
		TextWriter.writer(GlobalConstants.TC_NUMBER8_RESULT + " in"
				+ GlobalConstants.currentBrowserToRunWith
				+ " browser - STARTED");
		News360LoginPage nloginp = new News360LoginPage();
		nloginp.verifyPage(GlobalConstants.HOME_PAGE_TITLE);
		nloginp.clickStartReadingButton();
		nloginp.signWithEmailLink();
		nloginp.setUserName(GlobalConstants.VALID_USERNAME);
		nloginp.setPassword(GlobalConstants.VALID_PASSWORD);
		nloginp.clickSigninButton();
		News360LoggedInPage nlp = nloginp.openHome_Page();
		AccauntWindow aw = nlp.helmetSign();
		aw.deleteaccaunt();
		aw.delaccaunt();
		aw.password(GlobalConstants.VALID_PASSWORD);
		aw.delaccaunt2();
		Logger.logTestEnd(GlobalConstants.TC_NUMBER8_RESULT, true);

		TextWriter.writer(GlobalConstants.TC_NUMBER8_RESULT + " PASSED");

	}

}
