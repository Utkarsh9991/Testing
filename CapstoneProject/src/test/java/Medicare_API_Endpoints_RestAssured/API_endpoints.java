package Medicare_API_Endpoints_RestAssured;


import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class API_endpoints {
	@Test(priority='1')
	public void allproducts() { 
		RestAssured
		.given().baseUri("http://localhost:9010").basePath("get-products").when().get().then().statusCode(200).log().all();
		
	}
	@Test(priority='2')
	public void all_registered_users() { 
		RestAssured
		.given().baseUri("http://localhost:9010").basePath("get-users").when().get().then().statusCode(200).log().all();

}
	@Test(priority='3')
	public void add_products() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("id","113");
		map.put("image","dolo.jpeg");
		map.put("name", "Dolo685mg");
		map.put("category", "Fever,Headache");
		map.put("brand", "Medicine");
		map.put("status", "1");
		map.put("price","156");
		
		RestAssured
		.given().baseUri("http://localhost:9010")
		.basePath("add-product")
		.contentType("application/json")
		.body(map)
		.when().post()
		.then().statusCode(200).log().all();

		
	}
	
		
	@Test(priority='4')
	public void update_products() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("id","113");
		map.put("image","dolo2.jpeg");
		map.put("name", "Dolo-685-mg");
		map.put("category", "Fever,Headache");
		map.put("brand", "Medicine");
		map.put("status", "1");
		map.put("price","250");
		
		RestAssured
		.given().baseUri("http://localhost:9010")
		.basePath("update-product")
		.contentType("application/json")
		.body(map)
		.when().put()
		.then().statusCode(200).log().all();

		
	}
	@Test(priority='5')
	public void update_products_status() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("id","113");
		map.put("image","dolo2.jpeg");
		map.put("name", "Dolo-685-mg");
		map.put("category", "Fever,Headache");
		map.put("brand", "Medicine");
		map.put("status", "0");
		map.put("price","250");
		
		RestAssured
		.given().baseUri("http://localhost:9010")
		.basePath("update-product-status")
		.contentType("application/json")
		.body(map)
		.when().put()
		.then().statusCode(200).log().all();

		
	}
	@Test(priority='6')
	public void delete_products() {
	   RestAssured
       .given()
           .queryParam("id", 113) 
       .when()
           .delete("http://localhost:9010/delete-product")
       .then()
           .statusCode(200)
           .log()
           .all();
}

	
	
	

	
}
