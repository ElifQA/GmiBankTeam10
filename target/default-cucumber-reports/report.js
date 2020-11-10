$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MoneyTransfer.feature");
formatter.feature({
  "name": "Testing Money Transfer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us016"
    }
  ]
});
formatter.scenario({
  "name": "Money Transfer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us016"
    },
    {
      "name": "@001"
    }
  ]
});
formatter.step({
  "name": "user should be in the Money Transfer page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_should_be_in_the_Money_Transfer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should have at least 2 accounts.",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_should_have_at_least_accounts(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can select the first account as From dropdown where they receive their money from.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_can_select_the_first_account_as_From_dropdown_where_they_receive_their_money_from()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can select a balance that they want to proceed with.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_can_select_a_balance_that_they_want_to_proceed_with()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should provide a description for that transfer.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_should_provide_a_description_for_that_transfer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can make sure transfer is done successfully validating the message  an amount of the transaction.",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_can_make_sure_transfer_is_done_successfully_validating_the_message_an_amount_of_the_transaction()"
});
formatter.result({
  "status": "passed"
});
});