package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signupLoginButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUsTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//button[@type='button'][normalize-space()='Test Cases']")
    WebElement testCaseButton;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement successText;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement arrowButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tops']")
    WebElement dressWomenCategory;

    @CacheLookup
    @FindBy(xpath = "//html")
    WebElement scrollDown;

    @CacheLookup
    @FindBy(xpath = "//section[@id='slider']//div[@class='carousel-inner']//div[1]//div[1]//h2[1]")
    WebElement homepageText;

    public String getPageTitle(){
        return driver.getTitle();
    }
    public void clickOnSignupLoginButton(String button){
        clickOnElement(signupLoginButton);
    }

    public void clickOnContactUsTab() {
        clickOnElement(contactUsTab);
    }

    public void clickOnTestCasesButton() {
        clickOnElement(testCaseButton);
    }

    public void clickOnProductsButton() {
        clickOnElement(productsButton);
    }

    public void scrollDownPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
public void scrollUpPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    public String getTextOfSubscription(){
        return getTextFromElement(subscriptionText);
    }

    public void sendTextToEmailField(String text){
        sendTextToElement(emailField,text);
    }

    public String getTextOfSuccessMessage(){
        return getTextFromElement(successText);
    }

    public void clickOnArrowButton(){
        clickOnElement(arrowButton);
    }

    public void clickOnTestCartsButton(String cart) {
        clickOnElement(cartButton);
    }

    public String getTextOfCategory() {
            return getTextFromElement(categoryText);
    }

    public void clickOnWomenCategory() {
        try {
            clickOnElement(womenCategory);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", womenCategory);
            womenCategory.click();
        }
    }

    public void clickOnDressWomenCategory(){
        clickOnElement(dressWomenCategory);
    }

    public void scrollDownByUsingArrowButton(){
        Actions actions = new Actions(driver);
        WebElement slider = scrollDown;
        actions.dragAndDropBy(slider,0, 350);
    }

    public void scrollUpByUsingArrowButton(){
        Actions actions = new Actions(driver);
        WebElement slider = scrollDown;
        actions.dragAndDropBy(slider,0, -350);
    }

    public String getTextFromHomePage(){
        return getTextFromElement(homepageText);
    }
}
