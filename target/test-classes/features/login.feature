@login

  Feature: just fake data generation

    Background: Sing in
    Scenario: anyone can work on
      Given user open Gmi Bank website
      When user click on account menu
      And click on sign in tab
      When user enter username "username"
      And user enter password "password"
      Then click on sign in button


