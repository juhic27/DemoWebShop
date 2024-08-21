Feature: Invalid Login 
@InvalidLogin
Scenario: Login with with invalid details
Given  user is on the login page
When the user enters invalid details in login page
Then user gets error
