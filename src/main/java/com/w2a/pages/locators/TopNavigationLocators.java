package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy(id="gc-custom-header-nav-bar-acct-menu")
	public WebElement account;
	@FindBy(xpath="//*[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-has-text uitk-button-primary']")
	public WebElement signin;
	
	

}
