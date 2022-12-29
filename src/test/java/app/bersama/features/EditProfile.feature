@EditName
Feature: EditName

  @EditName @positive
  Scenario: As a user i should be able to login
    Given user navigate to login page
    When user login with valid credential
    Then user should be able to login
    * user navigate to profile page
    * user click username
    * user edit username
    * user get verify edit status