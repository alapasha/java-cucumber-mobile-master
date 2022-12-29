@profile
Feature: Profile

  @sellinglist @positive
  Scenario: As a user i should be able to see selling list
    Given user navigate to login page
    When user login with valid credential
    Then user should be able to login
    * user navigate to my selling list
    * user able to check the list