@all
Feature: Buy product successfully
  @test4
  Scenario: Register user should able to buy books product successfully
    Given user is on register page
    When user enters all required registration details
    And user click on register
    And user click on continue
    And user click on books
    And user select First Prize Pies book product
    And user click on add to cart button
    And user click on shopping cart
    And user click on checkout
    And User enter billing details and click continue
    And User select shipping option and click continue
    And User select credit card and click continue
    And user enter all visa card details and click continue
    And User click on confirmation
    Then user should able to buy book product successfully
