Feature: View Category And Brand Products

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: View Category Products
    When I Verify that categories are visible on left side bar
    And I Click on any category link under Women category, for example: Dress
    Then I Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    And On left side bar, click on any sub-category link of Men category
    Then I Verify that user is navigated to that category page


  Scenario: View & Cart Brand Products
    When I Click on products button
    Then I verify that Brands are visible on left side bar
    And I Click on any brand name
    Then I Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    And I Verify that user is navigated to that brand page and can see products


  Scenario: Search Products and Verify Cart After Login
    When I Click on products button
    Then I verify user is navigated to ALL PRODUCTS page successfully
    And I Enter product name in search input and click search button
    And I verify SEARCHED PRODUCTS is visible
    And I Verify all the products related to search are visible
    And I add those products to cart
    And I  Click Cart button and verify that products are visible in cart
    Then I Click 'Signup / Login' button and submit login details
    And I click on cart button on Top
    Then I verify that those products are visible in cart after login as well



