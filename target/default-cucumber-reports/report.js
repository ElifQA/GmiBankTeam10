<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Registration.feature");
formatter.feature({
  "name": "GMI Bank Registration",
=======
<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "just fake data generation",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MoneyTransfer.feature");
formatter.feature({
  "name": "Testing Money Transfer",
>>>>>>> master
>>>>>>> master
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@Registration"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_is_on_the_page()"
=======
<<<<<<< HEAD
      "name": "@DemoData"
=======
      "name": "@us016"
>>>>>>> master
    }
  ]
});
formatter.scenario({
<<<<<<< HEAD
  "name": "anyone can work on",
=======
  "name": "Money Transfer",
>>>>>>> master
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
<<<<<<< HEAD
      "name": "@DemoData"
    },
    {
      "name": "@login"
=======
      "name": "@us016"
    },
    {
      "name": "@001"
>>>>>>> master
    }
  ]
});
formatter.step({
  "name": "user should be in the Money Transfer page",
  "keyword": "Given "
});
formatter.match({
<<<<<<< HEAD
  "location": "gmibank.stepdefinitions.LoginSteps.user_open_Gmi_Bank_website()"
=======
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_should_be_in_the_Money_Transfer_page()"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should have at least 2 accounts.",
  "keyword": "Then "
});
formatter.match({
<<<<<<< HEAD
  "location": "gmibank.stepdefinitions.LoginSteps.user_click_on_account_menu()"
=======
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_should_have_at_least_accounts(java.lang.Integer)"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can select the first account as From dropdown where they receive their money from.",
  "keyword": "And "
});
formatter.match({
<<<<<<< HEAD
  "location": "gmibank.stepdefinitions.LoginSteps.click_on_sign_in_tab()"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user goes to registration page",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_goes_to_registration_page()"
=======
  "name": "user enter username \"username\"",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_enter_username(java.lang.String)"
=======
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_can_select_the_first_account_as_From_dropdown_where_they_receive_their_money_from()"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user enter password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_enter_password(java.lang.String)"
=======
  "name": "User can select a balance that they want to proceed with.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_can_select_a_balance_that_they_want_to_proceed_with()"
>>>>>>> master
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
<<<<<<< HEAD
formatter.scenario({
  "name": "User leaves a field blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    },
    {
      "name": "@TC004"
    }
  ]
});
formatter.step({
  "name": "user leaves last name as blank",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_leaves_last_name_as_blank()"
=======
formatter.step({
<<<<<<< HEAD
  "name": "click on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.click_on_sign_in_button()"
=======
  "name": "User should provide a description for that transfer.",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_should_provide_a_description_for_that_transfer()"
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
formatter.step({
<<<<<<< HEAD
  "name": "user should see \"error message\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_should_see(java.lang.String)"
=======
  "name": "User can make sure transfer is done successfully validating the message  an amount of the transaction.",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferDefinitions.user_can_make_sure_transfer_is_done_successfully_validating_the_message_an_amount_of_the_transaction()"
>>>>>>> master
>>>>>>> master
});
formatter.result({
  "status": "passed"
});
});