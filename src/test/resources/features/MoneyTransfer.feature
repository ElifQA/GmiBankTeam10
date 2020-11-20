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
        Then User should see success Message

          @16tc06
          Scenario: User leaves a field blank
            And User leaves balance as blank
            And User click on Make transfer button
            Then User should see This field is required message

          @16tc07
            Scenario: User enters more than five digits
              And User enters balance more than five digits
              And User click on Make transfer button
              Then User should see onlyFiveDigitMessage

          @16tc08
          Scenario: User enters letter
            And User enters balance with letters
            And User click on Make transfer button
            Then User should see onlyNumberMessage

          @16tc09
          Scenario: User leaves a field blank
            And User leaves description box as blank
            And User click on Make transfer button
            Then User should see This field is required message


