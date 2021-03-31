package com.w2a.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;

public class FlightSearchTest {
		
		public static void main(String[] args)  {
			
			Page.initConfiguration();
			HomePage home = new HomePage();
			home.gotoFlights().bookAFlight("Mumbai (BOM", "Delhi(DEL");
			Page.quitBrowser();
		}
		
	}
