@logout
Feature: Logout

  @logout @positive

  Scenario: As a user i should be able to login and logout
    Given user navigate to login page
    When user login with valid credential
    Then user logout
    * user should be able to logout