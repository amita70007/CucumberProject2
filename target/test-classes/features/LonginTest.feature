@all
Feature: user long 2 in function
  @login2
  Scenario Outline: user 2 should not be able to log in with incorrect credential
    Given user is on homepage
    When User2 click on login button
    And  User2 enter <username> and <password>
    Then User2 should not be able to login

    Examples:
      | username | password |
      | test1 | password1 |
