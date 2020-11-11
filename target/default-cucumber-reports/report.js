$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserInfoSegment.feature");
formatter.feature({
  "name": "User info Segment",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "name": "There should be an option to update email id adding \"@\" sign and \".com\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    },
    {
      "name": "@us06_TC04"
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
formatter.step({
  "name": "verify user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.verify_user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.user_click_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on user info tab",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.click_on_user_info_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email \"e.techproed@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.user_enter_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify email address contains @ and .com",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.verify_email_address_contains_and_com()"
});
formatter.result({
  "status": "passed"
});
});