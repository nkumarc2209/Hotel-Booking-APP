package org.page;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginButton;

	
//	public void enterUsername(String value) {
//		username.sendKeys(value);
//	}
//
//	public void enterPassword(String value) {
//		password.sendKeys(value);;
//	}

	public void enterDetails(String value1, String value2 ) {
		username.sendKeys(value1);
		password.sendKeys(value2);
		loginButton.click();
		
	}
	
	
//	public void enterLogin() {
//		loginButton.click();
//	}
//	
	
}
