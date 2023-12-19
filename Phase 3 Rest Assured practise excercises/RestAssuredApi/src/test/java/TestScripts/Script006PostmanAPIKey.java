package TestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script006PostmanAPIKey {

	@Test(priority = 1)
	public void postmangetReq() {
		String apikey = "PMAK-657937b1488618716404c9d7-88f2ee2982b1e70a2641628bbad6eba9c7";
		RestAssured.given().baseUri("https://api.postman.com/workspaces").header("x-api-key", apikey).when().get()
				.then() // after then, we are validating the request
				.statusCode(200).log().all();

	}

	@Test(priority = 2)
	public void extractresponse() {
		String apikey = "PMAK-657937b1488618716404c9d7-88f2ee2982b1e70a2641628bbad6eba9c7";
		String res = RestAssured.given().baseUri("https://api.postman.com/workspaces").header("x-api-key", apikey)
				.when().get().then().extract().path("workspaces[14].name");
		System.out.println(res);

	}

	@Test(priority = 3)
	public void extract_response_JSONPath() {

		String apikey = "PMAK-657937b1488618716404c9d7-88f2ee2982b1e70a2641628bbad6eba9c7";
		Response res = RestAssured.given().baseUri("https://api.postman.com").basePath("/workspaces")
				.header("x-api-key", apikey).when().get().then().extract().response();
		

		JsonPath json = new JsonPath(res.asString());

		System.out.println(json.getString("workspaces[14]"));
	}

}
