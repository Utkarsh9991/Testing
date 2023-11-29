package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExamplesNinjaDemo {

	WebDriver driver;

	@Given("I am on tutorialNinja Homepage")
	public void i_am_on_tutorials_ninja_home_page() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");

	}

	@Then("I click on my account link")
	public void i_click_on_my_account_link() {

		driver.findElement(By.xpath("//span[text()='My Account']")).click();

	}

	@When("I click on login link")
	public void i_click_on_login_link() {

		driver.findElement(By.linkText("Login")).click();

	}

	@Then("I will be on the login page and I capture the title of the page")
	public void i_will_be_on_the_login_page_and_i_capture_the_title_of_the_page() {

		System.out.println("Title of the page is : " + driver.getTitle());

	}

	@Then("I enter email id as {string} on the page")
	public void i_enter_email_id_as_on_the_page(String EmailId) {

		driver.findElement(By.id("input-email")).sendKeys(EmailId);

	}

	@Then("I enter password as {string} on the page")
	public void i_enter_password_as_on_the_page(String password) {

		driver.findElement(By.id("input-password")).sendKeys(password);

	}

	@Then("I click login button")
	public void i_click_login_button() {

		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("I enter Input for the search box")
	public void i_enter_input_for_the_search_box() {

		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mac");

	}

	@Then("I click on search button")
	public void i_click_on_search_button() {

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

	}

	@Given("I click on Add to cart button")
	public void i_click_on_add_to_cart_button() {

		driver.findElement(By.linkText("Shopping Cart")).click();

	}

	@Given("I click on Checkout button")
	public void i_click_on_checkout_button() {

		driver.findElement(By.linkText("Checkout")).click();

	}

	@Then("I click on logout link")
	public void i_click_on_logout_link() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@And("I close browser")
	public void i_close_browser() {

		driver.close();
	}

}
