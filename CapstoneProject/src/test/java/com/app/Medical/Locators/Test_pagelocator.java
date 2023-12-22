package com.app.Medical.Locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Test_pagelocator {
	WebDriver driver;
	
	@FindBy(tagName="a")
	WebElement Reg_btn;
	@FindBy(xpath="//input[@id='name']")
	WebElement Reg_name;
	@FindBy(xpath="//input[@id='email']")
	WebElement Reg_email;
	@FindBy(xpath="//input[@id='password']")
	WebElement Reg_pass;
	@FindBy(tagName="button")
	WebElement Reg_btn1;
	@FindBy(xpath="//input[@id='email']")
	WebElement login_email;
	@FindBy(xpath="//input[@id='password']")
	WebElement login_pass;
	@FindBy(tagName="button")
	WebElement login_btn;
	@FindBy(xpath="//a[@id='cart101']")
	WebElement add;
	@FindBy(xpath="//a[@href='/home']")
	WebElement home;
	
	@FindBy(xpath="//a[@href='/cart']")
	WebElement cart_order;
	@FindBy(id="place-order")
	WebElement order;
	
	@FindBy(id="filter-button")
	WebElement filter_btn;
	@FindBy(xpath="//ul[@class='dropdown-menu show']/descendant::a[@id='lth']")
	WebElement filter_drp;
	
	@FindBy(xpath="//input[@id='search-product']")
	WebElement search;
	@FindBy(id="search-product-button")
	WebElement search_btn;
	
	
	public Test_pagelocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Registration() {
		Reg_btn.click();
		Reg_name.sendKeys("Utkarsh Sharma");
		Reg_email.sendKeys("Utkarsh@gmail.com");
		Reg_pass.sendKeys("abcd1234");
		Reg_btn1.click();	
	}
	public void login() {
		login_email.sendKeys("Utkarsh@gmail.com");
		login_pass.sendKeys("abcd1234");
		login_btn.click();	
	}
	public void addproduct() {
		add.click();
	}
	public void Home_page() {
		home.click();
	}
		
	public void cart() {
		cart_order.click();	
	}
	public void order_place() {
		order.click();
	}
	public void Filter_button() {
		filter_btn.click();
		
	}
	public void Filter_dropdown() {
		filter_drp.click();
	}
	public void search_product() {
		search.sendKeys("Hamdard Safi Natural Blood Purifier Syrup");
		search_btn.click();
	}
}
