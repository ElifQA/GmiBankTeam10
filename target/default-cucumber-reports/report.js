$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/us008_tc.feature");
formatter.feature({
  "name": "Register Try To Change Password",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@us008tc001"
    }
  ]
});
formatter.scenario({
  "name": "TC008_user Try To Change his pasword Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us008tc001"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I as a user navigate to GMI bank webPage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I as a user click to login sign",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I as a user choose signin from dropdown menu",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I as a user enter my UserName and Password in to opened frame",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click sign in button and sign in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on My username",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I choose password from dropdown menu",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter my current password",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter valid password as new password",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter same valid pasword for confirmation",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click save button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I observe pop up as \"Password changed!\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "invalid password and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter \"\u003cPassword\u003e\" in New Password and confirmation box",
  "keyword": "When "
});
formatter.step({
  "name": "I see \"\u003cErrorMessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password",
        "ErrorMessage"
      ]
    },
    {
      "cells": [
        "kadır",
        "Password not changed!"
      ]
    },
    {
      "cells": [
        "Kadir",
        "Password not changed!"
      ]
    },
    {
      "cells": [
        "Kadir123",
        "Password not changed!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "invalid password and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us008tc001"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter \"kadır\" in New Password and confirmation box",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I see \"Password not changed!\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "invalid password and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us008tc001"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter \"Kadir\" in New Password and confirmation box",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I see \"Password not changed!\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "invalid password and message validation",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@us008tc001"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter \"Kadir123\" in New Password and confirmation box",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I see \"Password not changed!\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});