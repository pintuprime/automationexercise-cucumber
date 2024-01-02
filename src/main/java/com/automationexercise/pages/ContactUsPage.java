package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ContactUsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    WebElement getInTouch;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subjectField;

    @CacheLookup
    @FindBy(id = "message")
    WebElement messages;

    @CacheLookup
    @FindBy(name = "upload_file")
    WebElement uploadFile;

    @CacheLookup
    @FindBy(name = "submit")
    WebElement submit;

    @CacheLookup
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement homeButton;

    public void sendTextToNameField(String name) {
        sendTextToElement(nameField, name);
    }

    public void sendTextToEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void sendTextToMessageField(String message) {
        sendTextToElement(messages, message);
    }

    public void sendTextToSubjectsField(String sub) {
        sendTextToElement(subjectField, sub);
    }

    public void chooseFile() {
        clickOnElement(uploadFile);
    }

    public void clickOnSubmitButton() {
        try {
            clickOnElement(submit);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", submit);
            submit.click();
        }
    }

    public String getInTouchText() {
        return getTextFromElement(getInTouch);
    }

    public void acceptOkAlert() {
        acceptAlert();
    }

    public String getTextOfSuccessText() {
        return getTextFromElement(successText);
    }

    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }
}
