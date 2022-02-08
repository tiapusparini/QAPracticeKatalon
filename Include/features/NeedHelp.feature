
@tag
Feature: Go to Help Documentation
  I'm in landing page and need help

  @tag1
  Scenario Outline: Go to Help Documentation
    Given I'm in WhatsApp Landing Page
    When I click the <value> in the lower left corner of windows
    Then I direct to this <link>

    Examples: 
      | value  										| link |
      | Need help to get started? |https://faq.whatsapp.com/web/download-and-installation/how-to-log-in-or-out?lang=en |