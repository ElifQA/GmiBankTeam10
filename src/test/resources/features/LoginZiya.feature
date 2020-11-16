@ziya
Feature: GMI Bank Login


  @TC0010
  Scenario: User can not login with invalid credantial
  When user open Gmi Bank website
  And user click on accountMenu
  And user click on the signinLink
  Then user click on the username box and enter invalid username






#    And user goes to registration page
#    And user enters a valid SSN "ssn"
#    And user enters a valid first name "firstname"
#    And user enters a valid last name "lastname"
#    And user enters a valid address "address"
#    And user enters a mobile phone number "mobilephone"
#    And user enters a valid username "username"
#    And user enters a valid email "email"
#    And user enters a valid password "password"
#    And user enters the same password for confirmation "password"
#    Then user clicks on 'Register' button
#    Then user should see a success message