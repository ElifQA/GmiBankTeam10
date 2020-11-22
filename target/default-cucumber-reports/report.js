$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CustomerApi.feature");
formatter.feature({
  "name": "Test all customer`s data",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllCustomerData"
    }
  ]
});
formatter.background({
  "name": "api end point is being set in response",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user provides the api end point to set the response using \"https://www.gmibank.com/api/tp-customers\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Validate All Customer`s data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllCustomerData"
    },
    {
      "name": "@customerDataTest"
    }
  ]
});
formatter.step({
  "name": "manuplate all customer`s data",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user sets the data in correspondent files",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user validate all data",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});