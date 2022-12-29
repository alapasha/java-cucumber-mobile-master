@BuyProduct
  Feature: Buy Product

    @BuyProduct @positive
      Scenario: user should be able to buy product
      Given user navigate to login page
      * user login with valid credential
      When user choose product "tisu"
      Then user get alert snack bar success to buy product