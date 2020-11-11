$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "just fake data generation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DemoData"
    }
  ]
});
formatter.scenario({
  "name": "anyone can work on",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DemoData"
    },
    {
      "name": "@login"
    }
  ]
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
  "name": "user enter username \"username\"",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_enter_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_enter_password(java.lang.String)"
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
});