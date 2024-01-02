package com.automationexercise.steps;

import com.automationexercise.pages.BrandPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BrandPageSteps {
    @Then("I Verify that user is navigated to brand page and brand products are displayed")
    public void iVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        Assert.assertEquals(new BrandPage().getPoloProducts(), "BRAND - POLO PRODUCTS", "Not displayed Brand products");
        Assert.assertEquals(new BrandPage().getPageTitle(), "Automation Exercise - Polo Products", "Not navigate tp Brand page");
    }

    @And("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {
        new BrandPage().clickOnMadameBrand();
    }

    @And("I Verify that user is navigated to that brand page and can see products")
    public void iVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        Assert.assertEquals(new BrandPage().getMadameProducts(), "BRAND - MADAME PRODUCTS", "Not displayed Brand products");
        Assert.assertEquals(new BrandPage().getPageTitle(), "Automation Exercise - Madame Products", "Not navigate tp Brand page");
    }

}
