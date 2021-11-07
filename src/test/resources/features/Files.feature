Feature: As a user, I should be able to upload a file, move or delete any selected file under the Files module

  AC:
  User can upload a file
  User can move or copy any selected item
  User can delete any selected item

  Background:
    Given the user is on the login page
    And the user enters the employee information
    Then the user should be able to login

  @file
  Scenario: As a user I should be able to upload a file
    When the user upload a file
    Then the user verify that the file is uploaded
