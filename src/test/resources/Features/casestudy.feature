Feature: Test Payment Method

Scenario: The one where the user  moves to cart without adding any item in it
When user registered into testme app
When user search a particular products like headphones
And try to proceed to payment without adding any item in the cart
Then Test me app does not display the cart icon

