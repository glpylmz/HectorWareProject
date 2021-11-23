Feature:Contact

  @wip
  Scenario: login
    Given the user logs in with valid credentials
    When the user should be on Contact page
    Then the New Contact page should be displayed


    Scenario:

      Given the user logs in with valid credentials
      When the user should be on Contact page
      Then the User can create a new contact
      Then the user should gorup the selected contact under Contact module
