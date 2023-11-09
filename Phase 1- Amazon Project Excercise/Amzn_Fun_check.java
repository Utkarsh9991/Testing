package amazonfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amzn_Fun_check {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("Navigate to the Amazon homepage Successfull");
		WebElement e1 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		e1.click();
		// Phone Number send & Clicked
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("---Enter Phonenumber---");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("<----------PhoneNumber Checked----->");

		// Enter password
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("--Enter password--");
		// passChecked
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		System.out.println("<----------Pass Checked----->");
		//iteration to Categoriess of amazon
		WebElement e2 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		e2.click();
		Select obj = new Select(e2);
		obj.selectByIndex(14);
		System.out.println("------>Valid category selected");
		//Values to searchbox
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("I phone 13");
		//search button clicked
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		System.out.println("------>Search button clicked<-------");
		//Product selected
		WebElement e3=driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'][1]"));
		e3.click();
		System.out.println("-------->Product Selected<---------");
		//Taking driver pointer to new tab
		for (String handle : driver.getWindowHandles()) {
		    	driver.switchTo().window(handle);
		}
		//Product added to wish list
		driver.findElement(By.xpath("//div[@id='add-to-wishlist-button-group']")).click();
		System.out.println("-------->Addded in whislist<---------");
		Thread.sleep(5000);
		driver.close();		
		
		
	}

}
