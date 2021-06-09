@all
  Feature: user long in function
    @login
    Scenario Outline: user should not be able to log in with incorrect credential
      Given user is on homepage
      And User click on login button
      When User enter "<username>" and "<password>"
      Then User should not be able to login

      Examples:
        | username | password |
        | jamestest123@test.com | test123 |
        | jamestest1234@test.com| test123 |
        | kamestest1234@test.com | test123 |
