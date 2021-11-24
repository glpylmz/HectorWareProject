Feature:Contact

  @wip
  Scenario: login
    Given the user logs in with valid credentials
    When the user should be on Contact page
    Then the New Contact page should be displayed

@wip1
    Scenario Outline: Add a new contact as"<input>"
      Given the user logs in with valid credentials
      When the user should be on Contact page
      Then the User should  clic on  the "New contact" button
      And  the user create a new contact with folowing information as "<title>" and "<input>"
       Examples:
       | title      | input       |
       |fullName    |Kevin Jonson |
       |companyName |LEU          |
       |title       |Prof.        |
       |phoneNumber |0112453645   |
       |email       |kv@le.ac.uk  |



  Scenario Outline:: add the new property under the new contact as <AddInput>
    When the user should create a "<AddInput>"  section on contact page
    Examples:
      |AddInput    |
      |Address     |
      |Gender      |
      |Location    |
      |Birthday    |
      |Date of death |
      |Nickname    |
      |Phone       |
      |Anniversary |
      |Email       |
      |Website     |
      |Notes       |
      |TimeZone      |
      |Socail Network|
      |Spoken Language|
      |Federated Cloud ID|
      |Instant messaging|
    And the user should add adrress detatils on the created contact
    Then the user should create a group under Contact
    And the user should add the selected contact into the group
