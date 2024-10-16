Feature: User Login and Purchase with Outlines

  Background:
    Given the user is on the login page

  Scenario Outline: Successful login and purchase with valid credentials
    When the user enters <username> and <password>
    And the user adds two items to the cart
    And the user proceeds to checkout
    And the user fills in the checkout form with valid details
    Then the user should complete the purchase successfully

    Examples:
      | username                       | password     |
      | standard_user                  | secret_sauce |
      | performance_glitch_user        | secret_sauce |