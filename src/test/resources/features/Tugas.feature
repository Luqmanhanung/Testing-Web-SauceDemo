Feature: Tugas Automation Testing on saucedemo.com
  Scenario: Testing on inventory page and cart page
    Given I am already logged in
    And I am already add one product on cart
    And I am on the inventory page
    When I sort the product by "Name (Z to A)"
    Then Sort menu show "Name (Z to A)"
    When I click add to cart button on the first product on the list
    And I click on cart button
    Then I am directed to cart page
    And The selected product appears in cart list
    When I click on remove button on the first product item added in the cart list
    #Then The first product item added on cart list is diappear
    And I click on continue shopping button
    Then I am redirected back to the inventory page