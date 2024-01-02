Feature: Cart Test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Add Products in Cart
    When I Click on products button
    And I Hover over first product and click Add to cart
    And I Click on Continue Shopping button
    And I Hover over second product and click Add to cart
    And I Click View Cart button
    Then I verify both products are added to Cart
    And I verify their prices, quantity and total price


  Scenario: Verify Product quantity in Cart
    When I Click View Product for any product on home page
    And Verify product detail is opened
    And I Increase quantity to 'four'
    And I click Add to cart button
    And I Click View Cart button
    Then I verify that product is displayed in cart page with exact quantity

