
@tag
Feature: Go to Archived Messages
  I want to see archived messages and back to home page

  @tag1
  Scenario Outline: I'm already logged in and want to go to Archived Messages
    Given I'm in home page
    When I see a progress bar
    And I click button that has <value> in home page
    Then I go to archived windows
    And I go back to home page from archived

    Examples: 
      | value    |
      | Archived |
