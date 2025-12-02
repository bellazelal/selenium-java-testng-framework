
Feature: Google Search

  Scenario: Search for a keyword
    Given I am on the Google home page
    When I search for "Labubu"
    Then the page title should contain "Labubu"


