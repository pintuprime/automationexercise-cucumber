Feature: Verify Products Test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully
    When I Click on products button
    And I verify user is navigated to ALL PRODUCTS page successfully


  Scenario: Verify All Products and product detail page
    And The products list is visible
    And I click on View product of first product
    Then I landed to product details page
    And I verify that detail detail is visible: 'product name, category, price, availability, condition, brand'


  Scenario: Search Product
    When I 'Tshirt' name in search input and click search button
    Then I verify SEARCHED PRODUCTS is visible
    And I Verify all the products related to search are visible

