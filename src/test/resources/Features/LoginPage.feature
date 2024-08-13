@FirstFeature
Feature: Login Page Feature

  @LoginPositive
  Scenario: Login Page Test Case Positive
    Given user is on Login Page
    When click Login Button on Login Page
    When sendkeys username to usernamebox on Login Page
    Then should see image on Login Page

  @LoginNegative
  Scenario: Login Page Test Case Positive
    Given user is on Login Page
    When click Login Button on Login Page
    When sendkeys username to usernamebox on Login Page
    Then should see image on Login Page