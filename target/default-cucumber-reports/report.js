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
  "status": "passed"
});
formatter.step({
  "name": "user click on user icon",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.UserInfoSegmentSteps.user_click_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on account menu",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.LoginSteps.user_click_on_account_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on sign in",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerManagmentSteps.user_click_on_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"username\" and \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerManagmentSteps.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on \"SignInLink\" button",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.RegistrationSteps.user_clicks_on_button(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#register\\-submit\"}\n  (Session info: chrome\u003d86.0.4240.198)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Mehmets-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:821:d881:4263:715f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/jq/c0gkl_r54_9...}, goog:chromeOptions: {debuggerAddress: localhost:63279}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c765aa0a45b15f9850033a417f6ce594\n*** Element info: {Using\u003did, value\u003dregister-submit}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat gmibank.stepdefinitions.RegistrationSteps.user_clicks_on_button(RegistrationSteps.java:83)\n\tat ✽.user clicks on \"SignInLink\" button(file:///Users/Betul/IdeaProjects/GmiBankTeam10/src/test/resources/features/CustomerManagment.feature:9)\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on My Operations link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerManagmentSteps.user_clicks_on_My_Operations_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Manage Customers link",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerManagmentSteps.user_clicks_on_Manage_Customers_link()"
});
formatter.result({
  "status": "skipped"
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
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerManagmentSteps.user_clicks_on_Create_a_new_customer_link()"
});
formatter.result({
  "status": "skipped"
});
});