package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {
	
	@FindBy (xpath = "(//input[@name='signin-loginid'])[3]")
	public WebElement username;
	
	@FindBy (xpath = "//input[@id='signin-password']")
	public WebElement password;
	
	@FindBy (xpath = "//*[@class='btn-close icon icon-close btn-primary']")
	public WebElement submit;
	

	
	
}
