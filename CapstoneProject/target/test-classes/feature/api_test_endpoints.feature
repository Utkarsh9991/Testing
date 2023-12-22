Feature: API Testing

  Scenario: Retrieve all products
    Given the base URI is "http://localhost:9010"
    When I send a GET request to "get-products"
    Then the response status code should be 200

  Scenario: Retrieve all registered users
    Given the base URI is "http://localhost:9010"
    When I send a GET request to "get-users"
    Then the response status code should be 200

  Scenario: Add a product
    Given the base URI is "http://localhost:9010"
    When I send a POST request to "add-product" with the following data
      | id  | image     | name      | category       | brand    | status | price |
      | 113 | dolo.jpeg | Dolo685mg | Fever,Headache | Medicine |      1 |   156 |
       Then the response status code should be 200
   

  Scenario: Update a product
    Given the base URI is "http://localhost:9010"
    When I send a PUT request to "update-product" with the following data
     	| id  | image      | name        | category       | brand    | status | price |
      | 113 | dolo2.jpeg | Dolo-685-mg | Fever,Headache | Medicine |      1 |   250 |
    Then the response status code should be 200

  Scenario: Update a product status
    Given the base URI is "http://localhost:9010"
    When I send a PUT-Update-Status request to "update-product-status" with the following data
      | id  | image      | name        | category       | brand    | status | price |
      | 113 | dolo2.jpeg | Dolo-685-mg | Fever,Headache | Medicine |      0 |   250 |
    Then the response status code should be 200

  Scenario: Delete a product
    Given the base URI is "http://localhost:9010"
    When I send a DELETE request to "delete-product" with the query parameter "id" equal to 113
    Then the response status code should be 200
