package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(CategoryPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement dressProductsText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement menSubCategory;

    public String getTextOfWomenDressProduct(){
        return getTextFromElement(dressProductsText);
    }

    public void clickOnMenCategory(){
        clickOnElement(menCategory);
    }

    public void clickOnMenSubCategory(){
        clickOnElement(menSubCategory);
    }

    public String getTitleOfThePage(){
       return driver.getTitle();
    }
}
