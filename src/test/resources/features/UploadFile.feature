Feature: User should upload file

	Background:
		Given the user navigate to login page
		Given the user logged in


	@WARE-394
	Scenario: The user can upload valid files
		When the user click on plus icon
		And the user can upload a file by clicking the upload file
		Then the user should be able to see the selected file on the page