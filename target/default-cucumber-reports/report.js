$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Registration.feature");
formatter.feature({
  "name": "GMI Bank Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
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
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to registration page",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_goes_to_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User leaves a field blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    },
    {
      "name": "@TC005"
    }
  ]
});
formatter.step({
  "name": "user leaves address as blank",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_leaves_address_as_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"addressErrorMessage\"",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_should_see(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});