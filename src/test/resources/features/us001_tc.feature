@us001tc001
  Feature: Register Page Test

    Scenario: TC001_user enters valid data to register
      Given I as a user navigate to GMI bank webPage
      And I as a user click to login sign
      And I as a user choose register from dropdown menu
      Then I as a user enter "261-54-8674" to ssn box
      #Then i validate no eroor message observed
      When I enter a valid name that contains chars and cannot be blank.
      Then I enter a valid lastname that contains chars and it is a required field.
      Then I can provide chars and digits to describe a valid address along with zip code.
      Then I should provide 10 digit-long mobilephone number as a required field respecting the "-"
      Then I enter a valid username that contains chars and it is a required field.
      And I provide a valid email format that contains "@", ".com" extensions
      Then I enter a valid firstPassword that contains chars and it is a required field.
      Then I enter a valid secondPassword that contains chars and it is a required field.
      And i click submit button