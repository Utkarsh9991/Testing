package com.app.BusBooking.PagesLocators;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='src']")
	WebElement Source;
	
	@FindBy(xpath="//div[@class='aligned-item list-item']/descendant::div[text()='Delhi, India']")
	WebElement SourceSelect;
	
	@FindBy(xpath="	//input[@id='dest']")
	WebElement Destination;
	
	@FindBy(xpath="//div[@class='aligned-item list-item']/descendant::div[text()='Mumbai, Maharashtra, India']")
	WebElement DestinationSelect;
	
	
	@FindBy(id="date-box")
	WebElement Date;
	@FindBy(xpath="//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 fxWHuy']")
	WebElement Datepick;
	@FindBy(id="return-box")
	WebElement ReturnD;
	
	@FindBy(xpath="//span[@class='DayTilesWrapper__DayWrapper-moo2xh-1 loqlv']/descendant::span[text()='20'][1]")
	WebElement ReturnDpick;
	@FindBy(id="search_butn")
	WebElement SearchButton;
	@FindBy(xpath="//div[@id='result-section']/descendant::div[@class='clearfix bus-item'][1]/descendant::div[@class='button view-seats fr']")
	WebElement BusSelection;
	@FindBy(xpath="//i[@class='icon-close closepopupbtn']")
	WebElement PopUpreject;
	@FindBy(xpath="//canvas[@data-type='lower']")
	WebElement seatElement;
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void SourceDetails() {

		Source.sendKeys("Delhi");
		SourceSelect.click();
	}
	public void DestinationDetails() {

		Destination.sendKeys("Mumbai");
		DestinationSelect.click();
	}
	public void DatePick() {

		Date.click();
		Datepick.click();
		ReturnD.click();
		ReturnDpick.click();	
	}
	public void SearchButton() {
		SearchButton.click();
		
	}
	public void BusandSeatSelection() {
		BusSelection.click();
		System.out.println("Clickewd");
		PopUpreject.click();	
	}
	public void SeatSelector() {
		 Actions actions = new Actions(driver);
	        actions.moveToElement(seatElement).perform();

	        // Find all seat elements within the canvas
	        List<WebElement> seatElements = driver.findElements(By.xpath("//div[@class='seat']"));

	        for (WebElement seat : seatElements) {
	            // Simulate hover to reveal the pointer class using JavaScript
	            ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('class', 'seat pointer');", seat);

	            // Check if the seat is available (you may need to adjust the condition)
	            if (seat.getAttribute("class").contains("pointer")) {
	                seat.click();
	            }
	        }
	    }
	
	
		
	}
		
	
	
	
