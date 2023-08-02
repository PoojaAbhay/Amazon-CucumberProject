package stepdefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePO;
import pageobjects.SearchPO;

public class homepage {

	HomePO homepo = new HomePO();
	SearchPO searchPO = new SearchPO();

	@Then("User verify Amazon Logo is displyaed")
	public void user_verify_amazon_logo_is_displayed() {

		Assert.assertTrue(homepo.LogoDisplayed());

	}

	@Then("User verify Navigation Bar is Displayed")
	public void user_verify_navigation_bar_is_displayed() {
		Assert.assertTrue(homepo.navigationBarDisplayed());
	}

	@Then("User verify Sign-In button is Displayed")
	public void user_verify_sign_in_button_is_displayed() {
		Assert.assertTrue(homepo.SignInButtonDisplayed());
	}

	@Then("User verify Shopping Cart is Displayed")
	public void user_verify_shopping_cart_is_displayed() {
		Assert.assertTrue(homepo.ShoppingCartDisplayed());

	}

	@When("User enters product name {string} in search field")
	public void user_enters_product_name_in_search_field(String productName) {
		homepo.EnterProductNameInSearchField(productName);

	}

	@When("User click on search button")
	public void user_click_on_search_button() {
		homepo.clickOnSearchButton();

	}


	@Then("the search page should display a list of product matching the search criteria")
	public void the_search_page_should_display_a_list_of_product_matching_the_search_criteria() {
		Assert.assertTrue(searchPO.tShirtDisplayed());

	}
}
