package com.automationexercise.steps;

import com.automationexercise.pages.CategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CategorySteps {
    @Then("I Verify that category page is displayed and confirm text {string}")
    public void iVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(String text) {
        Assert.assertEquals(new CategoryPage().getTextOfWomenDressProduct(), text, "Text not matching");
    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        new CategoryPage().clickOnMenCategory();
        new CategoryPage().clickOnMenSubCategory();
    }

    @Then("I Verify that user is navigated to that category page")
    public void iVerifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(new CategoryPage().getTitleOfThePage(), "Automation Exercise - Tshirts Products");
    }
}
