@CustomerManagement

  Feature: An employee can manage customers

    Scenario: All customers should show up on manage customers module
      When user open Gmi Bank website
      And user click on accountMenu
      And user click on the signinLink
      Then User sign in as an admin
      When user click on Administration Module
      Then user click on User Managment section
