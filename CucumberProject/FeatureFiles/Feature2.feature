Feature: As a user I want to test login feature with multiple data sets

  Scenario Outline: To test login feature with multiple data sets
    Given Application is up and running
    When I enter <username> and <password>on login page
    Then I should be logged in successfully

    Examples: 
      | username    | password    |
      | anandbhayre | test@acv    |
      | anandabcdd  | temp@sef    |
      | shital      | shital@123  |
      | meghraj     | meghraj@123 |
      | Shriya      | shriya@123  |
