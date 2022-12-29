@AcceptBidPrice
  Feature: Accept Bid Price

    @AcceptBidPrice @positive
      Scenario: user should be able to accept bid price
      Given user navigate to login page
      * user login with valid credential
      When user accept bid price
      Then user get allert message