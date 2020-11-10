@us06
Feature: Smoke Test
  Scenario: User can sign in
    Given user open Gmi Bank website
    When user click on account menu
    And click on sign in tab
    When user enter username
    And user enter password
    Then click on sign in button
    Then verify user is on home page
    When user click on user icon
    And click on user info tab
    And click on save button
    Then user info being populated
