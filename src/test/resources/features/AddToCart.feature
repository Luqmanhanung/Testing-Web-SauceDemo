Feature: Add to Cart
  Scenario: add one product to cart
    Given I am already logged in
    When I select item "add-to-cart-sauce-labs-fleece-jacket"
    Then Add to Cart button change to be Remove Button
