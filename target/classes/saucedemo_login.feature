

Feature: SauceDemo Login

  Scenario: Valid user can login successfully
    Given I am on the SauceDemo login page
    When I login with valid credentials
    Then I should see the products page