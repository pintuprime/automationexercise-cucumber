Feature: Place Order Test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Place Order: Register while Checkout
    When I add product to cart
    And I click on cart button
    Then I verify that cart page is displayed
    And I click Proceed To Checkout
    Then I click on Register Login button
    And I Fill all details in Signup and create account
    Then I verify that 'ACCOUNT CREATED!' is visible
    And I click continue button
    And I verify  that Logged in as username is visible
    Then I click on cart button on Top
    And I click Proceed To Checkout
    Then I Verify Address Details and Review Your Order
    And I  Enter description in comment text area and click Place Order
    Then I enter payment details: 'Tesco Extra', '4545858565652525', '786', '12'
    And I click Pay and Confirm Order button
    Then I verify success message 'Congratulations! Your order has been confirmed!'
    And I Click Delete Account button
    And I verify 'ACCOUNT DELETED!' and click Continue button


    Scenario: Place Order: Register before Checkout
    When I click on 'Signup/Login' button
    And I Fill all details in Signup and create account
    Then I verify that 'ACCOUNT CREATED!' is visible
    And I click continue button
    And I verify  that Logged in as username is visible
    Then I add product to cart
    And I click on cart button
    Then I verify that cart page is displayed
    And I click Proceed To Checkout
    Then I Verify Address Details and Review Your Order
    And I  Enter description in comment text area and click Place Order
    Then I enter payment details: 'Tesco Extra', '4545858565652525', '786', '12'
    And I click Pay and Confirm Order button
    Then I verify success message 'Congratulations! Your order has been confirmed!'
    And I Click Delete Account button
    And I verify 'ACCOUNT DELETED!' and click Continue button


    Scenario: Place Order: Login before Checkout
      When I click on 'Signup/Login' button
      And I Enter correct 'tesco1422@gmail.com' and 'Tesco1234'
      And I Click login button
      And I verify  that Logged in as username is visible
      Then I add product to cart
      And I click on cart button
      Then I verify that cart page is displayed
      And I click Proceed To Checkout
      Then I Verify Address Details and Review Your Order
      And I  Enter description in comment text area and click Place Order
      Then I enter payment details: 'Tesco Extra', '4545858565652525', '786', '12'
      And I click Pay and Confirm Order button
      Then I verify success message 'Congratulations! Your order has been confirmed!'
      And I Click Delete Account button
      And I verify 'ACCOUNT DELETED!' and click Continue button


    Scenario: Remove Products From Cart
      When I add product to cart
      And I click on cart button
      Then I verify that cart page is displayed
      And I click X button corresponding to particular product
      Then I Verify that product is removed from the cart

