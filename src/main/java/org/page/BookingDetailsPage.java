package org.page;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingDetailsPage extends BaseClass{
	
	public BookingDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="first_name")
	private WebElement firstname;
	
	@FindBy (name="last_name")
	private WebElement lastname;
	
	@FindBy (name="address")
	private WebElement billingaddress;

	@FindBy (name="cc_num")
	private WebElement creditcardnumber;

	@FindBy (name="cc_type")
	private WebElement creditcardtype;

	@FindBy (name="cc_exp_month")
	private WebElement expirymonth;

	@FindBy (name="cc_exp_year")
	private WebElement expiryyear;

	@FindBy (name="cc_cvv")
	private WebElement cvvnumber;
	

	@FindBy (name="book_now")
	private WebElement booknow;
	
	@FindBy (name="my_itinerary")
	private WebElement itinerary;
	
	public void enterFirstName(String name) {
		firstname.sendKeys(name);
	}	
	
	public void enterLastName(String name) {
		lastname.sendKeys(name);
	}
	
	public void enterBillingAddress(String address) {
		billingaddress.sendKeys(address);
	}
	
	public void enterCreditCardNumber(String cardnumber) {
		creditcardnumber.sendKeys(cardnumber);
	}
	
	public void enterCreditCardType(String Type) {
		Select select = new Select(creditcardtype) ;
		select.selectByVisibleText(Type);
	}
	
	public void enterExpiryMonth(int month) {
		selectByIndex(expirymonth, month);
	}
	
	public void enterExpiryYear(String year) {
		Select select = new Select(expiryyear) ;
		select.selectByVisibleText(year);
	}
	
	public void enterCCVNumber(String cvv) {
		cvvnumber.sendKeys(cvv);
	}
	
	public void clickBooknow() {
		booknow.click();
	}
	
	
	public void clickMyItinerary() {
		javascriptScroll(itinerary, true);
		itinerary.click();

	}
		
		
	}

