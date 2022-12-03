Feature: Login
Scenario: Successfull Login With Valid Credentials
Given Chrome browser
When User opens URL "<url>"
And User enters Email as "<Email>" and password as "<Password>"
And Click on Login
Then Page Title should be "Dashboard"
When User Click NewDemo
When user click on Log Out Link
Then Page Title should now be "Login"
And Close Browser

Examples:
	| Email				    	| Password   | url																				|
	| admin@gmail.com   | 123456     | https://finix.pisystindia.com/admin/login	|
	|	admin@gmail.com 	|	123132	   | https://finix.pisystindia.com/admin/login	|
	| admin1gmail.com   | gyuu27dawuh| https://finix.pisystindia.com/admin/login	|
	| admin1gmail.com   | 123456     | https://finix.pisystindia.com/admin/login	|