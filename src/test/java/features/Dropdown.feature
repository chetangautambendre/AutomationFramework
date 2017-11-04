Feature: dropdown feature

@dd
Scenario: To verify the drowndown option present on the home page 

Given "chrome" browser is selected
Then "https://the-internet.herokuapp.com/" is launched
Then verify "https://the-internet.herokuapp.com/" is launched
When "Dropdown" link is clicked
Then verify "https://the-internet.herokuapp.com/dropdown" is launched

Then click on dropdown option
