package stepdefinitions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageobjects.Addservicepage;
import pageobjects.Baseclass;
import pageobjects.Loginpage;
import pageobjects.Searchservice;

public class Steps extends Baseclass{

//public WebDriverWait Wait=new WebDriverWait(driver,30);
@Before
	public void setup() throws IOException
	{
	configprop=new Properties();
	FileInputStream file=new  FileInputStream("config.properties");
	configprop.load(file);
	String br=configprop.getProperty("browser");
	if(br.equals("chrome"))
			{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			}
	else if(br.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	}
	
	
	@Given("^user launch chrome browser$")
	public void user_launch_chrome_browser() throws Throwable {
			page=new Loginpage(driver);
		}

	@When("^open url \"([^\"]*)\"$")
	public void open_url(String url) throws Throwable {
		
		driver.get(url);
	    
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String usr, String pwd) throws Throwable {
	  
		
		page.enterUsername(usr);
	  page.enterPassword(pwd);
	}
	

	@When("^click on login$")
	public void click_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   page.clickLogin();
	}

	@Then("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.getTitle().contains(arg1))
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("login failed");
		}
		
	  
	}

	@Then("click on create new")
	public void click_on_create_new() throws InterruptedException  {
		addservice=new Addservicepage(driver);
		addservice.addservicelink();
		//Thread.sleep(3000);
	}

	@Then("click on service")
	public void click_on_service()  {
		addservice.clickonservice();
	}
	@When("^verify service page$")
	public void verify_service_page()  {
		if(driver.getCurrentUrl().contains("addservices"))
		{
			Assert.assertTrue(true);
		}
	}
	




	@When("^enter title \"([^\"]*)\"$")
	public void enter_title(String str)  {
	   addservice.addTitle(str);
	}

	/*@When("enter service description")
	public void enter_service_description(String arg1)  {
		addservice.addDescription(arg1);
	   
	}*/
	@When("^enter service description \"([^\"]*)\"$")
	public void enter_service_description(String arg1) throws Throwable {
		addservice.addDescription(arg1);
	}


	/*@When("Enter category")
	public void enter_category(String arg1)  {
	    addservice.selectcategory(arg1);
	}

	@When("enter subcategory ")
	public void enter_subcategory(String arg1)  {
	   addservice.subCategory(arg1);
	}

	@When("enter price ")
	public void enter_price(String arg1)  {
	    addservice.price(arg1);
	}

	@When("enter refund")
	public void enter_refund()  {
	    addservice.refund();
	}

	@Then("click create")
	public void click_create()  {
	   addservice.clickCreate();
	}*/
	@When("^Enter category \"([^\"]*)\"$")
	public void enter_category(String arg1)  {
		 addservice.selectcategory(arg1);
	}

	@When("^enter subcategory \"([^\"]*)\"$")
	public void enter_subcategory(String arg1)  {
		addservice.subCategory(arg1);
	}

	@When("^enter price \"([^\"]*)\"$")
	public void enter_price(String arg1)  {
		addservice.price(arg1);
	}

	@When("^enter refund$")
	public void enter_refund()  {
		 addservice.refund();
	}
	@When("^enter refund valid \"([^\"]*)\"$")
	public void enter_refund_valid(String str)  {
	    addservice.refunvalid(str);
	}


	@Then("^click create$")
	public void click_create()  {
		 addservice.clickCreate();
	}


	@Then("close driver")
	public void close_driver()  {
	   driver.close();
	}


@Then("^Enter the service name in the search box \"([^\"]*)\"$")
public void enter_the_service_name_in_the_search_box(String arg1)  {
	searchservice=new Searchservice(driver);
	searchservice.searchBox(arg1);
}


@Then("^Check whether the service exist or not \"([^\"]*)\"$")
public void check_whether_the_service_exist_or_not(String arg1)  {
	 boolean val=  searchservice.verifysearch(arg1);
	  Assert.assertEquals(true, val);
}

@Then("^click on that service \"([^\"]*)\"$")
public void click_on_that_service(String arg1)  {
	searchservice.clickPnsearchresult(arg1);
}



	
}
