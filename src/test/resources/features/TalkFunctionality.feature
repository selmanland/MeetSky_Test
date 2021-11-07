@Talk
Feature: Talk Functionality MeetSky


  Background:
    Given the user is on the login page
    And the user enters the employee information
    Then the user should be able to login


  Scenario: Talk Functionality Conversation And start And leave video Call
    Given Meetsky Home page should contains title "Files - Meetsky - QA"
    Then Click on Talk tab
    When Meetsky Talk page should contains title "Talk - Meetsky - QA"
    And Click on the burger menu button
    Then verify display all conversation list under the Talk module
    Then Click on the Plus Sign
    Then Send any Conversation name to searchBox "Conversation_Name"
    And  Click on Add participants Button
    And Click on  Employee10
    Then Click on Create Conversation Button
    Then Verify the Title Contains "Employee10 - Talk - Meetsky - QA"
    When User click on the start call button
    Then verify videcall screen is Displayed
    And click on the leave button
    Then  Then verify is Talk page is displayed

