package org.page;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BaseClass {
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="logout")
	private WebElement logout;

	public void enterLogut() {
		logout.click();
	}
}
