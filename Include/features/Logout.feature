
@tag
Feature: Logout
  I'm in home page and want to logout

  @tag1
  Scenario Outline: Logout
    Given I am in home page
    When I click button menu for logout
    And I click button logout with value <value>
    Then I verify the logout is true with <sign>

    Examples: 
      | value   | sign                              |
      | Log out | To use WhatsApp on your computer: |