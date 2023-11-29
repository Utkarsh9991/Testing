Feature: Testing rediff page

  Background: 
    Given I open the browser and enter URL
    Then I capture the title of the page
    When I enter username and password
    Then I click on login button

  Scenario:
    And I should see an Error message
    Then I click on Click Here link
    And I close the browser

  Scenario: 
    Then I click on Create a Rediffmail account
    Then I capture the title of the page
    And I close the browser