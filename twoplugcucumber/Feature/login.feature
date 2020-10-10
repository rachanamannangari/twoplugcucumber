Feature: Login
Scenario: Successful login with valid credential
Given user launch chrome browser
When open url "https://qatest.twoplugs.com/login"
And user enters username as "polaris" and password as "test2plug"
And click on login
Then page title should be "twoPLUGS"
#When click logout link
#Then page title should be "twoPLUGS - A plug for your Service and another for your Need"

Scenario Outline: Login datadriven
Given user launch chrome browser
When open url "https://qatest.twoplugs.com/login"
And user enters username as "<username>" and password as "<password>"
And click on login
Then page title should be "twoPLUGS"
Examples:  
           | username | password |
           | rachana | csawer |
          | thyadf |  twoplug |

  

