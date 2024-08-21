Feature: Login with multiple input
@multiple
Scenario Outline: Login with different values
Given user is on the login page for different user
When user enter "<username>" and "<password>"
Then user redirect to homepage

Examples: 
|    username          |       password      |
|    username1         |       password1     |
|    username2         |       password2     |
|    username3         |       password3     |