# QAPracticeKatalon

This is testing for WhatsApp Desktop Application using Katalon. The test cases was made using Cucumber format.

# Test Cases
There are seven test cases in this project.

|No| Feature         | Given         | When          | Then          |
|--| ------------- |------------- | ------------- | ------------- |
|1 | Check if im in landing page  | I navigate to WhatsApp Landing Page | I see there's a text that says "To use whatsApp on your computer:"  | I'm in the right page (landing page) |
|2 | Go to Help Documentation  | I navigate to WhatsApp Landing Page  | I click the text that says "Need Help to get started?" | I verify if the link faq is right |
|3 | Go to chat room that already in the list (Already logged in) | I navigate to WhatsApp Home Page  | I click some chat room | The chat room will be shown |
|4 | Make new chat from feature (+) (Already logged in)  | I navigate to WhatsApp Home Page  | I click button plus (+) And click some name | The chat will be shown | 
|5 | Go to Archived Messages (Already logged in)  | I navigate to WhatsApp Home Page  | I click button that has Archived value | I go to Archived windows And go back to home page |
|6 | Go to Starred Messages (Already logged in)   | I navigate to WhatsApp Home Page  | I click button menu (...) And i click starred messages in menu windows | I go to starred windows And go back to home page |
|7 | Log Out (Already logged in) | I navigate to WhatsApp Home Page  | I click button menu (...) And i click Log Out in menu windows | I verify the logout is true if there are QR Code |


# Things that should do before
1. Katalon (Run as Administrator)
2. Install WinAppDriver and run WinAppDriver.exe
4. Enable developer setting
5. Set Desired Capabilities:

   | Name | Value |
   | ---- | ----- |
   | ms:waitForAppLaunch | 50 |
   | ms:experimental-webdriver | true |
