Feature: product-search
Background:

When User clicks on home button
And User click on bed furniture button
Then the search page should display the search results
When the user selects the furniture from the search results and adds it to the cart
Then the bed-furniture should be successfully added to the cart

Scenario: verify functionality of adding item to the cart
When User clicks on go to cart button
Then shopping cart page should dispalyed with added product


Scenario: verify functionality of removing item to the cart

When User clicks on go to cart button
Then shopping cart page should dispalyed with added product
When User clicks on remove product button
Then product should removed from cart
And cart should empty

Scenario: verify functionality of adding multiple item to the cart

When User clicks on home button
And User click on bed furniture button
And User selects another furniture product from the search results and adds it to the cart
When User clicks on go to cart button
Then shopping cart page should dispalyed with added products


