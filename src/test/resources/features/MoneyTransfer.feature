@us016
  Feature: Testing Money Transfer



    @001
    Scenario: Money Transfer
      Given user should be in the Money Transfer page
      Then User should have at least 2 accounts.
      And User can select the first account as From dropdown where they receive their money from.
      And User can select a balance that they want to proceed with.
      And User should provide a description for that transfer.
      Then User can make sure transfer is done successfully validating the message  an amount of the transaction.
