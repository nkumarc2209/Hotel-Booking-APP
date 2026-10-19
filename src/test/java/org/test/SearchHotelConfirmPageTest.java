package org.test;

import java.io.IOException;

import org.common.CommonMethods;
import org.page.SearchHotelConfirmPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchHotelConfirmPageTest extends CommonMethods {
	
	
	@BeforeMethod
	public void beforeScreen() throws IOException  {
		browerLaunch("https://adactinhotelapp.com/");
		login();
		searchHotel();
		Screenshot("SearchHotelConfirmPageBefore");
	}
	
	@Test
	public void SearchHotelConfirmPage() {

		SearchHotelConfirmPage SearchHotelConfirmPage = new SearchHotelConfirmPage();
		
		SearchHotelConfirmPage.clickRadioButton();
		SearchHotelConfirmPage.clickCountinueButton();
	}
	
	

}
