@Users
  Feature: Users info
    Background: Admin manages the customer
      Given user is on the page
      And user click on account menu
      And user click on the signinLink
      And user signs in as an Admin
      And user click on Administration Module
      And user click on User Managment section

      @US_18TC01
      Scenario: verifying information of the customer
        Then verify First Name Last Name Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date are there

      @US_18TC02
      Scenario: verifying View button
        Then verify a clickable View button is there

      @US_18TC03
      Scenario: verifying Edit button
        Then verify a clickable Edit button

      @US_18TC04
      Scenario: editing login name
        And users clicks on customer's Edit button
        Then edit the login name and clicks on Save button

      @US_18TC05
      Scenario: editing first name
        And users clicks on customer's Edit button
        Then edit the first name and click on Save button

      @US_18TC06
      Scenario: editing last name
        And users clicks on customer's Edit button
        Then edit the last name and click on Save button

      @US_18TC07
      Scenario: editing email
        And users clicks on customer's Edit button
        Then edit the email and click Save button









