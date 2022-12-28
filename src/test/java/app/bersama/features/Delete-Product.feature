@delete-product
Feature: Delete Product

@delete-product @positive
  Scenario: As a user i should be able to delete the product
  Given user navigate to login page
  * user login with valid credential
  * user should be able to login
  When user delete product
  Then user is able to see delete pop up message