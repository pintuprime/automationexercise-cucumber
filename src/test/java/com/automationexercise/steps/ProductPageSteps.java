package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.ProductPage;
import com.automationexercise.pages.TestCasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductPageSteps {
    @Then("I verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String expectedPageTitle = "Automation Exercise - All Products";
        Assert.assertEquals(new TestCasePage().getTitle(), expectedPageTitle, "Title not matching");
    }

    @And("The products list is visible")
    public void theProductsListIsVisible() {
        new ProductPage().getProductList();
    }

    @And("I click on View product of first product")
    public void iClickOnViewProductOfFirstProduct() {
        new ProductPage().clickOnFirstProduct();
    }

    @Then("I landed to product details page")
    public void iLandedToProductDetailsPage() {
        String expectedPageTitle = "Automation Exercise - Product Details";
        Assert.assertEquals(new TestCasePage().getTitle(), expectedPageTitle, "Title not matching");
    }

    @And("I verify that detail detail is visible: {string}")
    public void iVerifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand(String text) {
        Assert.assertTrue(new ProductPage().getProductDetails(text).contains(text));
    }


    @Then("I verify SEARCHED PRODUCTS is visible")
    public void iVerifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertEquals(new ProductPage().getTextOfSearchedProducts(), "SEARCHED PRODUCTS", "Text not matching");
    }

    @And("I Verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        new ProductPage().getProductList();
    }

    @When("I {string} name in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton(String product) {
        new ProductPage().sendTextToSearchField(product);
        new ProductPage().clickOnSearchButton();
    }

    @And("I Click on Continue Shopping button")
    public void iClickOnContinueShoppingButton() {
        new ProductPage().clickOnContinueShopping();

    }

    @And("I Click View Cart button")
    public void iClickViewCartButton() {
        new ProductPage().clickOnViewCart();
    }

    @And("I Hover over first product and click Add to cart")
    public void iHoverOverFirstProductAndClickAddToCart() {
        new ProductPage().hoverOnFirstProductAndClick();

    }

    @And("I Hover over second product and click Add to cart")
    public void iHoverOverSecondProductAndClickAddToCart() {
        new ProductPage().hoverOnSecondProductAndClick();

    }

    @Then("I verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() {
        new ProductPage().getProductLists();
    }

    @And("I verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
        new ProductPage().getProductLists();
    }

    @When("I Click View Product for any product on home page")
    public void iClickViewProductForAnyProductOnHomePage() throws InterruptedException {
        new ProductPage().clickOnFirstProduct();
        Thread.sleep(3000);
    }

    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertEquals(new ProductPage().getTitle(), "Automation Exercise - Product Details", "Product detail page not open");
    }

    @And("I click Add to cart button")
    public void iClickAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("I verify that product is displayed in cart page with exact quantity")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new ProductPage().getQtyText(), "4", "Qty not matched");
    }

    @And("I Increase quantity to {string}")
    public void iIncreaseQuantityToFour(String num) {
        new ProductPage().sendTextToQuantity("4");
    }

    @Then("I verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() {
        Assert.assertEquals(new ProductPage().getShoppingCartPageText(), "Shopping Cart");
    }

    @And("I click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new ProductPage().clickOnProceedToCheckOutButton();
    }

    @Then("I click on Register Login button")
    public void iClickOnRegisterLoginButton() {
        new ProductPage().clickOnRegisterLoginButton();
    }

    @Then("I click on cart button on Top")
    public void iClickOnCartButtonOnTop() {
        new ProductPage().clickOnCartButton();
    }

    @And("I click X button corresponding to particular product")
    public void iClickXButtonCorrespondingToParticularProduct() throws InterruptedException {
        new ProductPage().clickOnXButton();
        Thread.sleep(3000);
    }

    @Then("I Verify that product is removed from the cart")
    public void iVerifyThatProductIsRemovedFromTheCart() {
        Assert.assertEquals(new ProductPage().getTextOfEmptyCart(), "Cart is empty!", "Product not remove from cart");

    }

    @Then("I verify that Brands are visible on left side bar")
    public void iVerifyThatBrandsAreVisibleOnLeftSideBar() throws InterruptedException {
        Assert.assertEquals(new ProductPage().getTextOfBrands(), "BRANDS", "Text not verified");
        Thread.sleep(3000);
    }

    @And("I Click on any brand name")
    public void iClickOnAnyBrandName() {
        new ProductPage().clickOnPoloBrand();
    }

    @And("I Enter product name in search input and click search button")
    public void iEnterProductNameInSearchInputAndClickSearchButton() {
        new ProductPage().enterProductNameInSearchFieldAndClickSearchButton("Sleeveless Dress");
    }

    @And("I add those products to cart")
    public void iAddThoseProductsToCart() {
        new ProductPage().searchProductAddToCart();
    }

    @And("I  Click Cart button and verify that products are visible in cart")
    public void iClickCartButtonAndVerifyThatProductsAreVisibleInCart() {
        new ProductPage().clickOnViewCart();
        Assert.assertEquals(new ProductPage().getShoppingCartPageText(), "Shopping Cart");
    }

    @Then("I Click {string} button and submit login details")
    public void iClickSignupLoginButtonAndSubmitLoginDetails(String button) {
        new HomePage().clickOnSignupLoginButton(button);
        new LoginPage().sendTextToLoginEmailField("tesco1422@gmail.com");
        new LoginPage().sendTextToLoginPasswordField("Tesco1234");
    }

    @Then("I verify that those products are visible in cart after login as well")
    public void iVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
Assert.assertEquals(new ProductPage().getProductName(), "Sleeveless Dress", "Product not matched");
    }
}
