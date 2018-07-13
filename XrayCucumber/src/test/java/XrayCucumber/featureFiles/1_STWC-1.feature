@STWC-4
@REQ_STWC-1
Feature: Attempt to Create a useable Feature File

	
	@TEST_STWC-2 @TESTSET_STWC-3
	Scenario: Create Feature File
	

			Given User navigates to stackoverflow website
			And User clicks on the login button on home page
			And User enter a valid username
			And User enters a valid password
			When User clicks on the login button
			Then User should be taken to the successful login page 