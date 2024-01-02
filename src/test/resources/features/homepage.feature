Feature: HomePage Tabs test

  Background: I launch browser and navigate to Url
    Given I verify that Home page is visible successfully


  Scenario: Contact Us Form
    When I Click on Contact us button
    Then I verify that GET IN TOUCH is visible
    And I enter 'Tesco', 'tesco456@gmail.com', 'No Alert', 'Please Update'
    And I upload file
    And I click on submit button
    Then I click OK button
    And I verify success message 'Success! Your details have been submitted successfully.' is visible
    Then I click Home button and verify that landed to home page successfully


  Scenario: Verify Test Cases Page
    When I Click on Test Cases button
    Then verify user is navigated to test cases page successfully


      
