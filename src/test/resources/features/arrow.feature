Feature: Arrow test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    When I Scroll down page to bottom
    Then I verify text 'SUBSCRIPTION'
    And Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    When I Scroll down page to the bottom
    Then I verify text 'SUBSCRIPTION'
    And I Scroll up page to top
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

