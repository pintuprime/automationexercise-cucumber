package com.automationexercise.steps;

import com.automationexercise.pages.AccountPage;
import com.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Random;

public class LoginPageSteps {
    @When("I verify {string} is visible")
    public void iVerifyNewUserSignupIsVisible(String text) {
        Assert.assertEquals(new LoginPage().getText(), text, "Text not matching");
    }

    @And("I enter {string} and {string} address")
    public void iEnterNameAndEmailAddress(String name, String email) {
        Random random =new Random();
        int num = random.nextInt(1000);
        new LoginPage().sendTextToNameField(name);
        new LoginPage().sendTextToEmailField(email);
    }

    @And("I click Signup button")
    public void iClickSignupButton() {
        new LoginPage().clickOnSignupButton();
    }

    @And("I Click {string} button")
    public void iClickLoginButton(String login) {
        new LoginPage().clickOnLoginButton();
    }

    @And("I Click Delete Account button")
    public void iClickDeleteAccountButton() {
        new AccountPage().clickOnDeleteAccount();
    }

    @When("I verify Login to your account is visible")
    public void iVerifyLoginToYourAccountIsVisible() {
        Assert.assertEquals(new LoginPage().getLoginText(),"Login to your account", "Text not matching");
    }

    @And("I Click login button")
    public void iClickLoginButton() {
        new LoginPage().clickOnLoginButton();
    }


    @And("I Enter correct {string} and {string}")
    public void iEnterCorrectEmailAndPassword(String email, String password) {
        new LoginPage().sendTextToLoginEmailField(email);
        new LoginPage().sendTextToLoginPasswordField(password);
    }

    @Then("I verify error {string} is visible")
    public void iVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String text) {
        Assert.assertEquals(new LoginPage().getLoginErrorText(), text, "Text not matching");
    }

    @Then("I verify that user is navigated to login page")
    public void iVerifyThatUserIsNavigatedToLoginPage() {
        Assert.assertEquals(new LoginPage().getLoginText(),"Login to your account", "Text not matching");
    }

    @Then("I verify error Email Address already exist! is visible")
    public void iVerifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertEquals(new LoginPage().getSignupErrorText(),"Email Address already exist!", "Text not matching");

    }
}

