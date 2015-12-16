@acceptance

  Feature: Add items to system

    Scenario:  Add item and verify it was added
      Given I am logged into the system
      When  I go to add item page
      And   I add any item
      Then  Item should be added


