Feature: Navigation to Sauce Labs website

Scenario: Open home page in chrome 
Given I am on  home page

Scenario: User perform login to home page unsuccessfully
When I enter Username as "abc"
And I enter Password  as "pqr"
Then I submit invalid credential for login

Scenario: User perform login to home page successfully
When I enter Username as "standard_user" 
And I enter Password  as "secret_sauce" 
And I submit valid credential for login
Then I validate the landing page


Scenario: Navigate through products page
Given  I sort filter high to low
When I add items in cart
And I click on cart icon
Then I  validate the cart page

Scenario: Navigate through checkout page 
Given I am on cart page
When I click to checkout button
Then I validate checkout landing page

Scenario: Enter customer information  
When I enter Firstname as "Riya"  
And I enter LastName  as "Singh"
And I enter Postal code as "201304"
And I click continue button 
Then I validated the continue landing page

Scenario: Submit the information
Given I validate cart items
When I click on finish button
Then I validate the confirmation page






