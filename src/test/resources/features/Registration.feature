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
    And user enters a valid username "registrationUsername"
    And user enters a valid email "email"
    And user enters a valid password "registrationPassword"
    And user enters the same password for confirmation "registrationPassword"
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
    Then user should see "emailErrorMessage" message

  @TC009
  Scenario: User leaves a field blank
    Given user leaves new password as blank
    Then user should see "newPasswordErrorMessage" message


  @TC0010
  Scenario: User leaves a field blank
    Given user leaves new password confirmation as blank
    Then user should see "newPasswordconfirmationErrorMessage"


    @TC0011
    Scenario: User enters an SSN with char in it
      Given user enters a SSN with char in the beginning
      Then user should see "ssnErrorMessage" message

  @TC0012
  Scenario: User enters an SSN with char in it
    Given user enters a SSN with char in the middle
    Then user should see "ssnErrorMessage" message

  @TC0013
  Scenario: User enters an SSN with char in it
    Given user enters a SSN with char at the end
    Then user should see "ssnErrorMessage" message

    @TC0014
    Scenario: User enters a mobile phone number with a char
      Given user enters a phone number with a char in the begining
      Then user should see "mobilephoneErrorMessage" message

  @TC0015
  Scenario: User enters an email without @ sign and .com extension
    Given user enters an email without @ sign
    Then user should see "emailErrorMessage" message
















