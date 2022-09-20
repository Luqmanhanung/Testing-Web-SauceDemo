Feature: login
  Scenario: success logged in with valid user
    Given I am on the login page
    When I input username with "standard_user"
    And I input password with "secret_sauce"
    And I click login button
    Then I am directed to inventory page