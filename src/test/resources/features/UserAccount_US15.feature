@0015
  Feature: User Account-System should allow user to manage their account
    Background: user account
      Given user open Gmi Bank website
      When user click on account menu
      And click on sign in tab
      When user enter username "userName", and password "password"
      Then click on sign in button
      And user click on My Operations dropdown menu
      And click on My accounts


     @tc01
      Scenario: verify user account
       Then verify user account types and balance isdisplayed

    @tc02
      Scenario: User can view transaction
      And user click on view transaction button
      Then user can see transaction

