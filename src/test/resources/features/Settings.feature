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

		        