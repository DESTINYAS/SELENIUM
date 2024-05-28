Feature: LoggedIn user;

  Scenario: Validate user is able to login
    Given user navigates to login page
    When user successfully enters login details
    Then user should be able to view the products page