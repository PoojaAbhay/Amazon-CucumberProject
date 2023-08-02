package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO {
	WebDriver driver;
	@FindBy(id = "nav-main")
	private WebElement NavigationBar;

	@FindBy(id = "nav-logo")
	private WebElement Logo;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SearchBoxField;

	@FindBy(id = "nav-search-submit-button")
	private WebElement SearchButton;

	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement SignInButton;

	@FindBy(id = "nav-cart-count-container")
	private WebElement ShoppingCart;

	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(@class,'')][normalize-space()='Home']")
	private WebElement HomeButton;
	
	@FindBy(xpath = "//a[normalize-space()='Coupons']")
	private WebElement CouponButton;
	
	
	
	
//	public HomePO(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
	

	public Boolean navigationBarDisplayed() {

		return NavigationBar.isDisplayed();
	}

	public Boolean ShoppingCartDisplayed() {

		ShoppingCart.click();
		return ShoppingCart.isDisplayed();
	}
	
	public Boolean LogoDisplayed() {

		return Logo.isDisplayed();
	}
	
	public Boolean SignInButtonDisplayed() {

		return SignInButton.isDisplayed();
	}

	public void EnterProductNameInSearchField(String ProductName) {
		SearchBoxField.sendKeys(ProductName);
		

	}
	
	public void clickOnSearchButton() {
		
		SearchButton.click();
	}
	public void ClickOnHomeButton() {
		HomeButton.click();
	}
	
	public void clickCouponButton() {
		CouponButton.click();
	}

}

