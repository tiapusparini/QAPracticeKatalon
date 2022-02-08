
@tag
Feature: Make new chat
  I will click '+' and click a name and the room will be shown

  @tag1
  Scenario Outline: Make new chat
    Given I am in home page
    When I click button plus
    And I click some name
    Then the chat will be shown

    Examples: 
      | name  | 
      | Cacuk |