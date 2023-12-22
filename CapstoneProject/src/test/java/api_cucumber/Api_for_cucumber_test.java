package api_cucumber;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Api_for_cucumber_test {
	
	public Response response;

    @Given("the base URI is {string}")
    public void setBaseURI(String baseUri) {
        RestAssured.baseURI = baseUri;
    }

    @When("I send a GET request to {string}")
    public void sendGetRequest(String endpoint) {
        response = RestAssured.when().get(endpoint);
    }

    @When("I send a POST request to {string} with the following data")
    public void sendPostRequest(String endpoint, DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> productData = data.get(0);
        this.response=
        RestAssured.given().baseUri(RestAssured.baseURI).basePath(endpoint)
                .contentType(ContentType.JSON).body(productData).when().post();
        this.response.then().statusCode(200).log().all();
    }
    @When("I send a PUT request to {string} with the following data")
    public void sendPutRequest(String endpoint, DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> productData = data.get(0);

        this.response = RestAssured.given()
                .baseUri(RestAssured.baseURI)
                .basePath(endpoint)
                .contentType(ContentType.JSON)
                .body(productData)
                .when()
                .put();
        this.response.then().log().all();
    }
    @When("I send a PUT-Update-Status request to {string} with the following data")
    public void sendputstatusrequest(String endpoint, DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> productData = data.get(0);

        this.response = RestAssured.given()
                .baseUri("http://localhost:9010")
                .basePath(endpoint)
                .contentType(ContentType.JSON)
                .body(productData)
                .when()
                .put();
        this.response.then().log().all();
    }
    
    

    @When("I send a DELETE request to {string} with the query parameter {string} equal to {int}")
    public void sendDeleteRequestWithQueryParam(String endpoint, String paramName, int paramValue) {
        response = RestAssured.given().queryParam(paramName, paramValue).when().delete(endpoint);
    }

    

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }
}


