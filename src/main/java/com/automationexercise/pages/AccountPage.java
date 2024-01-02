package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Tesco']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
            WebElement deleteAccount;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;



    public String getUserName() {
        return getTextFromElement(userName);
    }

    public void clickOnDeleteAccount(){
        clickOnElement(deleteAccount);
    }

    public void clickOnLogoutText() {
        clickOnElement(logout);
    }
}
