package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewOrderText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrderButton;

    @CacheLookup
    @FindBy(name = "message")
    WebElement messageField;

    @CacheLookup
    @FindBy(id = "address_delivery")
    List<WebElement> deliveryAddress;

    @CacheLookup
    @FindBy(id = "address_delivery")
    List<WebElement> billingAddress;

@CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginButton;


    public String getTextFromAddressDetailsText() {
        return getTextFromElement(addressDetailsText);
    }

    public String getTextFromReviewOrderTextText() {
        return getTextFromElement(reviewOrderText);
    }

    public void sendTextToMessageField(String text) {
        sendTextToElement(messageField, text);
    }

    public void clickOnPlaceOrderButton() {
        clickOnElement(placeOrderButton);
    }

    public void actualDeliveryAddress() {
        List<WebElement> deliveryText = deliveryAddress;
        ArrayList<String> e = new ArrayList<>();
        e.add("Mr. Tesco Extra");
        e.add("Tesco");
        e.add("100 close");
        e.add("Nagra");
        e.add("Khambhat Gujarat 388170");
        e.add("India");
        e.add("07896541230");
        for (int i = 0; 1 > deliveryText.size(); i++)
            Assert.assertTrue(deliveryText.get(i).getText().contains(e.get(1)));
    }

    public void actualBillingAddress() {
        List<WebElement> deliveryText = billingAddress;
        ArrayList<String> e = new ArrayList<>();
        e.add("Mr. Tesco Extra");
        e.add("Tesco");
        e.add("100 close");
        e.add("Nagra");
        e.add("Khambhat Gujarat 388170");
        e.add("India");
        e.add("07896541230");
        for (int i = 0; 1 > deliveryText.size(); i++)
            Assert.assertTrue(deliveryText.get(i).getText().contains(e.get(1)));
    }

    public void clickOnRegisterLoginButton(){
        clickOnElement(registerLoginButton);
    }
}

