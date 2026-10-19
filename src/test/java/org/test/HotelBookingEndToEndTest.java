package org.test;

import org.common.CommonMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelBookingEndToEndTest extends CommonMethods {
	
	@BeforeMethod
	public void browerLaunch() throws InterruptedException {

		browerLaunch("https://adactinhotelapp.com/");
		Thread.sleep(1000);
	}
	
	@Test
	public void completeHotelBooking() throws InterruptedException {
		
		login();
		Thread.sleep(1000);

		searchHotel();
		Thread.sleep(1000);

		searchHotelConfirm();
		Thread.sleep(1000);

		bookingDetails();
		Thread.sleep(1000);

		logout();
		
	}
	
	@AfterMethod
	public void browerclose() {

		browserClose();
	}
	

}
