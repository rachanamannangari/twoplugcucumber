Feature: Add Service
Background: below are comon steps for all the scanario
Given user launch chrome browser
When open url "https://qatest.twoplugs.com/login"
And user enters username as "polaris" and password as "test2plug"
And click on login
Then page title should be "twoPLUGS"
@sanity
Scenario: Add new srvice
Then click on create new

Then click on service
When verify service page 
And enter title "dogwalker"
And enter service description "testing"
And Enter category "Animals & Agriculture"
And enter subcategory "All"
And enter price "50"
And enter refund 
And enter refund valid "5"
Then click create
And close driver
@regression
Scenario: search for service
Then Enter the service name in the search box "car wash"
And Check whether the service exist or not "CAR WASH"
And click on that service "CAR WASH"