Feature: Users should be able to login successfully

  @login
  Scenario: Users should be able to login when correct credentials entered
    Given the user navigate to login page
    When the user enters username and password
    Then the user should login successfully to the main page


  Scenario: Login with valid credentials
    Given the user login with valid credentials

  Scenario: Login with valid username
    Given  the user login with "Employee123" as username

  @wip
  Scenario Outline: Negative login
    Given the user navigate to login page
    When the user enters "<username>" and "<password>"
    Then the title should contain "login"
    Examples:
      | username    | password    |
      | Employee1   | Employee12  |
      | Employee123 | Employee1   |
      |             | Employee123 |
      | Employee1   |             |
      |             |             |