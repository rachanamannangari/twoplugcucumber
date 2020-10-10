package pageobjects;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Addservicepage {
	public WebDriver ldriver;

	
	By newservice=By.xpath("//span[@class='w-icons-create']");
	By clickservice=By.xpath("//a[contains(text(),'Service')]");
	By title=By.xpath("//*[@id=\"name\"]");
	By description= By.xpath("//*[@id=\"description\"]");
	By category=By.xpath("//*[@id=\"category_id-styler\"]/div[1]/div[1]");
	
	By subcategory=By.xpath("//*[@id=\"subcategory_id-styler\"]/div[1]/div[1]");
	By price=By.xpath("//*[@id=\"price\"]");
	By refund=By.xpath("//*[@id=\"slider-range-max3\"]");
	
	
	
	By creatservice= By.xpath("//*[@id=\"imagegroup\"]/div[5]/ul/li[2]/button/span");
	
	public Addservicepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	public void addservicelink()
	{
	ldriver.findElement(newservice).click();
	}
	public void clickonservice()
	{
		ldriver.findElement(clickservice).click();
		
		
	}
public void addTitle(String str)
{
	ldriver.findElement(title).sendKeys(str);
}
public void addDescription(String str)
{
	ldriver.findElement(description).sendKeys(str);
}
public void selectcategory(String str)
{
	ldriver.findElement(category).click();;
	
	ldriver.findElement(By.xpath("//li[contains(text(),'"+str+"')]")).click();
	//Select sel=new Select(ele);
	//sel.selectByVisibleText(str);
	
	//driver.findElement(By.xpath("//*[@id=\"category_id-styler\"]/div[2]/ul/li[3]")).click();
}

public void subCategory(String str)
{
//List<WebElement> list = ldriver.findElements(By.xpath("//*[@id=\"subcategory_id-styler\"]/div[2]/ul/l"));
	/*List <WebElement> list= ldriver.findElements(By.xpath("//*[@id=\\\"subcategory_id-styler\\\"]/div[2]/ul/li"));
for(WebElement e:list)
{
	if(e.getText().equals(str))
	{
		e.click();
	}
}*/
ldriver.findElement(subcategory).click();
ldriver.findElement(By.xpath(" //div[contains(text(),'"+str+"')]")).click();
	
	
}
public void price(String p)
{
	ldriver.findElement(price).sendKeys(p);
	
}
public void refund()
{
	WebElement slider=ldriver.findElement(refund);
	Actions act=new Actions(ldriver);
	act.dragAndDropBy(slider, 100, 0).build().perform();//mouse.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
}
public void refunvalid(String str)
{
	ldriver.findElement(By.xpath(" //input[@id='refund_valid']")).sendKeys(str);
}
public void clickCreate()
{
	ldriver.findElement(creatservice).click();
}

}
