@CancelStatusUpdate
Feature: Cancel Status Update

  @CancelStatusUpdate @positive
  Scenario: user should be able to updated cancel status
    Given user navigate to login page
    * user login with valid credential
    * user accept bid price
    When user tap cancel radio button
    Then user get snack bar notification