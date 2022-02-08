
@tag
Feature: Landing Page
  Check if this is the right landing page

  @tag1
  Scenario Outline: Check if this is a landing page
    Given I navigate to WhatsApp Landing Page
    When I see there is a <value> in this page
    Then I verify this is a Landing page
    
    
	Examples:
	| value |
	| To use WhatsApp on your computer:  |
	