@us008tc001
Feature: Register Try To Change Password
 @smoke
  Scenario: TC008_user Try To Change his pasword Password
    Given I as a user navigate to GMI bank webPage
    And I as a user click to login sign
    And I as a user choose signin from dropdown menu
    When I as a user enter my UserName and Password in to opened frame
    Then I click sign in button and sign in
    And I click on My username
    And I choose password from dropdown menu
    Then I enter my current password
    Then I enter valid password as new password
    Then I enter same valid pasword for confirmation
    And I click save button
    Then I observe pop up as "Password changed!"

@smoke
  Scenario Outline: invalid password and message validation
    When I enter "<Password>" in New Password and confirmation box
    Then I see "<ErrorMessage>"
Examples:
  | Password |ErrorMessage             |
  |kadır |Password not changed!|
  |Kadir|Password not changed!|
  |Kadir123|Password not changed!|

