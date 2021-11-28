Feature:New conversation automated successfully

  Background:
    Given the user navigate to login page
    Given  the user logged in
    Given the user should be on talk module

 @ela
  Scenario:Basic users should be able to create a new conversation
    Then all conversation lists under Talk module
@ela
  Scenario:A pop-up should appear when the + sign is clicked
    When the users click + sign
    Then A pop-up should appear
    And A pop-up should ask the user enter the conversation name
    And A pop-up should ask the user to add parcipants
    And newly created conversation should appear on the left

