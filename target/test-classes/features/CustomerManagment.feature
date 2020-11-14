@US0010
Feature: Customer Managment Address Creation
  Background: New customer creation
    Given user is on the page
    And user click on user icon
    And user click on account menu
    And user click on sign in
    And user enters "employeeUsername" and "employeePassword"
    And user clicks on "SignInLink" button
    And user clicks on My Operations link
    And user clicks on Manage Customers link

    @TC01
    Scenario: Create a New Customer
      And user clicks on Create a new customer link



