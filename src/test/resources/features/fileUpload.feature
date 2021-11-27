
Feature: As a user, I should be able to upload a file under the Files module
@malak
  Scenario: user can upload txt, doc, docx, pdf, jpg, and png files
    Given the user navigate to login page
    And the user logged in
    When the user clicks plus button and selects "MYFILE.txt"
    Then "MYFILE" is in the All files tab





