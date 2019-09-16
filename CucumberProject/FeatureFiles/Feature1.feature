Feature: As a User I want to test login features

  Scenario: To test login    scenario with valid credentials
    Given Application is up and running
    When I enter valid credentials
    Then I should be logged in successfully
