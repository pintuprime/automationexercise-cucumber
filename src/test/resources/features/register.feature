Feature: Register and Login Test

  Background: I launch the browser and navigate to url
    Given I verify that Home page is visible successfully
    Then I click on 'Signup/Login' button


  Scenario: Register user
    When I verify 'New User Signup!' is visible
    And I enter 'Tesco' and 'tescoextra186@gmail.com' address
    And I click Signup button
    Then I verify that 'ENTER ACCOUNT INFORMATION' is visible
    And I fill details: 'Mr.', 'Tesco', 'tescoextra186@gmail.com', 'Tesco953', '23', 'December', '1995'
    And I Select checkbox 'Sign up for our newsletter!'
    And I Select checkbox 'Receive special offers from our partners!'
    And I Fill details: 'Tesco', 'Extra', 'Tesco Plc', '101 Close Avenue', 'Nagra', 'India', 'Gujarat', 'Khambhat', '388170', '07985456321'
    And I click Create Account button
    Then I verify that 'ACCOUNT CREATED!' is visible
    And I click continue button
    And I verify  that Logged in as username is visible
    And I click Delete Account button
    And I verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button


  Scenario: Login User with incorrect email and password
    When I verify Login to your account is visible
    And I Enter correct 'pravin555@gmail.com' and 'pravin1234'
    And I Click login button
    Then I verify error 'Your email or password is incorrect!' is visible


  Scenario: Logout User
    When I verify Login to your account is visible
    And I Enter correct 'tescoextra555@gmail.com' and 'Tesco999'
    And I Click login button
    Then I verify Logged in as username is visible
    And I click Logout button
    Then I verify that user is navigated to login page


  Scenario: Register User with existing email
    When I verify 'New User Signup!' is visible
    And I enter 'Tesco' and 'tescoextra555@gmail.com' address
    And I click Signup button
    Then I verify error Email Address already exist! is visible

  Scenario: Login User with correct email and password
    When I verify Login to your account is visible
    And I Enter correct 'tescoextra555@gmail.com' and 'Tesco999'
    And I Click login button
    Then I verify Logged in as username is visible
    And I Click Delete Account button
    And I verify 'ACCOUNT DELETED!' and click Continue button





