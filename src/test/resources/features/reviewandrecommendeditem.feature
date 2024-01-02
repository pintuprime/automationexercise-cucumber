Feature: Review And Recommended Items in Cart Test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Add review on product
    When I Click on products button
    Then I verify user is navigated to ALL PRODUCTS page successfully
    And I click on View product button
    Then I verify Write Your Review is visible
    And I Enter 'Tesco', 'tesco1234@email.com' and 'I like This Dress'
    And I Click on Submit button
    And I verify success message Thank you for your review.


  Scenario: Add to cart from Recommended items
    When I Scroll to bottom of page
    And I verify RECOMMENDED ITEMS are visible
    And I Click on Add To Cart on Recommended product
    And I click on View Cart button
    Then I Verify that product is displayed in cart page
