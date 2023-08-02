Feature: product-search

Scenario: verify functionality of searching and adding item to the cart

When User enters product name "T-Shirt" in search field
And User click on search button
Then the search page should display the search results
When the user selects the T-Shirt from the search results and adds it to the cart
Then the T-Shirt should be successfully added to the cart
When User clicks on go to cart button after adding T-shirt
Then shopping cart page should dispalyed with added product