Feature:

	#US:
	#As a user, I should be able to log in with valid credentials
	#
	#AC:
	#All the users can log in with valid credentials
  @WARE-375

  Scenario: Users should be able to login when correct credentials entered
    Given the user navigate to login page
    When the user enters username and password
    Then the user should login successfully to the main page


  Scenario: Login with valid credentials
    Given the user login with valid credentials
  @wip
  Scenario: Login with valid username
    Given  the user login with "Employee123" as username


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