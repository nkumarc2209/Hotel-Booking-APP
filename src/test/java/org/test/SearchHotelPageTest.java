package org.test;

import java.io.IOException;

import org.common.CommonMethods;
import org.page.SearchHotelPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchHotelPageTest extends CommonMethods {
	
	
	@BeforeMethod
	public void beforeScreen() throws IOException  {
		browerLaunch("https://adactinhotelapp.com/");
		login();
		Screenshot("SearchHotelPageBefore");
	}
	
	@Test
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
	
	@AfterMethod
	public void afterScreen() throws IOException  {

		Screenshot("SearchHotelPagAfter");
		browserClose();
	}
	
}
	
	
	


