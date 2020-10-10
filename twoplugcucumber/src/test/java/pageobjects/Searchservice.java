package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Searchservice {

	
	WebDriver ldriver;
	By searchbox= By.xpath("//input[@id='exampleInputAmount']");
	By table=By.xpath("//body/div[7]/div[1]/div[2]/div[1]/table[1]");
	
	
	By creatservice= By.xpath("//*[@id=\"imagegroup\"]/div[5]/ul/li[2]/button/span");
	
	public Searchservice(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	public void searchBox(String str)
	{
		ldriver.findElement(searchbox).sendKeys(str);
		ldriver.findElement(searchbox).sendKeys(Keys.ENTER);
	}
	public boolean verifysearch(String str)
	{
	int n =ldriver.findElements(By.xpath("//tbody/tr")).size();
	boolean flag=false;
	for(int i=1;i<=n;i++)
	{
	String act=	ldriver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/div[1]/div[2]/div[1]/a[1]")).getText();///tbody/tr[1]/td[1]/div[1]/div[2]/div[1]/a[1]
	System.out.println("Actual value is " +act);
	if(act.equalsIgnoreCase(str))
	{
		flag=true;
		break;
	}

	}
	return flag;

	}


	public void clickPnsearchresult(String str)
	{
		
		int n =ldriver.findElements(By.xpath("//tbody/tr")).size();
		for(int i=1;i<=n;i++)
		{
		String act=	ldriver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/div[1]/div[2]/div[1]/a[1]")).getText();
		if(act.equalsIgnoreCase(str))
		{
			ldriver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/div[1]/div[2]/div[1]/a[1]")).click();
			break;
		}

		}
		ldriver.close();
	}
	
}
