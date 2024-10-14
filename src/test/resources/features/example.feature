Feature: User Login and Purchase

  Scenario: Successful login and purchase with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    And the user adds two items to the cart
    And the user proceeds to checkout
    And the user fills in the checkout form with valid details
    Then the user should complete the purchase successfully