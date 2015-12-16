@acceptance
Feature: Login to system

  In order to login to application
  user should enter correct login and password



  Scenario: Successfully login to application
    Given I am on login page
    When I enter correct credentials
    Then I should be signed in



    Scenario: Successfully logout from system
      Given I am logged into the system
      When I logout from system
      Then I am logged out


    Scenario: Successfully logout from system begin logged as specified user
      Given I am logged into the system as user "<login>" with password "<password>"
      When I logout from system
      Then I am logged out

    Examples:
      |login  |password|
      |artur  |123456  |
      |michal |654321  |
      |artur  |123     |