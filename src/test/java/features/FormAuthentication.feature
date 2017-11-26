Feature: Login feature

Background: 
Given "chrome" browser is selected
Then "https://the-internet.herokuapp.com/" is launched
Then verify "https://the-internet.herokuapp.com/" is launched
When "Form Authentication" link is clicked
Then verify "https://the-internet.herokuapp.com/login" is launched


Scenario: with correct credentials
Then pass username as "tomsmith"
And pass password"SuperSecretPassword!"
And click on login button
Then verify "https://the-internet.herokuapp.com/secure" is launched
And verify message "You logged into a secure area!"
Then click logout button

@incorrect @ignore
Scenario: with incorrect username
Then pass username as "tomsmith555"
And pass password"SuperSecretPassword!"
And click on login button


@outline @ignore
Scenario Outline: verify login functionality
Then pass username as "<uname>"
And pass password"<password>"
And click on login button
And verify message "<message>"
Examples:
|uname        |password                  |message                  |
|tomsmith123  |SuperSecretPassword!      |Your username is invalid!|
|tomsmith     |SupecredftPassword!       |Your password is invalid!|
|tomsmith_Last|SupetyytytrSecretPassword!|Your username is invalid!|


