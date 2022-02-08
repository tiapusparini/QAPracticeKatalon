
@tag
Feature: Go to chat room that already in the list

  @tag1
  Scenario Outline: Go to chat room
    Given I am in home page
    When I click some chat room
    Then the chat room will be shown

    Examples: 
      | name  | 
      | Cacuk |