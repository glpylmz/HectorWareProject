Feature:Contact

  @wip
  Scenario: login
    Given the user logs in with valid credentials
    When the user should be on Contact page
    Then the New Contact page should be displayed

@wip1
    Scenario Outline: Add a new contact as"<fullName>"
      Given the user logs in with valid credentials
      When the user should be on Contact page
      Then the User should  clic on  the "New contact" button
      And  the user create a new contact information of "<fullName>" and"<CompanyName>" and"<Title>" and"<PhoneNumber>" and "<Email>"
  Examples:
    | fullName   | CompanyName    | Title  | PhoneNumber|Email       |
    |Kevin Jonson|Leicester Uni   |Prof    |0116254535  |kv67@le.ac.uk      |
    |Panos Vetro |School of Art   |Dr      |0212647567  |pv@school.art.uk   |
    |Lisa Anson  |Leicester School|Mrs      |0757493984 |la@gmail.com       |
    |Ali Alison  |Amozon          |Mr       |0757493984 |alison@amazon.co.uk|




