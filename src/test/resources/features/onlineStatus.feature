Feature: 

	#US:
	# As a user, I should be able to change my online status and set a status message
	#
	#AC:
	# User can view Online Status
	# User can change Online Status
	# User can set a status message
	@WARE-380
	Scenario: User can view Online Status
		Given the user login with valid credentials
		When user clicks on profile avatar
		Then user should see their online set status under their name

	@WARE-389
	Scenario: User can change their online status

		Given the user login with valid credentials
		When user clicks on profile avatar
		And user clicks on set status under their name
		Then user should see a new window popped up
		And user click on "away" status