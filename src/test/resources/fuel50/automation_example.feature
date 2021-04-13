Feature: As an automation engineer, I can pass the Fuel50 test
  Fuel50 is eager to see how great of a tester you are!
  Let's take this time to automate some cases in http://the-internet.herokuapp.com/login

  Scenario: Successful login works
    Given I'm a user called "tomsmith"
    And I'm using "SuperSecretPassword!" as a password
    When I open the login form and type my credentials
    Then I should be successfully logged in

  Scenario: Wrong password shows me an error
    Given I'm a user called "tomsmith"
    And I'm using "WhateverWrongPassword" as a password
    When I open the login form and type my credentials
    Then the website shows me an error saying "Your password is invalid!"
