Feature: Test the skillary app
1) Valid case
2) Invalid case

#i use background to make work with common things
Background:
Given I should open the browser and navigate to the loginpage of skillary 

# whatever we put in" " is used as an value for the application
#Scenario: To test the Login in with user credentials
#When Enter the username "user"
#And Enter the password "user"
#And Click the login button
#Then I should see the username as "Harry Den"

#Scenario: To test the Login in with admin credentials
#When Enter the username "admin"
#And Enter the password "admin"
#And Click the login button
#Then I should see the admin as "SkillRary Admin"

#when we have multipletest cases we use scenario outline
@PositiveTesting
Scenario Outline: To test login with all positive data
When Enter the username "<user>"
And Enter the password "<pwd>"
And Click the login button
Then I should see the username as "<name>"

#this is to give all the data together just like datadriven testing in excel sheet
Examples:
|user|pwd|name|
|user|user|Harry Den|
|user|user|Harry Den|
|admin|admin|SkillRary Admin|



#@ is a tag /tag will exceute only the thing that we mention 
@NegativeTesting
Scenario: To test the Login in with invalid credentials
When Enter the username "balisha"
And Enter the password "balisha"
And Click the login button
Then I should navigate to the page "Register"