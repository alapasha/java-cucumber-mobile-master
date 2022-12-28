@product-list
Feature: Show Product List

  @product-list @positive
  Scenario: User should be able to see list of sales product
    Given user navigate to login page
    * user login with valid credential
    * user should be able to login
    When user click my sell list
    Then user redirected to my sell list page