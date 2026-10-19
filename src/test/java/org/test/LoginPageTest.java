package org.test;

import java.io.IOException;

import org.base.BaseClass;
import org.page.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
	
	@BeforeMethod
	public void beforeLoginScreen() throws IOException {
		browerLaunch("https://adactinhotelapp.com/");
		Screenshot("LoginPageBefore");
	}
	
	
	@Test
	public void validLogin()  {
		
		LoginPage loginPage = new LoginPage();
		
//		loginPage.enterUsername("Naveen2209");
//		loginPage.enterPassword("W3VD2F");
//		loginPage.enterLogin();
		
		loginPage.enterDetails("Naveen2209", "W3VD2F");
		
	}
	
	@AfterMethod
	public void afterLoginScreen() throws IOException {

		Screenshot("LoginPageAfter");
		browserClose();
	}

}
