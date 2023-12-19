package TestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


import static org.hamcrest.Matchers.*;

public class Script007HamcrestValidateMethods {
	@Test(priority='1')
	public void validatemathods() {
		String apikey = "PMAK-657937b1488618716404c9d7-88f2ee2982b1e70a2641628bbad6eba9c7";
		RestAssured.given().baseUri("https://api.postman.com/workspaces").header("x-api-key", apikey).when().get()
				.then().statusCode(200)
				.body("workspaces[14].id",equalTo("3cee1b4a-49cf-49b7-b7a7-033484dfe002"),
						"workspaces[14].name", equalTo("Utkarsh workspace"),
						"workspaces[14].type", equalTo("personal"));
					  	
		
		
	}
	@Test(priority='2')
	public void ValidateResponseBody_equalTo() {
		 RestAssured
		.given()
		.baseUri("https://petstore.swagger.io").basePath("/v2/user/utkarsh_10")
		.when().get()
		.then()
		.body("username",equalTo("utkarsh_10"),
				  "firstName", equalTo("Utkarsh"),
				  "lastName", equalTo("Sharma"),
				  "email", equalTo("abcd23@gmail.com"));
		
}
	@Test(priority='3')
	public void ValidateResponseBody_hasItems() {
		String apikey="PMAK-657937b1488618716404c9d7-88f2ee2982b1e70a2641628bbad6eba9c7";
		RestAssured
		.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", apikey).when().get()
		.then()
		.body("workspaces.name", hasItems("My Workspace", "Utkarsh workspace","My Workspace-1"),
				 "workspaces.type", hasItems("personal"));
		
		
	}
}
