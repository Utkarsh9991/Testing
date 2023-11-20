package com.app.BusBooking.Testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.BusBooking.Base.Base;
import com.app.BusBooking.PagesLocators.HomePage;

public class HomePageTest extends Base {
	HomePage hp;
	
	@BeforeClass
	public void OpenApp() {

		openBrowser("Chrome");
		hp = new HomePage(driver);
	}
	
	@Test(priority='1')
	public void SourceandDestinationDetails() throws InterruptedException {
		hp.SourceDetails();
		Thread.sleep(2000);
		hp.DestinationDetails();
		hp.DatePick();
		 	  	    
	}
	@Test(priority='2')
	public void Searchbutton() {
		hp.SearchButton();
		
	}
	@Test(priority='3')
	public void BusandSeatSelection() throws InterruptedException {
		Thread.sleep(2000);
		hp.BusandSeatSelection();	
	}
	@Test
	public void SeatSelector() {
		hp.SeatSelector();
	}
	

	

	

}
