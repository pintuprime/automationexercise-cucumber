package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginText;

    @CacheLookup
    @FindBy(name = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Signup']")
    WebElement signupButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement emailFieldForLogin;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordFieldForLogin;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement loginError;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement signupError;


    public String getText() {
        return getTextFromElement(newUserText);
    }

    public String getLoginText() {
        return getTextFromElement(loginText);
    }

    public String getLoginErrorText() {
        return getTextFromElement(loginError);
    }

    public String getSignupErrorText() {
        return getTextFromElement(signupError);
    }

    public void sendTextToNameField(String name) {
        sendTextToElement(nameField, name);
    }

    public void sendTextToEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void clickOnSignupButton() {
        clickOnElement(signupButton);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void sendTextToLoginEmailField(String email) {
        sendTextToElement(emailFieldForLogin, email);
    }

    public void sendTextToLoginPasswordField(String email) {
        sendTextToElement(passwordFieldForLogin, email);
    }

    public void getCurrentUrl(){
        driver.getCurrentUrl();
    }

}

