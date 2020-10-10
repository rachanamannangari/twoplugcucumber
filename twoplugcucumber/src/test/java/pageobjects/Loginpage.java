package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='signInEmail']")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="/html/body/div[7]/div/form/div[5]/ul/li[2]/button/span")
	WebElement loginbutton;
	public Loginpage(WebDriver driver)
	{
		//ldriver=rdriver;
		PageFactory.initElements(driver, this);
		
	}

public void enterUsername(String usr)
{
	username.clear();
	username.sendKeys(usr);
}
public void enterPassword(String pwd)
{
	password.clear();
	password.sendKeys(pwd);
}
public void clickLogin()
{
	loginbutton.click();
}
}

