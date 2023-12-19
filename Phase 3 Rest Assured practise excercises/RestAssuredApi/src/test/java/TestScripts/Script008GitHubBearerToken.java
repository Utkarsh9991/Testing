package TestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script008GitHubBearerToken {
	

	@Test(priority='1')
	public void Authorization_bearertoken() {
		
		Response res=RestAssured 
		.given().baseUri("https://api.github.com/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().extract().response();
		
		res.prettyPrint();
}
	@Test(priority='2')
	public void Authorization_bearertoken1() {
		
		Response res=RestAssured 
		.given().baseUri("https://api.github.com")
		.basePath("/repos/Utkarsh9991/Testing")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().extract().response();
		
		res.prettyPrint();
}
}
