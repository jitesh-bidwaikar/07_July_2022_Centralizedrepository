package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	ChromeDriver driver;
	Properties pr;
	public HomePage (ChromeDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void Explorer() 
	{	
		WebElement explorer=driver.findElementByXPath(pr.getProperty("explorer"));
		explorer.click();
	}
	public void trending() 
	{
		WebElement trending=driver.findElementByXPath(pr.getProperty("Trending"));
		trending.click();
	}
	public void history() 
	{
		WebElement history=driver.findElementByXPath(pr.getProperty("history"));
		history.click();
	}
	public void subscription() 
	{
		WebElement subs=driver.findElementByXPath(pr.getProperty("subs"));
		subs.click();
	}
	public void library() 
	{
		WebElement library1=driver.findElementByXPath(pr.getProperty("Library"));
		library1.click();
	}
	public void watch() 
	{
		WebElement laterwatch=driver.findElementByXPath(pr.getProperty("watchlater"));
		laterwatch.click();
	}

}
