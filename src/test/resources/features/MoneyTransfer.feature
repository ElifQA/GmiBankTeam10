@us016
  Feature: Testing Money Transfer

    Background: user account
      Given user open Gmi Bank website
      When user click on account menu
      And click on sign in tab
      When user enter username "userName", and password "password"
      Then click on sign in button
      And user click on My Operations dropdown menu
      And user click on Transfer Money link from dropdown

      @16tc01
      Scenario: user should have at least two accounts
        And user click on Transfer Money link from dropdown
        And verify user have at least two accounts

        @16tc02
        Scenario: user can select their account from dropdown
        And User can select the first account as From dropdown where they receive their money from
        And User can select the second account as To dropdown

      @16tc03
        Scenario: user select balance
        And User can select a balance that they want to proceed with
        Then user should see balance

        @16tc04
        Scenario: user provide a description for this transfer
        And User should provide a description for that transfer
        Then user should see description

        @16tc05
        Scenario: user should see successful message
          And User can select the first account as From dropdown where they receive their money from
          And User can select the second account as To dropdown
          And User can select a balance that they want to proceed with
          And User should provide a description for that transfer
          And User click on Make transfer button
        Then user should see "TransferSuccessMessage" message



