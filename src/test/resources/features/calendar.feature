
Feature: Calendar event
#    US
#
#    As a user, I should be able to see the Daily-Weekly-Monthly calendar view under the Calendar module
#
#    AC
#    Under the Calendar module, a pop-up should appear when I click on the Hamburger menu
#    The hamburger menu should include Day, Week, Month, List options
#    When clicking on Day, should display Daily calendar view
#    When clicking on Week, should display Weekly calendar view
#    When clicking on Month, should display Monthly calendar view
#    When clicking on List, should display List of calendar events
  Background:
    Given the user login with valid credentials

  Scenario: Daily-Weekly-Monthly Should be viewed
    Given the user navigate to "Calendar" page
    When the user clicks on Hamburger menu button
    Then the  Hamburger menu button should include the expected options
      | Day   |
      | Week  |
      | Month |
      | List  |

      Scenario: Click Day option
        Given the user navigate to "Calendar" page
        When the user clicks on Hamburger menu button
        And the user clicks on Hamburger "Day" option
        Then the Daily calendar should be display

  Scenario: Click Week option
    Given the user navigate to "Calendar" page
    When the user clicks on Hamburger menu button
    And the user clicks on Hamburger "Week" option
    Then the Weekly calendar should be displayed

  Scenario: Click Month option
    Given the user navigate to "Calendar" page
    When the user clicks on Hamburger menu button
    And the user clicks on Hamburger "Month" option
    Then the Monthly calendar should be displayed
  @WARE-350
  Scenario: Click List option
    Given the user navigate to "Calendar" page
    When the user clicks on Hamburger menu button
    And the user clicks on Hamburger "List" option
    Then the List calendar should be displayed