package org.page;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelConfirmPage extends BaseClass {
	
	public SearchHotelConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (name="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy (name="continue")
	private WebElement continueButton;
	
	public void clickRadioButton() {
		radiobutton.click();
	}
	
	public void clickCountinueButton() {
		continueButton.click();
	}
	
}
