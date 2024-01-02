Feature: Subscription Test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Verify Subscription in home page
    When I scroll down to footer
    And I verify text 'SUBSCRIPTION'
    And I Enter 'tescoextra456@gmail.com' address in input and click arrow button
    Then I verify that success message 'You have been successfully subscribed!' is visible


    Scenario: Verify Subscription in Cart page
      When I click 'cart' button
      And I scroll down to footer
      And I verify text 'SUBSCRIPTION'
      And I Enter 'tescoextra456@gmail.com' address in input and click arrow button
      Then I verify that success message 'You have been successfully subscribed!' is visible