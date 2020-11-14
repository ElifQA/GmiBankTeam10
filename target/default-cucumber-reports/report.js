$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CustomerManagment.feature");
formatter.feature({
  "name": "Customer Managment Address Creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US0010"
    }
  ]
});
formatter.background({
  "name": "New customer creation",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the page",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_is_on_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on user icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.user_click_on_user_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on account menu",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_click_on_account_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on sign in",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters \"employeeUsername\" and \"employeePassword\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on \"SignInLink\" button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_clicks_on_button(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on My Operations link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on Manage Customers link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Create a New Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US0010"
    },
    {
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "name": "user clicks on Create a new customer link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});