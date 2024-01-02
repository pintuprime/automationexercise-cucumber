package com.automationexercise.steps;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement reviewText;

    @CacheLookup
    @FindBy(id = "name")
    WebElement nameField;

    @CacheLookup
    @FindBy(id = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "review")
    WebElement reviewField;

    @CacheLookup
    @FindBy(id = "button-review")
    WebElement submitButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='col-md-12 form-group']//div[@class='alert-success alert']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedMessage;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product-id='3']")
    WebElement productAddToCart;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/product_details/3']")
    WebElement productName;


    public String getWriteReviewText() {
        return getTextFromElement(reviewText);
    }

    public void sendTextToNameField(String text) {
        sendTextToElement(nameField, text);
    }

    public void sendTextToEmailField(String text) {
        sendTextToElement(emailField, text);
    }

    public void sendTextToReviewField(String text) {
        sendTextToElement(reviewField, text);
    }

    public void clickOnSubmitButton() {
        clickOnElement(submitButton);

    }

    public String getSuccessMessageText() {
        return getTextFromElement(successMessage);
    }

    public String getRecommendedItemsText() {
        try {
            return getTextFromElement(recommendedMessage);
        }catch (Exception e){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true)", recommendedMessage);
        }return getTextFromElement(recommendedMessage);
    }

    public void addProductToCart(){
       try{
           clickOnElement(productAddToCart);
       }catch (Exception e){
           JavascriptExecutor executor = (JavascriptExecutor) driver;
           executor.executeScript("arguments[0].scrollIntoView(true)", productAddToCart);
           productAddToCart.click();
       }
    }

    public String getProductName(){
        return getTextFromElement(productName);
    }
}
