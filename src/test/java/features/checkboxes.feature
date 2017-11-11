Feature: dropdown feature

@cb
Scenario: To verify the drowndown option present on the home page 
Given "chrome" browser is selected
Then launch url "https://the-internet.herokuapp.com/"
And verify page by url "https://the-internet.herokuapp.com/"
Then click on "Checkboxes"
And verify page by url "https://the-internet.herokuapp.com/checkboxes"
And click checkbox 1
And click checkbox 2

