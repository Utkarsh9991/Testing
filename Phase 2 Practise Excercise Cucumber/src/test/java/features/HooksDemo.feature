@all
Feature: Testing NinjaDemo application

  Background: 
    Given I am on tutorialNinja Homepage

  @regression
  Scenario: 
    Then I enter Input for the search box
    And I click on search button
    And I close browser

  @regression
  Scenario: 
    And I click on Add to cart button
    And I close browser

  @db
  Scenario: 
    And I click on Checkout button
    And I close browser
