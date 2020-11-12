@smokeTest
Feature: User info Segment

  @us06_TC01
  Scenario: User info is displayed
    Given user open Gmi Bank website
    When user click on account menu
    And click on sign in tab
    When user enter username "username"
    And user enter password "password"
    Then click on sign in button
    Then verify user is on home page
    When user click on user icon
    And click on user info tab
    Then user info being populated

@us06_TC02
    Scenario: There should be two languages available
      Given user open Gmi Bank website
      When user click on account menu
      And click on sign in tab
      When user enter username "username"
      And user enter password "password"
      Then click on sign in button
      Then verify user is on home page
      When user click on user icon
      And click on user info tab
      Then verify there should be two languages available

@us06_TC03
Scenario: There should be an option to update firstname and lastname
  Given user open Gmi Bank website
  When user click on account menu
  And click on sign in tab
  When user enter username "username"
  And user enter password "password"
  Then click on sign in button
  Then verify user is on home page
  When user click on user icon
  And click on user info tab
  Then enter firstname "eda"
  And enter lastname "dteam10"
  And user click on save button
  Then verify updated message is displayed

  @us06_TC04

  Scenario: There should be an option to update email id adding "@" sign and ".com"
    Given user open Gmi Bank website
    When user click on account menu
    And click on sign in tab
    When user enter username "username"
    And user enter password "password"
    Then click on sign in button
    Then verify user is on home page
    When user click on user icon
    And click on user info tab
    And user enter email "e.techproed@gmail.com"
    And user click on save button
    Then verify email address contains @ and .com



