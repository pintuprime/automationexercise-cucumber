package com.automationexercise.steps;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Random;

public class SignupPagesteps {
    @Then("I verify that {string} is visible")
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible(String text) {
        Assert.assertEquals(new RegisterPage().getAccountInformationText(), text, "Text not matching");
    }

    @And("I Select checkbox {string}")
    public void iSelectCheckboxSignUpForOurNewsletter(String text) {
        if (text == "Sign up for our newsletter!") {
            new RegisterPage().clickOnCheckBox(text);
        } else if (text == "Receive special offers from our partners!") {
            new RegisterPage().clickOnOffersCheckBox(text);
        }

    }

    @And("I Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void iFillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobile) {
        new RegisterPage().sendTextToFirstNameField(firstName);
        new RegisterPage().sendTextToLastNameField(lastName);
        new RegisterPage().sendTextToCompanyField(company);
        new RegisterPage().sendTextToAddressField(address);
        new RegisterPage().sendTextToAddress2Field(address2);
        new RegisterPage().selectCountryFromDropdown(country);
        new RegisterPage().sendTextToStateField(state);
        new RegisterPage().sendTextToCityField(city);
        new RegisterPage().sendTextToZipcodeField(zipcode);
        new RegisterPage().sendTextToMobileNumberField(mobile);


    }

    @And("I fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void iFillDetailsMrTescoTescoextraGmailComTescoDecember(String button, String name, String email, String password, String day, String month, String year) {

        if (button == "Mr.") {
            new RegisterPage().clickOnMrGenderRadioButton();
        } else {
            new RegisterPage().clickOnMrsGenderRadioButton();
        }

        new RegisterPage().sendTextToNameField(name);
        new RegisterPage().sendTextToEmailField(email);
        new RegisterPage().sendTextToPasswordField(password);
        new RegisterPage().selectDaysFromDropdown(day);
        new RegisterPage().selectMonthFromDropdown(month);
        new RegisterPage().selectYearFromDropdown(year);
    }

    @And("I click Create Account button")
    public void iClickCreateAccountButton() {

        new RegisterPage().clickOnCreateAccountButton();
    }

    @And("I click continue button")
    public void iClickContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("I Fill all details in Signup and create account")
    public void iFillAllDetailsInSignupAndCreateAccount() throws InterruptedException {
        Random random = new Random();
        int num = random.nextInt(1000);
        new LoginPage().sendTextToNameField("Tesco");
        new LoginPage().sendTextToEmailField("tesco" + num +"@gmail.com");
        new LoginPage().clickOnSignupButton();
        Thread.sleep(3000);
        new RegisterPage().clickOnMrGenderRadioButton();
        new RegisterPage().sendTextToPasswordField("Tesco1234");
        new RegisterPage().selectDaysFromDropdown("25");
        new RegisterPage().selectMonthFromDropdown("December");
        new RegisterPage().selectYearFromDropdown("1995");
        new RegisterPage().sendTextToFirstNameField("Tesco");
        new RegisterPage().sendTextToLastNameField("Extra");
        new RegisterPage().sendTextToCompanyField("Tesco");
        new RegisterPage().sendTextToAddressField("100 close");
        new RegisterPage().sendTextToAddress2Field("Nagra");
        new RegisterPage().selectCountryFromDropdown("India");
        new RegisterPage().sendTextToStateField("Gujarat");
        new RegisterPage().sendTextToCityField("Khambhat");
        new RegisterPage().sendTextToZipcodeField("388170");
        new RegisterPage().sendTextToMobileNumberField("07896541230");
        new RegisterPage().clickOnCreateAccountButton();
    }
}
