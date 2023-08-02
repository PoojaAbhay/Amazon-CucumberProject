package stepdefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CartPO;
import pageobjects.HomePO;
import pageobjects.ProductPO;
import pageobjects.SearchPO;

public class Shoppingcart {
	HomePO homepo = new HomePO();
	SearchPO searchPO = new SearchPO();
	ProductPO productPO = new ProductPO();
	CartPO cartPO = new CartPO();

	@When("User clicks on home button")
	public void user_clicks_on_home_button() {
		homepo.ClickOnHomeButton();
	}

	@When("User click on bed furniture button")
	public void user_click_on_bed_furniture_button() {
		searchPO.ClickOnBedFurniture();

	}

	@When("the user selects the furniture from the search results and adds it to the cart")
	public void the_user_selects_the_furniture_from_the_search_results_and_adds_it_to_the_cart() {
		searchPO.SelectFurnitureProduct();
		productPO.AddtoCartBedFurniture();

	}

	@Then("the bed-furniture should be successfully added to the cart")
	public void the_bed_furniture_should_be_successfully_added_to_the_cart() {
		Assert.assertEquals(productPO.BedFurnitureAddedtoCartMesssage(), "Added to Cart");
	}

	@When("User clicks on go to cart button")
	public void User_clicks_on_go_to_cart_button() {
		
		productPO.GoToCartButtonAferBedFurniture();

	}

	@When("User clicks on remove product button")
	public void user_clicks_on_remove_product_button() {
		cartPO.RemoveProductButton();

	}

	@Then("product should removed from cart")
	public void product_should_removed_from_cart() {
		
	}

	@Then("cart should empty")
	public void cart_should_empty() {
		Assert.assertTrue(cartPO.CartEmptyMessage());	

	}

	@When("User selects another furniture product from the search results and adds it to the cart")
	public void user_selects_another_furniture_product_from_the_search_results_and_adds_it_to_the_cart() {
		productPO.AddAnotherProduct();
		productPO.AddToCartAnotherProduct();
	}

	@Then("shopping cart page should dispalyed with added products")
	public void shopping_cart_page_should_dispalyed_with_added_products() {
		homepo.ShoppingCartDisplayed();

	}

}
