package com.automationexercise.steps;

import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ReviewPageSteps {
    @And("I click on View product button")
    public void iClickOnViewProductButton() {
        new ProductPage().clickOnFirstProduct();
    }

    @Then("I verify Write Your Review is visible")
    public void iVerifyWriteYourReviewIsVisible() {
        Assert.assertEquals(new ReviewPage().getWriteReviewText(), "WRITE YOUR REVIEW", "Text not matched");

    }

    @And("I Enter {string}, {string} and {string}")
    public void iEnterNameEmailAndReview(String name, String email, String review) {
        new ReviewPage().sendTextToNameField(name);
        new ReviewPage().sendTextToEmailField(email);
        new ReviewPage().sendTextToReviewField(review);
    }

    @And("I Click on Submit button")
    public void iClickOnSubmitButton() {
        new ReviewPage().clickOnSubmitButton();

    }

    @And("I verify success message Thank you for your review.")
    public void iVerifySuccessMessageThankYouForYourReview() {
        Assert.assertEquals(new ReviewPage().getSuccessMessageText(), "Thank you for your review.", "Message not matching");
    }

    @When("I Scroll to bottom of page")
    public void iScrollToBottomOfPage() {
        new ReviewPage().getRecommendedItemsText();
    }

    @And("I verify RECOMMENDED ITEMS are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible() throws InterruptedException {
        Assert.assertEquals(new ReviewPage().getRecommendedItemsText(), "RECOMMENDED ITEMS", "Text not matching");
        Thread.sleep(3000);
    }

    @And("I Click on Add To Cart on Recommended product")
    public void iClickOnAddToCartOnRecommendedProduct() {
        new ReviewPage().addProductToCart();
    }

    @And("I click on View Cart button")
    public void iClickOnViewCartButton() {
        new ProductPage().clickOnViewCart();
    }

    @Then("I Verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() {
        Assert.assertEquals(new ReviewPage().getProductName(), "Sleeveless Dress", "Product not matched");
    }
}
