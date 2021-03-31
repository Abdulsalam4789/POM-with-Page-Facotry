package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy (xpath = "//*[@id='uitk-tabs-button-container']/li[2]")
	public WebElement flightTab;
	
	//Locators for Flight Booking
//	
	@FindBy (xpath = "(//div [contains(@class,'uitk-typeahead-button-label')])[1]")
	public WebElement fromCity;
	
	@FindBy (xpath = "(//div [contains(@class,'uitk-typeahead-button-label ')])[2]")
	public WebElement toCity;
	
//	@FindBy (xpath = "//*[@id='wizard-flight-tab-roundtrip']/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[4]/td[6]/button")
//	public WebElement departFlight;
//
//	@FindBy (xpath = "//*[@id='wizard-flight-tab-roundtrip']/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[4]/td[7]/button")
//	public WebElement retutnFlight;
	
	@FindBy (xpath = "//*[@id='wizard-flight-pwa-1']/div[3]/div[2]/button")
	public WebElement searchBtn;
	
	@FindBy (xpath ="//*[@class='uitk-tab-anchor']")
	public List<WebElement> tabCount;
	
	

}
