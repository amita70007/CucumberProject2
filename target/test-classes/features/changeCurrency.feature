@all
  Feature: Change currency
    @test3
    Scenario: User should able to change currency for all products successfully
      Given user is on homepage
      When user select currency
      Then user should able to change currency for all products successfully