Feature: New user registration;

  Scenario: Validate user is able to register
    Given user navigates to login page
    When User clicks on new registration button
    Then User should be able to view the registration page