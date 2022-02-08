
@tag
Feature: See Starred Messages 
  I want to see starred messages in menu option

  @tag1
  Scenario Outline: See Starred Messages 
    Given I am in home page
    When I click button menu
    And i click button <value>
    Then I go to starred windows
    And I go back to home page from star

    Examples: 
      | value  | 
      | Starred messages |