@ziya
Feature: User can not log in with invalid credentils
Background:
  When user open Gmi Bank website
  And user click on accountMenu
  And user click on the signinLink

  @US5_TC1
  Scenario: User can not login with invalid username
  When user enter invalid user name and valid password
  Then user see displaied error message

  @US5_TC2
  Scenario: User can not login with invalid password
    When user enter valid user name and invalid password
    Then user see displaied error message

  @US5_TC3

  Scenario: User can not login with invalid username and invalid password
    When user enter in valid user name and invalid password
    Then user see displaied error message

  @US5_TC4
  Scenario: User can not login with invalid username and invalid password
    When user enter in valid user name and invalid password
    Then user see displaied error message
    Then user can click on forget option and validate forget password option is available

  @US5_TC5
  Scenario: User should have register new account option
    When user enter in valid user name and invalid password
    Then user see displaied error message
    Then user can click on register new account option and see registration form