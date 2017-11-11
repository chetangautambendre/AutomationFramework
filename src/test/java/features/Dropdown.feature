Feature: dropdown feature

@dd
Scenario: To verify the drowndown option present on the home page 
Given "chrome" browser is selected
Then launch url "https://the-internet.herokuapp.com/"
And verify page by url "https://the-internet.herokuapp.com/"
Then click on "Dropdown"
And verify page by url "https://the-internet.herokuapp.com/dropdown"
Then select "1" by "index"
Then select "Option 1" by "text"
Then select "2" by "value"
