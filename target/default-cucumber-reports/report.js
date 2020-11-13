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
  "name": "User enters an SSN with char in it",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    },
    {
      "name": "@TC0011"
    }
  ]
});
formatter.step({
  "name": "user enters a SSN with char in the beginning",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_enters_a_SSN_with_char_in_the_beginning()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"ssnErrorMessage\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_should_see_message(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Your SSN is invalid]\u003e but was:\u003c[translation-not-found[Your SSN is required]]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat gmibank.stepdefinitions.RegistrationSteps.user_should_see_message(RegistrationSteps.java:99)\n\tat ✽.user should see \"ssnErrorMessage\" message(file:///Users/Betul/IdeaProjects/GmiBankTeam10/src/test/resources/features/Registration.feature:77)\n",
  "status": "failed"
});
});