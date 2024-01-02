package com.automationexercise.steps;

import com.automationexercise.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutPageSteps {
    @Then("I Verify Address Details and Review Your Order")
    public void iVerifyAddressDetailsAndReviewYourOrder() {
        Assert.assertEquals(new CheckoutPage().getTextFromAddressDetailsText(), "Address Details", "Text message not match");
        Assert.assertEquals(new CheckoutPage().getTextFromReviewOrderTextText(), "Review Your Order", "Text message not match");
    }

    @And("I  Enter description in comment text area and click Place Order")
    public void iEnterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        new CheckoutPage().sendTextToMessageField("I would like deliver ASAP");
        new  CheckoutPage().clickOnPlaceOrderButton();
    }

    @Then("I Verify that the delivery address is same address filled at the time registration of account")
    public void iVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
       new CheckoutPage().actualDeliveryAddress();

    }

    @And("I Verify that the billing address is same address filled at the time registration of account")
    public void iVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        new CheckoutPage().actualBillingAddress();
    }

    @And("I Click Register Login button")
    public void iClickRegisterLoginButton() {
new CheckoutPage().clickOnRegisterLoginButton();
    }
}
