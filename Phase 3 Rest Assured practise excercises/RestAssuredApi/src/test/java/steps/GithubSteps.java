package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GithubSteps {
	Response res;
	
	@Given("User enter the base URL and Authorization")
	public void user_enter_the_base_url_and_authorization() {
		RestAssured
		.given().baseUri("https://api.github.com").basePath("/user/repos")
		.header("Authorization","Bearer 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");
		
	   
	}

	@When("User executes HTTP method")
	public void user_executes_http_method() {
		res= RestAssured
				.given().baseUri("https://api.github.com").basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get();
		
	 
	    
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {
	  res.prettyPrint();
	  Assert.assertEquals(res.statusCode(),200);
	}

}
