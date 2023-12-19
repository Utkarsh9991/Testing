package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PaypalAuth2 {
	String accessToken;
	@Test(priority='1')
	public void Token() {
		String clientid="AT-Ox6eZEkavSeyX1C5gZI8huILWyb19oZAEhsPyii3oa7tJChv3qq18hGG2CHN3YbscSxsrmoge8ikp";
	    String clientsecret="EKxPFuakdWbW3LNq50vnub2MPmbv3dcdt7NR2Zn0lzbGpUfLZEW2-TU640_J2Xd1Hjw60mbarlLMOGg7";
	    Response res=RestAssured
	    .given()
	    .baseUri("https://api-m.sandbox.paypal.com")
	    .basePath("v1/oauth2/token")
	    .auth().preemptive().basic(clientid, clientsecret)  
	    .param("grant_type", "client_credentials")
	    .when().post();
//	    res.prettyPrint();
	    Assert.assertEquals(res.statusCode(), 200);
	    
	    accessToken=res.body().path("access_token");
	    System.out.println(accessToken);
	}
	@Test(priority='2')
	public void paypalauthrequest() {
		Response res =RestAssured
				.given()
				.baseUri("https://api-m.sandbox.paypal.com")
				.basePath("v1/invoicing/invoices")
				.queryParam("page", "3")
				.queryParam("page_size", "4")
				.queryParam("total_count_required", true)
				.auth().oauth2(accessToken)
				.when().get();
		res.prettyPrint();
				
						
				
	}

}
