package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage 
{
	ChromeDriver driver;
	Properties pr;
	public LogoutPage (ChromeDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void image() 
	{
		WebElement image=driver.findElementByXPath(pr.getProperty("UserImage"));
		image.click();
		
	}
	public void logout() 
	{
		WebElement logout=driver.findElementByLinkText(pr.getProperty("logout"));
		logout.click();
	}
	
}
