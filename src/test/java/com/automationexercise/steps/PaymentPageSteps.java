package com.automationexercise.steps;

import com.automationexercise.pages.PaymentPage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class PaymentPageSteps {
    @Then("I enter payment details: {string}, {string}, {string}, {string}")
    public void iEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate(String name, String number, String cvc, String date) {
        new PaymentPage().sendTextToNameOnCardField(name);
        new PaymentPage().sendTextToCardNumberField(number);
        new PaymentPage().sendTextToCVCField(cvc);
        new PaymentPage().sendTextToExpiryMonthField(date);
        new PaymentPage().sendTextToExpiryYearField("2025");

    }

    @And("I click Pay and Confirm Order button")
    public void iClickPayAndConfirmOrderButton() throws InterruptedException {
        new PaymentPage().clickOnPayAndConfirmOrder();
        Thread.sleep(3000);
    }

    @Then("I verify success message {string}")
    public void iVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String message) throws InterruptedException {
        Assert.assertEquals(new PaymentPage().getSuccessMessage(), message,"order not placed");
        Thread.sleep(5000);
    }

    @And("I verify {string} and click Continue button")
    public void iVerifyACCOUNTDELETEDAndClickContinueButton(String text) {
        Assert.assertEquals(new RegisterPage().getAccountInformationText(), text, "Text not matching");
        new RegisterPage().clickOnContinueButton();
    }

    @And("I Click Download Invoice button and verify invoice is downloaded successfully")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        new PaymentPage().clickOnDownloadInvoice();
        Assert.assertTrue(new PaymentPage().filePresent());
    }

    @And("I click Continue button")
    public void iClickContinueButton() {
        new PaymentPage().clickOnContinueButtonNextToDownloadInvoice();
    }

    @And("I click cart button")
    public void iClickCartButton() {
new PaymentPage().clickOnCartButton();
    }
}
