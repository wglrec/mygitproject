Feature: Login and Logout Functionality
Scenario: As an Admin is should login with all privileges
Given The browser is launched and we navigate to url
 When We enter username and password
And Click an login Button
Then It should display welcome Admin msg
