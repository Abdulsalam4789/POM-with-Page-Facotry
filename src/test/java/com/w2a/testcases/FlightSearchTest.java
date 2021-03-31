package com.w2a.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.HomePage;

public class FlightSearchTest {
	
	
	
		
	
		@Test
		public void flightSearchTest()  {
			
			Page.initConfiguration();
			HomePage home = new HomePage();
	//		Assert.assertEquals(home.findTabCoubt(),5);
	//		ErrorCollector.verifyEquals(home.findTabCoubt(),5);
//		ErrorCollector.verifyEquals(home.findTabCoubt(),6);
//			ErrorCollector.verifyEquals(home.findTabCoubt(),7);
		//	home.gotoFlights().bookAFlight("Mumbai (BOM-Chhatrapati Shivaji Intl.)", "Mumbai (BOM-Chhatrapati Shivaji Intl.)", "20/10/2020","21/10/2020");
		//
		}
		
		
		@AfterTest
		public void tearDown() {
			if (Page.driver!=null)
			Page.quitBrowser();
		}
		
	}
