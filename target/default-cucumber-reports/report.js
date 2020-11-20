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
formatter.background({
  "name": "user account",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user open Gmi Bank website",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_open_Gmi_Bank_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on account menu",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_click_on_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in tab",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.click_on_sign_in_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username \"userName\", and password \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserAccountSteps.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on My Operations dropdown menu",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserAccountSteps.user_click_on_My_Operations_dropdown_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Transfer Money link from dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferSteps.user_click_on_Transfer_Money_link_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User enters letter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us016"
    },
    {
      "name": "@16tc08"
    }
  ]
});
formatter.step({
  "name": "User enters balance with letters",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferSteps.user_enters_balance_with_letters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Make transfer button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferSteps.user_click_on_Make_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see onlyNumberMessage",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.MoneyTransferSteps.user_should_see_onlyNumberMessage()"
});
formatter.result({
  "status": "passed"
});
});