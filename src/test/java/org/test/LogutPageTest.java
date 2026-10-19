package org.test;

import java.io.IOException;

import org.common.CommonMethods;
import org.page.LogoutPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogutPageTest extends CommonMethods {
	
	@BeforeMethod
	public void beforeScreen() throws IOException, InterruptedException  {
		
		browerLaunch("https://adactinhotelapp.com/");
		Thread.sleep(1000);
		login();
		Thread.sleep(1000);
		searchHotel();
		Thread.sleep(1000);
		searchHotelConfirm();
		Thread.sleep(1000);
		bookingDetails();
		Thread.sleep(1000);
		Screenshot("LogoutPageBefore");
	}
	
	
	@Test
	public void logOut() throws InterruptedException {
		
		LogoutPage logoutPage = new LogoutPage();
		
		logoutPage.enterLogut();
		
	}
	
	@AfterMethod
	public void afterScreen() throws IOException  {

		Screenshot("LogoutPageAfter");
		browserClose();
	}

}
