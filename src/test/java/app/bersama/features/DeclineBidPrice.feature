@DeclineBidPrice
Feature: Decline Bid Price

  @DeclineBidPrice @positive
  Scenario: user should be able to decline bid price
    Given user navigate to login page
    * user login with valid credential
    When user decline bid price
    Then user get allert