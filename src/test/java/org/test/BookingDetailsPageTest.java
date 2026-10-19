package org.test;

import java.io.IOException;

import org.common.CommonMethods;
import org.page.BookingDetailsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookingDetailsPageTest extends CommonMethods {
	
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
		Screenshot("BookingDetailsPageBefore");
	}
	
	
	@Test
	public void BookingDetails() throws InterruptedException {
		
		BookingDetailsPage bookingDetailsPage = new BookingDetailsPage();
		
		bookingDetailsPage.enterFirstName("Naveen");
		bookingDetailsPage.enterLastName("Kumar");
		bookingDetailsPage.enterBillingAddress("7, Karur Main Road, Salaipudur, Kodumudi, Erode");
		bookingDetailsPage.enterCreditCardNumber("1234123412341234");
		bookingDetailsPage.enterCreditCardType("VISA");
		bookingDetailsPage.enterExpiryMonth(5);
		bookingDetailsPage.enterExpiryYear("2030");
		bookingDetailsPage.enterCCVNumber("123");
		bookingDetailsPage.clickBooknow();
		Thread.sleep(10000);
		bookingDetailsPage.clickMyItinerary();
	}
	
	@AfterMethod
	public void afterScreen() throws IOException  {

		Screenshot("BookingDetailsPageAfter");
		browserClose();
	}
	

}
