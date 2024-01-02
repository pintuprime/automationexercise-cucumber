package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class PaymentPage extends Utility {

    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    @CacheLookup
    @FindBy(name = "name_on_card")
    WebElement nameOnCard;

    @CacheLookup
    @FindBy(name = "card_number")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(name = "cvc")
    WebElement cvc;

    @CacheLookup
    @FindBy(name = "expiry_month")
    WebElement months;

    @CacheLookup
    @FindBy(name = "expiry_year")
    WebElement years;

    @CacheLookup
    @FindBy(id = "submit")
    WebElement payOrderButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement successOrderMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoiceButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonNextToDownloadInvoice;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartButton;

    public void sendTextToNameOnCardField(String name) {
        sendTextToElement(nameOnCard, name);
    }

    public void sendTextToCardNumberField(String number) {
        sendTextToElement(cardNumber, number);
    }

    public void sendTextToCVCField(String num) {
        sendTextToElement(cvc, num);
    }

    public void sendTextToExpiryMonthField(String month) {
        sendTextToElement(months, month);
    }

    public void sendTextToExpiryYearField(String year) {
        sendTextToElement(years, year);
    }

    public void clickOnPayAndConfirmOrder() {
        clickOnElement(payOrderButton);
    }

    public String getSuccessMessage() {
        return getTextFromElement(successOrderMessage);
    }

    public void clickOnDownloadInvoice(){
        clickOnElement(downloadInvoiceButton);
    }

    public void clickOnContinueButtonNextToDownloadInvoice(){
        clickOnElement(continueButtonNextToDownloadInvoice);
    }

    public boolean filePresent() {
        String homePath = System.getProperty("user.home");
        File f = new File(homePath + "/Downloads/invoice.txt");
        return f.exists();
    }

    public void clickOnCartButton(){
        clickOnElement(cartButton);
    }
}
