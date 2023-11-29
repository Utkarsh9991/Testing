#THis mean if this tag is called, all the scenario will run
@all
Feature: Testing on NinjaDemo application

  Background: 
    Given I am on tutorialNinja Homepage

  @login @smoke
  Scenario Outline: Test username and password for login page
    Then I click on my account link
    When I click on login link
    Then I will be on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click login button

    Examples: 
      | EmailId              | password |
      | demouser1@gmail1.com |    12345 |

  #New scenarios for search, add to cart, checkout, logout and close browser.
  @search @regression
  Scenario: 
    Then I enter Input for the search box
    And I click on search button
    And I close browser

  @addtocart @regression
  Scenario: 
    And I click on Add to cart button
    And I close browser

  @checkout @functional
  Scenario: 
    And I click on Checkout button
    And I close browser

  @logout @smoke
  Scenario: 
    Then I click on my account link
    And I click on logout link
    And I close browser
