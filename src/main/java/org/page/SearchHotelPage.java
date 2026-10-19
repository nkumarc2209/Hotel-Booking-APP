package org.page;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);

	}
	
	@FindBy (name = "location")
	private WebElement selectlocation;
	
	@FindBy (name = "hotels")
	private WebElement hotels;
	
	@FindBy (name = "room_type")
	private WebElement roomtype;
	
	@FindBy (name = "room_nos")
	private WebElement noofroms;
	
	@FindBy (name = "datepick_in")
	private WebElement checkindate;
	
	@FindBy (name = "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy (name = "adult_room")
	private WebElement adultroom;
	
	@FindBy (name = "child_room")
	private WebElement childroom;
	
	@FindBy (name = "Submit")
	private WebElement search;
	
	public void enterLocation(String location) {
		Select select = new Select(selectlocation);
		select.selectByVisibleText(location);
	}
	
	public void enterHotels(String value) {
		Select select = new Select(hotels);
		select.selectByVisibleText(value);
	}
			
	public void enterRoomType(String Value) {
		Select select = new Select(roomtype);
		select.selectByVisibleText(Value);
	}
				
	public void enterNoOfRooms(int Value) {
		Select select = new Select(noofroms);
		select.selectByIndex(Value);	}
	
	public void enterCheckInDate(String date) {
        checkindate.clear();
        checkindate.sendKeys(date);
	}
	
	public void enterCheckOutDate(String date) {
        checkoutdate.clear();
        checkoutdate.sendKeys(date);
	}
	
	public void enterAdultRoom(int number) {
		Select select = new Select(adultroom);
		select.selectByIndex(number);
	}
	
	public void enterChildRoom(int number) {
		Select select = new Select(childroom);
		select.selectByIndex(number);
	}
		
	public void enterSearch() {
		search.click();
	}
	
	
}
