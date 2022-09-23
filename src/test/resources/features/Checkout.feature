Feature: Checkout
  Scenario: Checkout one item
    Given I am already logged in
    And Cart is empty
    And I am on the inventory page
    When I click add to cart button on the first product on the list
    And I click on cart button
    Then "Sauce Labs Backpack" is on the cart list
    When I click checkout button
    Then I am directed to checkout page
    When I input firstname with "Luqman"
    And I input lastname with "Hanung"
    And I input postal code with "57561"
    And I click on continue button
    Then summary of checkout is appear product name "Sauce Labs Backpack"
    When I click finish button
    Then checkout process completed




