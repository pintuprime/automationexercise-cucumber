package com.automationexercise.steps;

import com.automationexercise.pages.ContactUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ContactUsSteps {
    

    @And("I upload file")
    public void iUploadFile() {
//        new ContactUsPage().chooseFile();
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickOnSubmitButton();
    }

    @And("I enter {string}, {string}, {string}, {string}")
    public void iEnterNameEmailSubjectMessage(String name, String email, String subject, String message) {
        new ContactUsPage().sendTextToNameField(name);
        new ContactUsPage().sendTextToEmailField(email);
        new ContactUsPage().sendTextToSubjectsField(subject);
        new ContactUsPage().sendTextToMessageField(message);
    }

    @Then("I verify that GET IN TOUCH is visible")
    public void iVerifyThatGETINTOUCHIsVisible() {
        Assert.assertEquals(new ContactUsPage().getInTouchText(),"GET IN TOUCH", "Text not matching");
    }

    @Then("I click OK button")
    public void iClickOKButton() {
        new ContactUsPage().acceptOkAlert();
    }

    @And("I verify success message {string} is visible")
    public void iVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String text) {
        Assert.assertTrue(new ContactUsPage().getTextOfSuccessText().contains(text), "Text not matching");
    }

    @Then("I click Home button and verify that landed to home page successfully")
    public void iClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        new ContactUsPage().clickOnHomeButton();
    }
}
