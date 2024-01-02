package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement accountText;

    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement meButton;

    @CacheLookup
    @FindBy(id = "id_gender2")
    WebElement mrsButton;

    @CacheLookup
    @FindBy(id = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "days")
    WebElement day;

    @CacheLookup
    @FindBy(id = "months")
    WebElement month;

    @CacheLookup
    @FindBy(id = "years")
    WebElement year;

    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement signupCheckBox;

    @CacheLookup
    @FindBy(id = "optin")
    WebElement offersCheckBox;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "company")
    WebElement company;

    @CacheLookup
    @FindBy(id = "address1")
    WebElement address1;

    @CacheLookup
    @FindBy(name = "address2")
    WebElement address2;

    @CacheLookup
    @FindBy(name = "country")
    WebElement country;

    @CacheLookup
    @FindBy(name = "state")
    WebElement state;

    @CacheLookup
    @FindBy(id = "city")
    WebElement city;

    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipcode;

    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumber;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement cntinueButton;


    public String getAccountInformationText() {
        return getTextFromElement(accountText);
    }

    public void clickOnMrGenderRadioButton() {
        clickOnElement(meButton);
    }

    public void clickOnMrsGenderRadioButton() {
        clickOnElement(mrsButton);
    }

    public void sendTextToNameField(String name) {
        sendTextToElement(nameField, name);
    }

    public void sendTextToEmailField(String name) {

    }

    public void sendTextToPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void selectDaysFromDropdown(String text) {
        selectByVisibleTextFromDropDown(day, text);
    }

    public void selectMonthFromDropdown(String text) {
        selectByVisibleTextFromDropDown(month, text);
    }

    public void selectYearFromDropdown(String text) {
        selectByVisibleTextFromDropDown(year, text);
    }

    public void clickOnCheckBox(String box) {
        clickOnElement(signupCheckBox);
    }

    public void clickOnOffersCheckBox(String click) {
        clickOnElement(offersCheckBox);
    }

    public void sendTextToFirstNameField(String text) {
        sendTextToElement(firstName, text);
    }

    public void sendTextToLastNameField(String text) {
        sendTextToElement(lastName, text);
    }

    public void sendTextToCompanyField(String text) {
        sendTextToElement(company, text);
    }

    public void sendTextToAddressField(String text) {
        sendTextToElement(address1, text);
    }

    public void sendTextToAddress2Field(String text) {
        sendTextToElement(address2, text);
    }

    public void sendTextToStateField(String text) {
        sendTextToElement(state, text);
    }

    public void sendTextToCityField(String text) {
        sendTextToElement(city, text);
    }

    public void sendTextToZipcodeField(String text) {
        sendTextToElement(zipcode, text);
    }

    public void sendTextToMobileNumberField(String text) {
        sendTextToElement(mobileNumber, text);
    }

    public void selectCountryFromDropdown(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    public void clickOnCreateAccountButton() {
        try {
            clickOnElement(createAccountButton);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
            createAccountButton.click();
        }
    }

    public void clickOnContinueButton() {
        clickOnElement(cntinueButton);
    }
}


