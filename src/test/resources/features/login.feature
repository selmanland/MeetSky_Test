@login
Feature: user should be able to login

  Scenario: login as a employee
    Given the user is on the login page
    And the user enters the employee information
    Then the user should be able to login
