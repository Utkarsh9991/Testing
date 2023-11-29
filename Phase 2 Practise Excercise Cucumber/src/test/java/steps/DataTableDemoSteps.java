package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableDemoSteps {

	WebDriver driver;

	@Given("User is on Create Account Page")
	public void user_is_on_create_account_page() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");

	}

	@Then("User enters following details using column name")
	public void user_enters_following_details(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		// fetches the entire data table

		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);

		// Now iterate over each row of the data table and get the value based on the
		// coumname(key)
		// | Username | Password | retype | EmailId|

		for (Map<String, String> e : userList) {

			driver.findElement(By.id("wpName2")).clear();
			driver.findElement(By.id("wpName2")).sendKeys(e.get("Username"));

			driver.findElement(By.id("wpPassword2")).clear();
			driver.findElement(By.id("wpPassword2")).sendKeys(e.get("Password"));

			driver.findElement(By.id("wpRetype")).clear();
			driver.findElement(By.id("wpRetype")).sendKeys(e.get("retype"));

			driver.findElement(By.id("wpEmail")).clear();
			driver.findElement(By.id("wpEmail")).sendKeys(e.get("EmailId"));
		}

	}

	@Then("Account creation is successful")
	public void account_creation_is_successful() {

		driver.close();

	}

}
