package com.app.Medical.Testing;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.Medical.Base.Base;
import com.app.Medical.Locators.Test_pagelocator;

public class Test_med extends Base  {
    Test_pagelocator hp; // Use the same name as the class if you prefer


    @BeforeClass
    public void openApp() {
        openBrowser("Chrome");
        hp = new Test_pagelocator(driver); // Initialize the page object correctly
    }

    @Test(priority = 1)
    public void Register(){
      hp.Registration();
       
    }
 
	@Test(priority=2)
    public void login() throws InterruptedException {
    	hp.login();
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");
    	Thread.sleep(5000);
    	hp.addproduct();
    	hp.Home_page();
    	Thread.sleep(4000);
    	hp.cart();
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");
    	Thread.sleep(4000);
    	hp.order_place();
    	hp.Home_page();
    	System.out.println("Till filter");
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");
    	Thread.sleep(4000);
    	hp.Filter_button();
    	System.out.println("filter button click");
   
    	hp.Filter_dropdown();
    	hp.Home_page();
    	Thread.sleep(2000);
    	hp.search_product();
    }  
	
}



