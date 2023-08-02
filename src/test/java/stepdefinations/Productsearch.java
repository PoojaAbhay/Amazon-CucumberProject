package stepdefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPO;
import pageobjects.ProductPO;
import pageobjects.SearchPO;

public class Productsearch {
	
	SearchPO searchPO = new SearchPO();
	ProductPO productPO =new ProductPO();
	CartPO cartPO = new CartPO();
	
	@Then("the search page should display the search results")
	public void the_search_page_should_display_the_search_results() {
	
		Assert.assertTrue(searchPO.tShirtDisplayed());
	}

	@When("the user selects the T-Shirt from the search results and adds it to the cart")
	public void the_user_selects_the_t_shirt_from_the_search_results_and_adds_it_to_the_cart() {
		
		productPO.addTshirtToCart();
	}

	@Then("the T-Shirt should be successfully added to the cart")
	public void the_t_shirt_should_be_successfully_added_to_the_cart() {
		
	   
	}

	@When("User clicks on go to cart button after adding T-shirt")
	public void user_clicks_on_go_to_cart_button() {
		productPO.GoToCartAfterAddingTshirt();
	}

	@Then("shopping cart page should dispalyed with added product")
	public void shopping_cart_page_should_dispalyed_with_added_product() {
		
		Assert.assertTrue(cartPO.ShoppingCartText());

		Assert.assertTrue(cartPO.TshirtInCart());
	}




}
