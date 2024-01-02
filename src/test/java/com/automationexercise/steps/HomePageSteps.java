package com.automationexercise.steps;

import com.automationexercise.pages.AccountPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductPage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Then("I click on {string} button")
    public void iClickOnSignupLoginButton(String button) {
        new HomePage().clickOnSignupLoginButton(button);
    }


    @When("I verify that Home page is visible successfully")
    public void iVerifyThatHomePageIsVisibleSuccessfully() {
Assert.assertEquals(new HomePage().getPageTitle(), "Automation Exercise", "Home page not visible");
    }


    @And("I verify  that Logged in as username is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(new AccountPage().getUserName().contains("Tesco"), "User name not visible");
    }

    @And("I click Delete Account button")
    public void iClickDeleteAccountButton() {
        new AccountPage().clickOnDeleteAccount();
    }


    @And("I verify that {string} is visible and click {string} button")
    public void iVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton(String text, String button) {
        Assert.assertEquals(new RegisterPage().getAccountInformationText(), text, "Text not matching");
        new RegisterPage().clickOnContinueButton();
    }


    @And("I Verify that {string} is visible")
    public void iVerifyThatACCOUNTDELETEDIsVisible(String text) {
        Assert.assertEquals(new RegisterPage().getAccountInformationText(), text, "Text not matching");
    }

    @Then("I verify Logged in as username is visible")
    public void iVerifyLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(new AccountPage().getUserName().contains("Tesco"), "User name not visible");
    }

    @And("I click Logout button")
    public void iClickLogoutButton() {
        new AccountPage().clickOnLogoutText();
    }

    @When("I Click on Contact us button")
    public void iClickOnContactUsButton() {
        new HomePage().clickOnContactUsTab();
    }

    @When("I Click on Test Cases button")
    public void iClickOnTestCasesButton() {
        new HomePage().clickOnTestCasesButton();
    }


    @When("I Click on products button")
    public void iClickOnProductsButton() throws InterruptedException {
        new HomePage().clickOnProductsButton();
        Thread.sleep(5000);
    }

    @When("I scroll down to footer")
    public void iScrollDownToFooter() {
        new HomePage().scrollDownPage();
    }

    @And("I verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String text) {
        Assert.assertEquals(new HomePage().getTextOfSubscription(), text, "Text not matching");
    }


    @And("I Enter {string} address in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton(String email) {
        new HomePage().sendTextToEmailField(email);
        new HomePage().clickOnArrowButton();

    }

    @Then("I verify that success message {string} is visible")
    public void iVerifyThatSuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String text) {
        Assert.assertEquals(new HomePage().getTextOfSuccessMessage(), text, "Success message not appear");

    }

    @When("I click {string} button")
    public void iClickCartButton(String cart) {
        new HomePage().clickOnTestCartsButton(cart);
    }

    @When("I add product to cart")
    public void iAddProductToCart() {
        new ProductPage().hoverOnFirstProductAndClick();
    }

    @And("I click on cart button")
    public void iClickOnCartButton() {
        new ProductPage().clickOnViewCart();
    }

    @When("I Verify that categories are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new HomePage().getTextOfCategory(), "CATEGORY", "Category not available on page");
    }

    @And("I Click on any category link under Women category, for example: Dress")
    public void iClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        new HomePage().clickOnWomenCategory();
        new HomePage().clickOnDressWomenCategory();
    }

    @When("I Scroll down page to bottom")
    public void iScrollDownPageToBottom() {
        new HomePage().scrollDownByUsingArrowButton();
    }

    @And("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        new HomePage().scrollUpByUsingArrowButton();
    }

    @Then("Verify that page is scrolled up and {string} text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String text) {
        Assert.assertEquals(new HomePage().getTextFromHomePage(),text,"Text not matching");
    }

    @When("I Scroll down page to the bottom")
    public void iScrollDownPageToTheBottom() {
        new HomePage().scrollDownPage();
    }

    @And("I Scroll up page to top")
    public void iScrollUpPageToTop() {
        new HomePage().scrollUpPage();
    }
}

