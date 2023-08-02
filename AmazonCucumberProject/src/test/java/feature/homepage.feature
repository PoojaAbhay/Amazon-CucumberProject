Feature: home-page


Scenario: Verify Amazon Logo is displyaed
Then User verify Amazon Logo is displyaed

Scenario: Verify Navigation Bar is Displayed
Then User verify Navigation Bar is Displayed

Scenario: Verify Sign-In button is Displayed
Then User verify Sign-In button is Displayed

Scenario: Verify Shopping Cart is Displayed
Then User verify Shopping Cart is Displayed

Scenario: Search for a Product and Display Product List
When User enters product name "T-Shirt" in search field
And User click on search button
And the search page should display a list of product matching the search criteria