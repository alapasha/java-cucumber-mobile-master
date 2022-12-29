@SuccessStatusUpdate
Feature: Success Update Status

  @SuccessStatusUpdate @positive
  Scenario: user should be able to updated success status
    Given user navigate to login page
    * user login with valid credential
    * user accept bid price
    When user tap success radio button