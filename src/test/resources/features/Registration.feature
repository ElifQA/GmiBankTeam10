@Registration
Feature: GMI Bank Registration

  Background:
    Given user is on the page
    And user goes to registration page
    @TC001
  Scenario: User registers to the bank account
    And user enters a valid SSN "ssn"
    And user enters a valid first name "firstname"
    And user enters a valid last name "lastname"
    And user enters a valid address "address"
    And user enters a mobile phone number "mobilephone"
    And user enters a valid username "username"
    And user enters a valid email "email"
    And user enters a valid password "password"
    And user enters the same password for confirmation "password"
    Then user clicks on 'Register' button
    Then user should see a success message

      @TC002
  Scenario: User leaves a field blank
     And user leaves the SSN checkbox blank
     Then user should see "ssnErrorMessage" message

      @TC003
   Scenario: User leaves a field blank
     Given user leaves first name text box blank
     Then user should see "firstNameErrorMessage"

      @TC004
   Scenario: User leaves a field blank
     Given user leaves last name as blank
     Then user should see "lastNameErrorMessage"

  @TC005
  Scenario: User leaves a field blank
    Given user leaves address as blank
    Then user should see "addressErrorMessage"

  @TC006
  Scenario: User leaves a field blank
    Given user leaves mobile phone number as blank
    Then user should see "mobilephoneErrorMessage"

  @TC007
  Scenario: User leaves a field blank
    Given user leaves username as blank
    Then user should see "usernameErrorMessage"

  @TC008
  Scenario: User leaves a field blank
    Given user leaves email as blank
    Then user should see "emailErrorMessage"

  @TC009
  Scenario: User leaves a field blank
    Given user leaves new password as blank
    Then user should see "newPasswordErrorMessage"

  @TC0010
  Scenario: User leaves a field blank
    Given user leaves new password confirmation as blank
    Then user should see "newPasswordconfirmationErrorMessage"







