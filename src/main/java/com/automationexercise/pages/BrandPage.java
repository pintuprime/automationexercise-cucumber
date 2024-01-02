package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends Utility {

    private static final Logger log = LogManager.getLogger(BrandPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement poloProducts;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Madame']")
    WebElement madameBrand;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Madame Products']")
    WebElement madameProducts;

    @CacheLookup
    @FindBy(xpath = "//div[@id='popular']//button[@class='slider-next slick-arrow']")
    WebElement arrow;

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPoloProducts() {
        return getTextFromElement(poloProducts);
    }

    public void clickOnMadameBrand() {
        try {
            clickOnElement(madameBrand);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", madameBrand);
            madameBrand.click();
        }
    }

    public String getMadameProducts() {
        return getTextFromElement(madameProducts);
    }

}
