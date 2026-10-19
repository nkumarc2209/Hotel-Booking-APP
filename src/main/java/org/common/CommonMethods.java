package org.common;

import org.base.BaseClass;

import org.page.BookingDetailsPage;
import org.page.LoginPage;
import org.page.LogoutPage;
import org.page.SearchHotelConfirmPage;
import org.page.SearchHotelPage;

public class CommonMethods extends BaseClass {
	
	public void login() {

        LoginPage loginPage = new LoginPage();
		
		loginPage.enterUsername("Naveen2209");
		loginPage.enterPassword("W3VD2F");
		loginPage.enterLogin();
	}
	
	public void searchHotel() {
		
        SearchHotelPage hotelPage = new SearchHotelPage();
		
		hotelPage.enterLocation("New York");
		hotelPage.enterHotels("Hotel Sunshine");
		hotelPage.enterRoomType("Standard");
		hotelPage.enterNoOfRooms(2);
		hotelPage.enterCheckInDate("20/09/2026");
		hotelPage.enterCheckOutDate("22/09/2026");
		hotelPage.enterAdultRoom(1);
		hotelPage.enterChildRoom(0);
		hotelPage.enterSearch();

	}
	
	public void searchHotelConfirm() {

        SearchHotelConfirmPage SearchHotelConfirmPage = new SearchHotelConfirmPage();
		
		SearchHotelConfirmPage.clickRadioButton();
		SearchHotelConfirmPage.clickCountinueButton();
	}
	
	public void bookingDetails() throws InterruptedException {

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

	public void logout() {
		
        LogoutPage logoutPage = new LogoutPage();
		
		logoutPage.enterLogut();
	
	}
}
