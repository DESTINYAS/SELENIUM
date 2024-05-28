Feature: General user view;

  Scenario: Validate user is able to view product without login or registration
    Given user navigates to online products page
    When User clicks on  formal shoes drop down
    Then User should be able to view the products