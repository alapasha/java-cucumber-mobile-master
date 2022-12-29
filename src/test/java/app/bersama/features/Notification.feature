@notification
Feature: Notification

  @notification @positive
  Scenario: User should be able to check notification
    Given user navigate to login page
    * user login with valid credential
    * user should be able to login
    When user check notification menu
    Then user should be able to see notification list