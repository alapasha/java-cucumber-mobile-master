@add-product
Feature: Add Product

@add-product @positive
  Scenario: As a user i should be able to add new product
  Given user navigate to login page
  * user login with valid credential
  * user should be able to login
  When user add new product
  Then user publish new product
  * add product success