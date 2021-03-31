package com.w2a.pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	
	public HomePage() {
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
		
	}
	
	public HomePage gotoFlights() {
		
		click(home.flightTab);
		return this;
	}
	
	public void gotoStays() {
		
		
	}
	public int findTabCoubt() {

		return home.tabCount.size();
	}
	
	public void gotoPackages() {
		
		
	}
	
	public void bookAFlight(String from, String to)  {
		
		home.fromCity.sendKeys(from);
		home.toCity.sendKeys(to);
//		home.departFlight.sendKeys(departing);
//		home.retutnFlight.sendKeys(returning);
//		home.searchBtn.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		home.searchBtn.click();
	}
	

}
