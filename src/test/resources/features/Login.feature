Feature: Users should be able to login successfully

  @login
  Scenario: Users should be able to login when correct credentials entered
    Given the user navigate to login page
    When the user enters username and password
    Then the user should login successfully to the main page
  @wip
    Scenario: Login with valid credentials
      Given the user login with valid credentials



