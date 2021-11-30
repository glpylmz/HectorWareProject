@mamlakat
Feature: As a user, I should be able to upload a file under the Files module
  Background:
    Given the user navigate to login page
    And the user logged in

  Scenario: user can upload txt, doc, docx, pdf, jpg, and png files
    When the user clicks plus button and selects "MYFILE.txt"
    Then "MYFILE" is in the All files tab


  Scenario: user cannot upload a file with existing filename
    When the user clicks plus button and selects "MYFILE.txt"
    Then "1 file conflict" message is displayed


  Scenario: when user tries to upload a file with existing filename, the user can choose to keep already existing file
    When the user clicks plus button and selects "MYFILE.txt"
    And the user selects already existing file
    Then no duplicate file name in All files tab


  @malak
  Scenario: user can move any selected file in "All files"
    When the user right clicks "MYFILE" for move or copy option
    And moves the file to a new folder "MyFolder"
    Then "MYFILE" is in that folder




