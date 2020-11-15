@0015
  Feature: User Account
    Background:
    Scenario Outline: login with customer account
      Given user open Gmi Bank website
      When user click on account menu
      And click on sign in tab
      When user enter username "<userName>", and password "<Password>"
      Then click on sign in button
      Examples:
        |  userName|Password|
        | teamel   | Yalova77@|

      @tc03
  Scenario: verify user account being populated
  When user click on My Operations dropdown menu
  And click on My accounts
  Then verify user account types and balance isdisplayed


    @tc02
      Scenario: User can view transaction
      And user click on view transaction button
        Then user can see transaction

