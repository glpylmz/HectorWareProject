@WARE-352
Feature: the user can reach every personal information

  Background:
    Given the user navigate to login page
    Given the user logged in
    Given the user should be on settings page

  @WARE-384
  Scenario Outline: the user can see personal information under the settings <title>
    Then the user can see "<title>" on this page
    Examples:
      | title        |
      | Avatar       |
      | Full name    |
      | Email        |
      | Language     |
      | Phone number |
      | Address      |
      | Locale       |
      | Website      |
      | Twitter      |


  @WARE-386
  Scenario: User can change profile picture via clicking on "Select from files" icon
    When the user click on the Select from files button
    And the user choose the "pic" from inside folder
    Then the user should see user picture avatar on the page

  @WARE-387
  Scenario: The User can upload a file after tried to upload wrong type of file
    When the user click on the Upload new button and choose the "invalid" from computer
    Then the user will see error message
    When the user click on the Upload new button again