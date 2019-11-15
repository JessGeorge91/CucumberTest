Feature: Open Demo Cart Login


Scenario: Verify open cart login page
Given user in Open cart homepage
When user verify the homepage title
Then customer waits for 5 seconds
When user click on Login menu from My account section
Then customer waits for 5 seconds
Then user verifies the login page
And user close the browser
