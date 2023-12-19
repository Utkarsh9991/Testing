Feature: Github api test via restAssured
	
Scenario: Get all github repo via bearertoken 

	Given User enter the base URL and Authorization
	When User executes HTTP method
	Then Validate the response status code