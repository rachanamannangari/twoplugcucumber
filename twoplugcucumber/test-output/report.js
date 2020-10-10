$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/BIJOY/Desktop/busyqa%20course%20work/eclipse/twoplugcucumber/Feature/Addservicepage.feature");
formatter.feature({
  "name": "Add Service",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "below are comon steps for all the scanario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open url \"https://qatest.twoplugs.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.open_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"polaris\" and password as \"test2plug\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"twoPLUGS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new srvice",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "click on create new",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_create_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on service",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_service()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify service page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.verify_service_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter title \"dogwalker\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter service description \"testing\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_service_description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter category \"Animals \u0026 Agriculture\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter subcategory \"All\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_subcategory(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter price \"50\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_price(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter refund",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_refund()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter refund valid \"5\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_refund_valid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click create",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close driver",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "below are comon steps for all the scanario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open url \"https://qatest.twoplugs.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.open_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"polaris\" and password as \"test2plug\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"twoPLUGS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "search for service",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Enter the service name in the search box \"car wash\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.enter_the_service_name_in_the_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check whether the service exist or not \"CAR WASH\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.check_whether_the_service_exist_or_not(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on that service \"CAR WASH\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_that_service(String)"
});
formatter.result({
  "status": "passed"
});
});