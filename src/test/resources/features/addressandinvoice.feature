Feature: Verify Address And Download Invoice

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Verify address details in checkout page
    When I click on 'Signup/Login' button
    And I Fill all details in Signup and create account
    Then I verify that 'ACCOUNT CREATED!' is visible
    And I click continue button
    And I verify  that Logged in as username is visible
    Then I add product to cart
    And I click on cart button
    Then I verify that cart page is displayed
    And I click Proceed To Checkout
    Then I Verify that the delivery address is same address filled at the time registration of account
    And I Verify that the billing address is same address filled at the time registration of account
    And I Click Delete Account button
    And I verify 'ACCOUNT DELETED!' and click Continue button


    Scenario: Download Invoice after purchase order
      When I add product to cart
      And I click on cart button
      Then I verify that cart page is displayed
      And I click Proceed To Checkout
      And I Click Register Login button
      And I Fill all details in Signup and create account
      Then I verify that 'ACCOUNT CREATED!' is visible
      And I click continue button
      And I verify  that Logged in as username is visible
      And I click cart button
      Then I verify that cart page is displayed
      And I click Proceed To Checkout
      Then I Verify Address Details and Review Your Order
      And I  Enter description in comment text area and click Place Order
      Then I enter payment details: 'Tesco Extra', '4545858565652525', '786', '12'
      And I click Pay and Confirm Order button
      Then I verify success message 'Congratulations! Your order has been confirmed!'
      And I Click Download Invoice button and verify invoice is downloaded successfully
      And I click Continue button
      And I Click Delete Account button
      And I verify 'ACCOUNT DELETED!' and click Continue button