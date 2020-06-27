
#----------------------------------
# Inchins Bamboo Garden feature file
#----------------------------------
    
Feature:  Inchins Bamboo Garden Order food with Catering and Bulletin Test Feature

Scenario: Inchins Bulletin Test Scenario
Given user is already on Bulletin Home Page
Then user enters data name emaile
Then user clicks on Schaumburg on Select Location Page
Then user enters captcha code on Bulletin Page
Then user clicks on Submit Form on Bulletin Page
Then user closes the browser for bulletin


Scenario: Inchins Catering Test Scenario
Given user is already on Bamboo Home Page
Then user enters data name email and phone
Then user clicks on Schaumburg Location in Select Location Page
Then user enters comments on Catering Page
Then user enters captcha code on Catering Page
Then user clicks on Submit Form
Then user closes the catering browser session

Scenario: Inchins Login Test Scenario
Given user is already in login Test Page
Then user gives email address on newsletter section
Then user selects Schamburg location
Then user clicks Order Online link to test login feature
Then user selects Location and Main Options
Then user enters username and password
Then user clicks submit 
Then user closes brower for login test session

Scenario: Inchins Menu Order Test Scenario
Given user is already on Login Page
When login page is loaded
Then user enters data username and password
Then user clicks on Submit button
Then user clicks on Schaumburg Location on Select Location Page
Then user clicks on Main Menu option on Menu Page
When products page is loaded
Then user clicks Noodles Section
Then user clicks Selected Hakka Noodles
Then user clicks Add to Cart
Then user clicks Cart
When cart page is loaded
Then user clicks Checkout
Then user enters Credit Card Number
Then user enters Credit Card Expiry Date
Then user enters Credit Card CVV Number
Then user enters Telephone Number
Then user clikcs Place Order
When order successfully placed
Then user clicks on ACKU Menu on main page
Then user clicks on Logoff
Then user closes the browser

 