$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_006_TC_01.feature");
formatter.feature({
  "name": "Smoke Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us06"
    }
  ]
});
formatter.scenario({
  "name": "User can sign in",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us06"
    }
  ]
});
formatter.step({
  "name": "user open Gmi Bank website",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.user_open_Gmi_Bank_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on account menu",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.user_click_on_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in tab",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.click_on_sign_in_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.user_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.user_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.verify_user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.user_click_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on user info tab",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.click_on_user_info_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user info being populated",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.US_06_TC_01StepDefinitions.user_info_being_populated()"
});
formatter.result({
  "status": "passed"
});
});