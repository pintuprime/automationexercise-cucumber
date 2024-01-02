package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/product_details/1']")
    WebElement firstProduct;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product-id='2']")
    WebElement secondProduct;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product-id='1']")
    WebElement firstProducts;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-information']")
    List<WebElement> productDetails;

    @CacheLookup
    @FindBy(id = "search_product")
    WebElement searchProductField;

    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchProductText;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    WebElement addToCart2;

    @CacheLookup
    @FindBy(xpath = "//button[@type='button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShopping;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_quantity']")
    WebElement verifyQty;

    @CacheLookup
    @FindBy(id = "product-1")
    List<WebElement> firstProductDetails;

    @CacheLookup
    @FindBy(id = "product-2")
    List<WebElement> secondProductDetails;

    @CacheLookup
    @FindBy(id = "quantity")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartPagePage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerLoginButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cartButton;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement xButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='cart_info']//span//b")
    WebElement emptyCart;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brandsText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrand;

    @CacheLookup
    @FindBy(id = "search_product")
    WebElement searchField;

    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement searchFieldButton;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product-id='3']")
    WebElement searchProductAddToCart;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/product_details/3']")
    WebElement productName;


    public void getProductList() {
        List<WebElement> products = productList;
        for (WebElement e : products) {
            String productList = e.getText();
            System.out.println(productList);
        }
    }

    public void clickOnFirstProduct() {
        try {
            clickOnElement(firstProduct);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", firstProduct);
            firstProduct.click();
        }
    }

    public String getProductDetails(String list) {
        List<WebElement> productDetail = productDetails;
        for (WebElement e : productDetail) {
            String lists = e.getText();
            System.out.println(lists);
        }
        return list;
    }

    public void sendTextToSearchField(String product) {
        sendTextToElement(searchProductField, product);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public String getTextOfSearchedProducts() {
        return getTextFromElement(searchProductText);
    }

    public void hoverOnFirstProductAndClick() {
        try {
            clickOnElement(firstProducts);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", firstProducts);
            firstProducts.click();
        }
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart2);
    }

    public void hoverOnSecondProductAndClick() {
        mouseHoverToElementAndClick(secondProduct);

    }

    public void clickOnContinueShopping() {
        try {
            clickOnElement(continueShopping);
        } catch (StaleElementReferenceException e) {
            clickOnElement(continueShopping);
        }
    }

    public void clickOnViewCart() {
        clickOnElement(viewCart);
    }

    public void getProductLists() {
        List<WebElement> firstProductlist = firstProductDetails;
        List<WebElement> secondProductlist = secondProductDetails;
        HashMap<Integer, String> product = new HashMap<>();
        product.put(1, "Blue Top");
        product.put(2, "Men Tshirt");
        product.put(1, "Rs. 500");
        product.put(2, "Rs. 400");
        product.put(1, "1");
        product.put(2, "1");
        product.put(1, "Rs. 500");
        product.put(2, "Rs. 400");
        for (int i = 0; 1 > firstProductlist.size(); i++) {
            Assert.assertTrue(firstProductlist.get(i).getText().contains(product.get(1)));
            Assert.assertTrue(secondProductlist.get(i).getText().contains(product.get(2)));
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void sendTextToQuantity(String num) {
        sendTextToElement(quantity, num);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }


    public String getQtyText() {
        return getTextFromElement(verifyQty);
    }

    public String getShoppingCartPageText() {
        return getTextFromElement(shoppingCartPagePage);
    }

    public void clickOnProceedToCheckOutButton() {
        clickOnElement(proceedToCheckoutButton);
    }

    public void clickOnRegisterLoginButton() {
        clickOnElement(registerLoginButton);
    }

    public void clickOnCartButton() {
        clickOnElement(cartButton);
    }

    public void clickOnXButton() {
        clickOnElement(xButton);
    }

    public String getTextOfEmptyCart() {
        return getTextFromElement(emptyCart);
    }

    public String getTextOfBrands() {
        return getTextFromElement(brandsText);
    }

    public void clickOnPoloBrand() {
        try {
            clickOnElement(poloBrand);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true);", poloBrand);
            poloBrand.click();
        }
    }

    public void enterProductNameInSearchFieldAndClickSearchButton(String name) {
        sendTextToElement(searchField, name);
        clickOnElement(searchFieldButton);
    }

    public void searchProductAddToCart() {
        try {
            clickOnElement(searchProductAddToCart);
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView(true)", searchProductAddToCart);
            searchProductAddToCart.click();
        }
    }

    public String getProductName(){
        return getTextFromElement(productName);
    }
}

